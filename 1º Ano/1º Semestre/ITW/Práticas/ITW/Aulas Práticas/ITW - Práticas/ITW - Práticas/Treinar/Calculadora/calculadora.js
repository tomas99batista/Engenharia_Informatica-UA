var res = document.getElementById("res");
var op1 = "";
var op2 = "";
var operador = "";
var controlo = 1;

function addNumber() {
    var x = event.target.value;
    if (res.innerText == "0") {
        res.innerText = "";
    }

    if (controlo == 1) {
        op1 += x;
    }
    else{
        op2 += x;
    }
    res.innerText += x;
}

function addOperation() {
    x = event.target.value;
    if (op1 != "" && operador == "") {
        res.innerText += x;
        operador = x;
        controlo = 2;
    }

    else {
        alert("Erro!");
    }

}

function calculate() {
    switch (operador) {
        case "+":
            res.innerText = parseFloat(op1) + parseFloat(op2);
            break;
        case "-":
            res.innerText = op1 - op2;
            break;
        case "*":
            res.innerText = op1 * op2;
            break;
        case "/":
            if (parseFloat(op2) == 0) {
                alert("Erro!");
                clearResult();
                break;
            }
            res.innerText = op1 / op2;
            break;
    }

}

function clearResult() {
    res.innerText = 0;
    op1 = "";
    op2 = "";
    operador = "";
    controlo = 1
}