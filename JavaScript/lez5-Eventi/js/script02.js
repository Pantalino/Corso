let studente = {
    nome: "Dario",
    cognome: "Pantaleo",
    matricola: 7
}

let btn = document.querySelector('#btn');
let btnOut = document.querySelector('#btnOut');

function caricaStud(){

        //per poter salvare in local o session storage devo trasformalo in JSON(oggetto in string)
    let studJSON = JSON.stringify(studente);

    //il setItem(chiave: string, valore: studJSON)
    localStorage.setItem("studente", studJSON);

}

function logOut(){

    localStorage.removeItem("studente")
}

btn.addEventListener('click', caricaStud);
btnOut.addEventListener('click', logOut);