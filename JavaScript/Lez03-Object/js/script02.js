// oggetto con notazione letterale
let studente = {
    nome: "Dario",
    cognome: "Pantaleo",
    matricola: 123,
    promosso: true,

    //dichiaro un metodo
    superEsame: function () {
        //console.log('Hai superato l\'esame');
        return "Hai superato l'esame"
    };

    //forma compatta
    presentati() {
        //console.log("Ciao mi chiamo " + this.nome);
        let presentazione = "Ciao mi chiamo " + this.nome;
        return presentazione

        assegnaMaterie(mat1, mat2){
            let elencoMaterie = [mat1, mat2];

            if(mat1 == "" || mat2 == ""){
                return "Guardi che non hai assegnato una materia, questo ne ha 2"
            }else{
                return elencoMaterie
            };
        };


        // assegnaMaterie(mat1, mat2){
        //     let elencoMaterie = [ma1, mat2];
        //     return elencoMaterie;
        // }

    };
}

//accedo alle proprietà
console.log(studente.nome);
console.log(studente.cognome);
console.log(studente.matricola);

studente.presentati();

console.log(studente.presentati());
console.log(studente.superEsame());

console.log(studente.assegnamaterie("Java", "Angular"));