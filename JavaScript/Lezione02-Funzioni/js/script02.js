// //funzione parametriche, cioè funzione con firma piena, funzione con para,etri definiti
function calcolaArea(altezza, larghezza){

    let area = altezza * larghezza;

    return area;

}

function calcolaVolume(profondita){
    //sto richiamando una funzione passando dei parametri
    let area = calcolaArea(10, 5)//50 

    let volume = area*profondita;

    return volume;
}

console.log(calcolaVolume(6));//50 * 6 = 300

/////////////////////////////////////////////////////////////
function calcolaVolume2(calcolaArea, profondita){
    let volume 
}
