let formLogin = document.querySelector('#formLogin');

function login(){
    //la funziona registrerà l'utente in local o session storage
    let username = document.querySelector('#username').value;
    let password = document.querySelector('#password').value;

    if(username == "" && password ""){
        event.preventDefault();
    }
}

formLogin.addEventListener('submit', login)