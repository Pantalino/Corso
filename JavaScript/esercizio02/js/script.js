function Item(todo, data) {

    this.todo = todo;
    this.data = data;

    this.info = function () {
        let info = `${this.todo} ${this.data}`;
        return info;
    }

}

function registraItem() {

    let todoItem = document.getElementById("todolist").value;
    let dataItem = document.getElementById("data").value;

    if (todoItem == "" || dataItem == "") {
        demo.innerHTML = "NON HAI INSERITO UN BEL NIENTE";
    } else {
        let miaList = new Item(todoList, dataList);

        console.log(miaList);
        lista.push(miaList);
        stampa();

    }
}

function stampa() {
    demo.innerHTML = "";
    lista.forEach(item => {
        demo.innerHTML += "<li>" + item.info() + "</li>";
    });
}

let lista = [];
let btnAgg = document.getElementById("btnAgg");
let demo = document.getElementById("demo");


btnAgg.addEventListener("click", registraItem);