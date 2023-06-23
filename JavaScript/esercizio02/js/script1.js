function Item(todo, data) {

    this.todo = todo;
    this.data = data;

}

listaTodos = [];

let listaItem = document.getElementById("listaItem");
let btnAgg = document.getElementById("btnAgg");
let demo = document.getElementById("demo");
// let todoItem = document.getElementById("todoItem");
// let data = document.getElementById("data");


function aggiungi() {

    let todoItem = document.getElementById("todoItem").value;
    let data = document.getElementById("data").value;

    let dataCorretta = new Date(data);
    let giorno = dataCorretta.getDate()
    let mese = dataCorretta.getMonth()
    let anno = dataCorretta.getFullYear()
    // let giorno = dataCorretta.getDate()

    demo.innerHTML = "";
    let miaTodo = new Item(todoItem, data);
    listaTodos.push(miaTodo);

}

function stampa() {
    listaItem.innerHtml = "";
    //aggiungi();

    listaTodos.forEach(todo => {
        listaItem.innerHTML += "<li>" + todo.todo + " - " + todo.data + "</li>"
    });

}

function pulisci() {
    document.getElementById("todoItem").value = "";
    document.getElementById("data").value = "";
}

function controlla() {
    let todoItem = document.getElementById("todoItem").value;
    let data = document.getElementById("data").value;

    if (todoItem == "" || data == "") {
        demo.innerHTML = "guarda che c'è qualcosa che non va"
        return false;
    } else {
        demo.innerHTML = "";
        return true;
    }
}

btnAgg.addEventListener("click", function () {
    if (controlla()) {
        aggiungi();
        stampa();
        pulisci();
    }

});