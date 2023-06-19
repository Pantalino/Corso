let studenti = [
    "Anna Rossi",
    "Paolo verdi",
    "Luca Bianchi",
    "Maria Gialli",
    "Ciro Neri",
    "Laura Arancio"
];

let voti = [
    30,
    28,
    15,
    14,
    22,
    26
];

//se lo studente supera l'esame mostro il voto altrimenti "non superato"

//1. Step -> Stampo i nomi e i voti

let listaStudenti = document.getElementById("listaStud");
let mediaVoti = document.getElementById('mediaVoti');
let somma = 0;


for (let i = 0; i < studenti.length; i++) {

    somma += voti[i];

    if (voti[i] < 18) {
        //listaStudenti.innerHTML += "<li>" + studenti[i] + "<span class='txtred'> Esame non superato</span></li>"
        listaStudenti.innerHTML += `
        <li>
        ${studenti[i]}<span class='txtred'> Esame non superato </span>
        </li>`;
    } else {
        //listaStudenti.innerHTML += "<li>" + studenti[i] + " " + voti[i] + "</li>"
        listaStudenti.innerHTML += `<li> ${studenti[i]} ${voti[i]}</li>`;

        // let votazione;

        // if(voti[i]<18){
        //     votazione = "Esame nopn superato"
        // }else{
        //     votazione = voti[i]
        // }
        // listaStudenti.innerHTML += "<li>" + studenti[i] + " " + votazione + "</li>";



    }
}

let media = somma / studenti.length;

mediaVoti.innerHTML = "Media Voti esami " + media;
//mediaVoti.innerHTML = "Media Voti esami " + media.toFixed(1);
//mediaVoti.innerHTML = "Media Voti esami " + Math.round(media);

