//boolean
let presenza = false;
//char --> String
let genere = "m"

//Recupero il tag p id="numStud" per poter scriverci dentro
let numStud = document.getElementById("numStud");
console.log(numStud);
let partecipanti = prompt("Quanti studenti sono presenti oggi?");

//scrivo dentro numStud, ovvero modifico la proprietà testuale di numStud

numStud.textContent = "Num Studenti presenti: " + partecipanti;

