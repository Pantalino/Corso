let formLogin = document.querySelector('#formLogin');

function login(){
    //la funziona registrerà l'utente in local o session storage
    let username = document.querySelector('#username').value;

    if(username == ''){
        event.preventDefault();
    }
}

formRefistrazione.addEventListener('submit', login)