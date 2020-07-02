//--- Variaveis globais
var numeros = 0;
var estrelas = 0;
var botao = document.getElementById("botao");


function checkStar() {
    estrelas = 0;
    for (var i = 1; i <= 12; i++) {
        x = document.getElementById("star_" + i).checked;
        if (x) estrelas++;
    }
    var multiplasStars = document.getElementById("stars_" + estrelas);
    if (multiplasStars != null) multiplasStars.checked = true;
    ativarBotao();

}
function checkNumber() {
    numeros = 0;
    for (var i = 1; i <= 50; i++) {
        x = document.getElementById("number_" + i).checked;
        if (x) numeros++;;
    }
    var multiplasNumbers = document.getElementById("numbers_" + numeros);
    if (multiplasNumbers != null) multiplasNumbers.checked = true;
    ativarBotao();
}

function ativarBotao() {
    if (numeros < 5 || numeros > 11 || estrelas < 2 ) {
        botao.disabled = "disabled";
    }
    else {
        botao.disabled = "";
    }
}