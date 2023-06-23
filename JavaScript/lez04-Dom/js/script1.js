//i film vanno in blue, i libri in rosso
let libri = document.querySelectorAll("#listaLibri li");//nodelist, tipo un array

// for(let i = 0; i < libri.length; i++){
//     libri[i].setAttribute("class","txtRed");
// }


libri.forEach(libro =>{
    libro.setAttribute("class", "txtRed")
})


let films = document.querySelector("#listaFilm").children;//collection
console.log(films);

// for (let i = 0; i < films.length; i++) {
//     films[i].setAttribute("class", "txtBlue");
    
// }

[...films].forEach(film =>{
    film.setAttribute("class", "txtBlue")
})


