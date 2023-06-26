let stroboInterval;
let stroboMove;
let stroboDiv = document.getElementById("strobo");
let btn = document.getElementById("btn");
let btn2 = document.getElementById("btn2");
let stroboAttivo = false;

function getRandomColor() {
    let letters = '0123456789ABCDEF';
    let color = '#';
    for (var i = 0; i < 6; i++) {
        color += letters[Math.ceil(Math.random()*12)];
    }
    return color;
}

function cambiaColoreCasuale() {
    stroboDiv.style.backgroundColor = getRandomColor();
    stroboDiv.style.boxShadow = `20px 20px 70px 20px ${stroboDiv.style.backgroundColor}`;

}

function toggleStrobo() {
    if (stroboAttivo) {
        clearInterval(stroboInterval);
        stroboDiv.style.backgroundColor = "";
        stroboDiv.style.boxShadow = " 20px 20px 70px 20px white";
    } else {
        stroboInterval = setInterval(cambiaColoreCasuale, 100);
    }
    stroboAttivo = !stroboAttivo;
}

btn.addEventListener("click", toggleStrobo);
