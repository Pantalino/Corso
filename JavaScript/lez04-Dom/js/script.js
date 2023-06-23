//querySelector("cssSelector") -> restituisce 1 solo elemento
let uno = document.querySelector("#uno");
console.log(uno);
//anche passando una classe mi restituisce il primo, la prima occorrenza

let listaSpesa = document.querySelector("#listaSpesa");
console.log(listaSpesa);


//voglio prendere tutti gli li
//querySelectorAll restituisce una nodelist
let lis = document.querySelectorAll("li");
console.log(lis);

//voglio tutti gli li della listaeccommerce
let lisEc = document.querySelectorAll("#liistaEcommerce li.txtRed");
console.log(lisEc);

//voglio recupeare tutti gli li della lista spesa
let listaSpesaAlt = document.querySelector("listaSpesa");
let lilistaSpesaAlt = document.children;

let primoFglioEc = document.querySelector("#listaEcommerce").firstElementChild.firstChild;
console.log(primoFglioEc);

let ultimoFiglioEc = document.querySelector("#listaEcommerce").children;
console.log(ultimoFiglioEc[ultimoFiglioEc.length - 1]);

let listaEccommerce2 = document.querySelector("#listaEcommerce").children;
let ultimoFiglio = listaEccommerce2[listaEcommerce2.length - 1];
let primoFglio = listaEccommerce2[0];
console.log(ultimoFiglio);
console.log(primoFiglio);


