const URL = "http://localhost:3000/users"


let btn = document.querySelector('#btn')
let registraUsers = document.querySelector('#registraUsers')

fetch(URL)
    .then(data => { return data.json() })
    .then(response => {
        console.log(response);

        
    })

function caricaUsers() {
    let nome = document.querySelector('#nome');
    let cognome = document.querySelector('#cognome');
    let email = document.querySelector('#email');
    let codiceFisc = document.querySelector('#codiceFisc');
    let select = document.querySelector('#select');

    let nuovoUser = {
        nome: nome.value,
        cognome: cognome.value,
        email: email.value,
        codice_fiscale: codiceFisc.value,
        titolo: select.value
    }

    fetch(URL,{
        method:"POST",
        headers: {"Content-type":"application/json"},
        body: JSON.stringify(response.statusCode, "Registrazione andata con successo")
    })

}

form.addEventListener('submit', caricaUsers);