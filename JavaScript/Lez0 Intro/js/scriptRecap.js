let mioNome = "Dario";
var mioCognome = "Panta";
let corso = 'Javascript';
let annoCorso = 2023;
let presenza = true;

console.log("Ciao " +mioNome);

let nomeUser = prompt("come ti chiami?")

console.log("ciao utente " + nomeUser);

//scrivo all'interno di saluto
let saluto = document.getElementById("saluto")
//scrivo all'interno di saluto
saluto.textContent = "Benvenuto " + nomeUser;