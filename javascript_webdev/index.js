var element = document.getElementById('load-customers-btn');
element.addEventListener('click', loadCustomers);
element.addEventListener('mousemove', function (e) {
    console.log(e);


});


function loadCustomers() {
    fetch('https://javabank.herokuapp.com/api/customer')
        .then(function (response) {

            return response.json();
        })

        .then(function (json) {
            console.log(json);
            populateTable('customer-table', json);
        });
}

function populateTable(id, customers) {
    var table = document.getElementById(id);


    customers.forEach(function (customer) {
        var row = table.insertRow(-1);
        row.innerHTML = `<td>${customer.id}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.firstName}</td>
                    <button id="load-customers-data">details</button><td></td>`
    });
}

function detailsTable() {
    var data = document.getElementById("details");
    row.innerHTML = `<td>${customer.accountType}</td>
    <td>${ customer.balance}</td>`
}




