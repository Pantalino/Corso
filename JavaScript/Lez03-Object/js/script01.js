//OBJ BUILT IN

//DOM = Document Object moel
let documento = document;
console.log(documento);

//Stringhe

let stringa1 = "Ciao come stai, io ho caldo!!!"

let numCar = stringa1.length
console.log(numCar);

console.log(stringa1.toUpperCase());

let subStr = stringa1.substring(2,18);
console.log(subStr);

//splitta una stringa in base ad un pattern
let split = stringa1.split(" ");
console.log(split);

//riassemblo l'array in stringa
//join si applica sugli array
let join = split.join("_");
console.log(join);

let colori = ["blue","green","red","orange"]
let joinCol = colori.join(" ");
console.log(joinCol);


//indeoOf() restituisce l'indice della prima occorrenza
let search1 = stringa1.indexOf("stai");
console.log(search1);


let search2 = stringa1.indexOf("Dario");
console.log(search2);//-1

//includes vale sia per stringhe che per array
let search3 = stringa1.includes("caldo");
console.log(search3);

let search4 = stringa1.includes("Dario");
console.log(search4);

////////////////////////////////////////////////////

let a = Math.abs(-20);
console.log(a);

let b = Math.sqrt(9);
console.log(b);

let c = Math.pow(8,2);
console.log(c);

//random
let numRand = Math.random();
console.log(numRand);

//round()
let numRound = Math.round(8.7);
console.log(numRound);

//ceil() arrotonda all'interno superiore
let numCeil = Math.ceil(5.33);

//floor() arrotonda all'interno inferiore
let numFloor = Math.floor(5.33);

console.log(numCeil);
console.log(numFloor);



///////////////date/////////

let oggi = new Date();
console.log(oggi);
console.log(oggi.getHours());
console.log(oggi.getFullYear());
console.log(oggi.getDate());
console.log(oggi.getMonth());


///////////Esercizio inverti il tuo nome
let mioNome = "Dario";
let nomeInv = mioNome.split("").reverse().join("");

console.log(nomeInv);