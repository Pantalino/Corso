
function estrai() {

    demo.innerHTML = "";

    let numeriDaEstrarre = document.getElementById("numeriDaEstrarre").value;
    let numEstratti = [];
    let numGiri = 0;

    if (numeriDaEstrarre < 0 || numeriDaEstrarre > 10) {
        demo.innerHTML = "Metti un valore da 1 a 10"
    } else {

        for (i = 0; i < numeriDaEstrarre; i++) {

            numGiri++;
            let numero = Math.ceil(Math.random() * 90);

            if (numEstratti.indexOf(numero) == -1) {
                numEstratti.push(numero)
            } else {
                i--
            }
        }

        ///////////////while//////////////

        // while (numeriEstratti.length < numeriDaEstrarre) {
        //     let numero = Math.ceil(Math.random() * 90);

        //     if (numEstratti.indexOf(numero) == -1) {
        //         numEstratti.push(numero)
        //     }
        // }

        ///////////////////splice///////////////////

        // let numeri = [];
        // for (let i = 0; i < 90; i++) {
        //     numeri.push(i + 1)

        // }

        // for (let i = 0; i < numeriDaEstrarre; i++) {
        //     let numero = Math.floor(Math.random() * numeri.length);
        //     numeriEstratti.push(numeri[numero]);
        //     numeri.splice(numero, 1);

        // }


        //demo.innerHTML = numEstratti;
        numEstratti.forEach(num => {
            demo.innerHTML += + num + " ";
        });
    }
    console.log(numGiri);
    console.log(numEstratti);
}



let demo = document.getElementById("demo");
let btn = document.getElementById("btn");

btn.addEventListener("click", estrai)
// btn.addEventListener("click", funtcion(){
// estrai
// })