function moltiplica(num1,num2){
    return num1*num2
}
function dividi(num1,num2){
    return num1/num2
}

function somma(num1,num2){
    
    return Number(num1)+Number(num2);
}
function sottrai(num1,num2){
    
    return Number(num1)-Number(num2);
}

let demo = document.getElementById("demo");
function calcola(){

    //recupero il value del campo input, cioè quello che scrive l'utente
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);

   demo.innerHTML = "La moltplicazione vale "+ moltiplica(num1,num2) + "<br>";
   demo.innerHTML += "La divisione vale "+ dividi(num1,num2).toPrecision(3) + "<br>";
   demo.innerHTML += "La sottrazione vale "+ sottrai(num1,num2) + "<br>";
   demo.innerHTML += "La somma vale " + somma(num1,num2);

   

}



let btn = document.getElementById("btn");

//in questo caso la funzione non ha le parentise tonde
btn.addEventListener("click", calcola)