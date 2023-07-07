//fetch per le categorie
let URLCategorie = "https://dummyjson.com/products/categories";

const demo = document.querySelector("#demo");

fetch(URLCategorie)
  .then((data) => {
    return data.json();
  })
  .then((response) => {
    console.log(response);

    creaSelect(response);
  });

const selectCategorie = document.querySelector("#selectCategorie");

/**
 *
 * @param {Array} listaCategorie
 */
function creaSelect(listaCategorie) {
  listaCategorie.forEach((categoria) => {
    let optCategoria = document.createElement("option");
    optCategoria.innerHTML = categoria;
    optCategoria.setAttribute("value", categoria); //<option value="nomeCategoria">nomeCategoria</option>

    selectCategorie.appendChild(optCategoria);
  });

  selectCategorie.addEventListener("change", function () {
    mostraProdotti(this.value);
  });
}

function mostraProdotti(categoria){
    console.log(categoria);

    f

}