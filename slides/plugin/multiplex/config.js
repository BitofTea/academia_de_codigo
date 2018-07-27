(function() {

    // Enables multiplex, blocking the clients keyboard.
    // Presentation master must have a token which will be used
    // as an argument for 's' in the query string
    Reveal.getConfig().multiplex = {
        lisboa: {
            url: 'http://socketio.academiadecodigo.org:1948',
            id: '907872b700b886a4',
            secret: Reveal.getQueryHash().s || null
        },
        fundao: {
            url: 'http://socketio.academiadecodigo.org:1949',
            id: '907872b700b886a4',
            secret: Reveal.getQueryHash().s || null
        },
        terceira: {
            url: 'http://socketio.academiadecodigo.org:1950',
            id: '907872b700b886a4',
            secret: Reveal.getQueryHash().s || null
        }
    };

}());
