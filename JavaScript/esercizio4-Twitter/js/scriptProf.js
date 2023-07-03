let messaggio = document.querySelector("#messaggio");
let btn = document.querySelector("#btn");
let elDemo = document.querySelector("#elDemo");

btn.addEventListener("click", function(){
    stampaMessaggio
});

function stampaMessaggio() {
    let testoInserto, carRes, counter;

testoInserto = document.querySelector("#messaggio").value;

elDemo.innerHTML = "<p>" + testoInserto + "</p>";
}

function contaCar(){
    let testoInserto = document.querySelector("#messaggio").value;

    let counter = (128 - testoInserto.length);

    elCarResidui.innerHTML = counter;

    if(counter <= 0){
        
    }
}