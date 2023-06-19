// oggetto con notazione letterale
let studente = {
    nome: "Dario",
    cognome: "Pantaleo",
    matricola: 123,
    promosso: true,
    corso: "",

    //dichiaro un metodo
    superEsame: function () {
        //console.log('Hai superato l\'esame');
        return "Hai superato l'esame"
    },

    //forma compatta
    presentati() {
        //console.log("Ciao mi chiamo " + this.nome);
        let presentazione = "Ciao mi chiamo " + this.nome;
        return presentazione

    },

    //creo un metodo per definire quel corso
    assegnaCorso(corso) {
        this.corso = corso;

        return "Hai appena assegnato " + corso + " allo studente " + this.nome;
    }

}

// console.log(studente.corso);
// console.log(studente.assegnaCorso("Tecniche di programmazione"));

let nome = document.getElementById("nome");
let cognome = document.getElementById("cognome");
let corso = document.getElementById("corso");
let btn = document.getElementById("btn");

function stampaInfo() {
    nome.innerHTML = "nome: " + studente.nome;
    cognome.innerHTML = "cognome: " + studente.cognome;
if(studente.corso == ""){
    
    corso.innerHTML = "corso non ancora assegnato " ;
}else{
    corso.innerHTML = "corso: " + studente.corso
}

}

function assegnaCorso(){
    let nomeCorso = document.getElementById("nomeCorso").value;
    studente.assegnaCorso(nomeCorso);
    stampaInfo();
}

btn.addEventListener("click", assegnaCorso);
stampaInfo();
