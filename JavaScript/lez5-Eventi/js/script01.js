let btnSaluta = document.querySelector("#btnSaluta");
let btnSalutaStudente = document.querySelector("#btnSalutaStudente");
let btnSalutaQualcuno = document.querySelector("#btnSalutaQualcuno");
let btnSalutaUser = document.querySelector("#btnSalutaUser");
let nomeUser = document.querySelector("#nomeUser");
let demo = document.querySelector("#demo")



function saluta(){
    demo.innerHTML = "Ciao";
}


//per richiamare la funzione saluta al sul pulsante non devo utilizzare le parentesi tonde
btnSaluta.addEventListener("click", saluta);
////////////////////////////////////////////////////////////////////////////////////////////////
//Quando la funzione da richiamare ha dei parametri devo utilizzare la funzione anonima all'interno del addEvent


function salutaStudente(nomeStudente){
    demo.innerHTML = "Ciao, " + nomeStudente;
}


btnSalutaStudente.addEventListener("click", function(){
    salutaStudente("Dario")
} );

/////////////////////////////////////////////////////////////////////////////////

btnSalutaQualcuno.addEventListener("click", function(){
let nomeQualcuno = "nessuno";

demo.innerHTML = "Ciao " + nomeQualcuno;
});

/////////////////////////////////////////////////////////////////////////////////////

//Saluta User
//V1

// function salutaUser(username){
//     demo.innerHTML = "Ciao " + username;
// }

// btnSalutaUser.addEventListener("click", function(){
//     let username = document.querySelector("#nomeUser").value;

//     salutaUser(username);
// })

//V2



// btnSalutaUser.addEventListener("click", function(){
//     let username = document.querySelector("#nomeUser").value;

//     if(username == ""){
//         demo.innerHTML = "Inserisci nome"
//     }else{
//         demo.innerHTML = "Ciao " + username;
//     }
    
// })


//v3

let username = document.querySelector("#nomeUser");

function salutaUser(username){

    // let username = username.value;
    demo.innerHTML = "Ciao " + username
}

btnSalutaUser.addEventListener("click", function(){
    let nomeUser = username.value
    salutaUser(nomeUser);
})

username.addEventListener("keyup", function(){

    console.log(event.target);
    if(event.key == "Enter"){
        let nomeUser = username.value;
        salutaUser(nomeUser);
    }
});
