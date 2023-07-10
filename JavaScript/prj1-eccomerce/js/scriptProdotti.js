//fetch per le categorie
let URLCategorie = "https://dummyjson.com/products/categories";

let selectCategorie = document.querySelector("#selectCategorie");
let demo = document.querySelector("#demo");
let search = document.querySelector('#search');
let btnSearch = document.querySelector('#btnSearch');

fetch(URLCategorie)
  .then((data) => {
    return data.json();
  })
  .then((response) => {
    console.log(response);

    creaSelect(response);
  });



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
    console.log(this.value);
 
  });

  
}



function mostraProdotti(categoria) {
  fetch(`https://dummyjson.com/products/category/${categoria}`)
    .then((data) => {
      return data.json();
    })
    .then((response) => {
      console.log(response.products);
      demo.innerHTML = "";
      response.products.forEach((prodotto) => {
        // demo.innerHTML += `<li class="card-body"> ${prodotto.title} <br> ${prodotto.description} <br> ${prodotto.category} <br>
        // <img src="${prodotto.thumbnail}" height="300px"></li>`;

        demo.innerHTML += `
        <div class="col-4">
        <div class="card">
          <div class="card-body">
            <img class="card-img-top" src="${prodotto.thumbnail}">
            <h3 class="card-title">${prodotto.title}</h3>
            <p class="card-text">${prodotto.brand}</p>
            <p class="card-text">${prodotto.category}</p>
            <p class="card-text">Prezzo: ${prodotto.price}€</p>
            <button onclick='mettiNelCarrello(${prodotto.id})'
             class="btn btn-danger" data-id="${prodotto.id}">Compra</button>
          </div>
        </div>
        </div>`

      });
    });

  //Costruire una nuova then che richiama i prodotti filtrati by categoria, vedere la documentazione di DummyJSON
}


function cercaCategoria(categoria){
  fetch(`https://dummyjson.com/products/search?q=${categoria}`)
  .then(data =>{
    return data.json();
  })
  .then(response =>{
    response.products.forEach(prodotto =>{
      demo.innerHTML += `
      <div class="col-4">
      <div class="card m-3 p-3">
        <div class="card-body">
          <img class="card-img-top" src="${prodotto.thumbnail}">
          <h3 class="card-title">${prodotto.title}</h3>
          <p class="card-text">${prodotto.brand}</p>
          <p class="card-text">${prodotto.category}</p>
          <p class="card-text">Prezzo: ${prodotto.price}€</p>
          <button onclick='mettiNelCarrello(${prodotto.id})'
           class="btn btn-danger" data-id="${prodotto.id}">Compra</button>
        </div>
      </div>
      </div>`
    })
  })
}

// search.addEventListener('click', function() {
// cercaCategoria(this.value)
// })
btnSearch.addEventListener('click', function() {
cercaCategoria(this.value)
console.log(this.value);
})

function mettiNelCarrello(id){
  console.log(id);
}
