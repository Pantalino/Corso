let annoNascita = document.getElementById('annoNascita');
let avviso = document.getElementById('avviso');
let annoCorrente = 2023;
let annoN = prompt("Qual'è la tua data di nascita?");
let annoDato = annoCorrente - annoN;


if(annoDato <= 23){
    annoNascita.setAttribute("class", "txtBlue");
    annoNascita.textContent = "Sei nato negli anni 2000 e hai " + annoDato + " anni";
}else if(annoDato >= 100){
annoNascita.setAttribute("class", "txtOrange");
annoNascita.textContent = "Complimenti hai superato 100 anni" 
}else{
    annoNascita.setAttribute("class", "txtGreen");
    annoNascita.textContent = "Sei nato negli anni 90 hai "  + annoDato + " anni"
    
}