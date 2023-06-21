
function estrarreNumeri() {
    let serieNumeri = document.getElementById("serie-numeri").value;
    let numeriEstratti = [];

    for (let i = 0; i < serieNumeri; i++) {
      let serie = [];

      while (serie.length < 5) {
        let numeroCasuale = Math.ceil(Math.random() * 90);

        if (!serie.includes(numeroCasuale)) {
          serie.push(numeroCasuale);
        }
      }

      numeriEstratti.push(serie);
    }

    let numeriEstrattiElement = document.getElementById("numeri-estratti");
    numeriEstrattiElement.innerHTML = "";

    numeriEstratti.forEach(function(serie) {
      let serieElement = document.createElement("p");
      serieElement.innerHTML = "Numeri estratti: " + serie.join(" - ");
      numeriEstrattiElement.appendChild(serieElement);
    });
  }
