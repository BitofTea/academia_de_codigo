var element = document.getElementById('backButton');
element.addEventListener("click", loadCustomers);

loadCustomers();

function loadCustomers(){
    fetch('https://javabank.herokuapp.com/api/customer')
    .then(function(response){
        console.log('got reponse:');
        console.log(response);
        return response.json();
    })
    .then(function(json){
        console.log(json);
        
        var main = document.getElementById('main');

        while (main.firstChild) {
            main.removeChild(main.firstChild);
        }

        var table = document.createElement("table");

        main.appendChild(table);
        table.setAttribute("id", "tabelinha");

        populateTable("tabelinha", json);

    });
}

function loadDetails(id){
    fetch('https://javabank.herokuapp.com/api/customer/'+ id +'/account')
    .then(function(response){
        console.log('got reponse:');
        console.log(response);
        return response.json();
    })
    .then(function(json){
        console.log(json);

        var oldTable = document.getElementById("tabelinha");
        oldTable.parentNode.removeChild(oldTable);

        var main = document.getElementById('main');

        var table = document.createElement("table");
        main.appendChild(table);
        table.setAttribute("id", "tabelinha");

        populateCustomer('tabelinha', json);
    });
}

function populateTable(id, customers){
    var table = document.getElementById(id);

    var col = table.insertRow(0);
    col.innerHTML = `<tr>
                    <th>firstName</th>
                    <th>lastName</th>
                    <th>Details</th>
                    </tr>`

    customers.forEach(function(customer){
        var row = table.insertRow(-1);
        row.innerHTML = `<td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <button id="customerDetails${customer.id}">Load DATA</button>`;
    });
    customers.forEach(function(customer){
        var element = document.getElementById('customerDetails' + customer.id);
        element.addEventListener('click', () => loadDetails(customer.id));
    });
}

function populateCustomer(id, accounts){
    var table = document.getElementById(id);

    var col = table.insertRow(0);
    col.innerHTML = `<tr>
                    <th>ID</th>   
                    <th>AccountType</th>
                    <th>Balance</th>
                    </tr>`


    accounts.forEach(function(account){
        var row = table.insertRow(-1);
        row.innerHTML = `<td>${account.id}</td>
                         <td>${account.type}</td>
                        <td>${account.balance}</td>`;
    });
}