let btn = document.getElementById("btn");


function generaNumeri(){
    let numeri = document.getElementById("numEstratti").value;
    for(let i = 1; i < numeri; i++){
         let random = Math.ceil(Math.random()*90)
         console.log(random);
    } 
   
}

btn.addEventListener("click", generaNumeri);
generaNumeri();