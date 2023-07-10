const URL = "http://localhost:3000/posts";

let demo = document.querySelector('#demo');
let btn = document.querySelector('#btn');

fetch(URL)
.then(data => {return data.json()})
.then(response =>{
    console.log(response);

    response.forEach(post => {
        demo.innerHTML += "<li>"+post.title+" "+post.author+"</li>"
    });
})

function caricaPost(){
    let titoloPost = document.querySelector('#titoloPost');
    let autorePost = document.querySelector('#autorePost');
    
    
    // let nuovoPost = {
    //     id: 4,
    //     title: "Vabbè, facciamo prima PAUSA !!!",
    //     author: "Dario"
    // }
    let nuovoPost = {
        title: titoloPost.value,
        author: autorePost.value
    }

    //per poter caricare il nuovo post nel db devo mettere in piedi una fetch method post
    fetch(URL,{
        method:"POST",
        headers: {"Content-type":"application/json"},
        body: JSON.stringify(nuovoPost)
    })
    .then(data =>{return data.json()})
    .then(response =>{
        console.log(response.statusCode, "Registrazione andata con successo");
    })
}

btn.addEventListener('click', caricaPost);