(function() {
    'use strict';
    var config = Reveal.getConfig().boundaries;

    if (!config) {
        return;
    }

    loadScript('plugin/hide-slides/nanoajax.js', 'script', function() {
        var bootcamp = config.bootcamps.find(function(bootcamp) {
            return window.location.href.match(bootcamp.name);
        });

        if (!bootcamp) {
            throw Error(
                'location not found, please insert a valid limits array in Reveal.initialize'
            );
        }

        var boundaryUrl =
            'https://jetbrains.academiadecodigo.org/api/bootcamp/' +
            bootcamp.id +
            '/' +
            'sections/' +
            config.section;

        nanoajax.ajax(
            {
                url: boundaryUrl
            },
            function(code, response) {
                var boundary = JSON.parse(response);
                if (!boundary.horizontal_boundary || !boundary.vertical_boundary) {
                    throw Error('boundary is not an valid object');
                }
                setBoundary(boundary);
            }
        );
    });

    function setBoundary(boundary) {
        console.log(
            'Configured limits are: ' +
                boundary.horizontal_boundary +
                '/' +
                boundary.vertical_boundary
        );
        Reveal.addEventListener('slidechanged', function(event) {
            if (event.indexh > boundary.horizontal_boundary - 1) {
                Reveal.slide(boundary.horizontal_boundary - 1);
                return;
            }
            if (
                event.indexh === boundary.horizontal_boundary - 1 &&
                event.indexv > boundary.vertical_boundary - 1
            ) {
                Reveal.slide(boundary.horizontal_boundary - 1, boundary.vertical_boundary - 1);
            }
        });
    }

    // modified from math plugin
    function loadScript(url, type, callback) {
        var head = document.querySelector('head');
        var resource = document.createElement('script');
        resource.type = 'text/javascript';
        resource.src = url;

        // Wrapper for callback to make sure it only fires once
        var finish = function() {
            if (typeof callback === 'function') {
                callback.call();
                callback = null;
            }
        };

        resource.onload = finish;

        // IE
        resource.onreadystatechange = function() {
            if (this.readyState === 'loaded') {
                finish();
            }
        };

        // Normal browsers
        head.appendChild(resource);
    }
})();
