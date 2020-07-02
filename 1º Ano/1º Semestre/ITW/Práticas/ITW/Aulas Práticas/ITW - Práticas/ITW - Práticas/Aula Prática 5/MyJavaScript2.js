var x = document.getElementById("opção1");
var y = document.getElementById("opção2");

function soma(x,y) {
    return parseFloat(x.value) + parseFloat(y.value);
}
var res = document.getElementById("res");
res.value = soma(x,y);