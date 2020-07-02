var n1 = document.getElementById("op1");
var n2 = document.getElementById("op2");
var op;
var result = document.getElementById("res");

function getOperacao() {
    //alert("I was activated");
    var option = document.getElementById("operacao");
    op = option.options[option.selectedIndex].value;
    console.log(op);
}

function calculo() {
    //alert("True");
    getOperacao();
    switch (op) {
        case "+":
            //alert("True");
            res.value = parseFloat(n1.value) + parseFloat(n2.value);
            break;
            //console.log(y);
        case "-":
            res.value = n1.value - n2.value;
            break;
        case "*":
            res.value = n1.value * n2.value;
            break;
        case ":":
            res.value = n1.value / n2.value;
            break;
        case "//":
            res.value = parseInt(n1.value / n2.value);
    }
} 