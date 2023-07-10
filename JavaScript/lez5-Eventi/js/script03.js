function Utente(username, password, conn){
    this.username = username;
    this.password = password;
    this.conn = conn;
}

let formLogin = document.querySelector('#formLogin');
let demo = document.querySelector('#demo');



function login(){
    //la funziona registrerà l'utente in local o session storage
    let username = document.querySelector('#username').value;
    let password = document.querySelector('#password').value;
    let conn = document.querySelector('#checkRestaConn');

    let usernameUtente = "";
    let passwordUtente = "";
    let connUtente = false;

    if(username.trim() == ""){
        event.preventDefault();//blocca l'evento
        console.log(event);
        demo.innerHTML += "Hai dimenticato lo username <br>";
        //document.querySelector('#username').focus;
    }else{
        usernameUtente = username;
    }

    if(password.trim() == ""){
        event.preventDefault();
        demo.innerHTML += "Hai dimenticato la password <br>";
        //document.querySelector('#password').focus;
    }else{
        passwordUtente = password;
    }

    if(conn.checked == true){
        connUtente = true;
    }

    if(username != "" && password != "" && connUtente == true){
        let mioUtente = new Utente(usernameUtente, passwordUtente, connUtente);

        localStorage.setItem("utente", JSON.stringify(mioUtente));
        
    }
}

formLogin.addEventListener('submit', login)