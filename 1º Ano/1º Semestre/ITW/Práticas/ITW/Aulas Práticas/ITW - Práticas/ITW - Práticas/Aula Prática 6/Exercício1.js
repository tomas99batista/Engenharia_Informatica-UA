var res = document.getElementById("res");
var start = true
var controlo = 1
var op1 = '';
var op2 = '';
var operacao = '';

function addNumber() {
    var x = event.target.value;
    if (controlo == 1) {
        op1 = op1 + x;
    }
    else {
        op2 = op2 + x;
    }
    if (start == true) {
        res.innerText = "";
        start = false;
    }
    res.innerText = res.innerText + x;
}

function addOperation() {
    var x = event.target.value;
    if (operacao == '' && op1 != '') {
        operacao = x;
        controlo = 2;
        res.innerText += x;
    }
    else {
        erro();
    }

}

function calculate() {
    if (controlo == 2) {
        switch (operacao) {
            case '+':
                res.innerText = parseFloat(op1) + parseFloat(op2);
                operacao = res.innerText;
                break;
            case '-':
                res.innerText = parseFloat(op1) - parseFloat(op2);
                operacao = res.innerText;
                break;
            case '*':
                res.innerText = parseFloat(op1) * parseFloat(op2);
                operacao = res.innerText;
                break;
            case '/':
                if (parseFloat(op2) == 0) {
                    res.innerText = "ERRO!!!";
                    break;
                }
                res.innerText = parseFloat(op1) / parseFloat(op2);
                operacao = res.innerText;
                break;
        }
    }
}

function clearResult() {
    res.innerText = "0";
    start = true;
    controlo = 1;
    op1 = '';
    op2 = '';
    operacao = '';
}

function erro() {
    res.innerText = "Erro!";
}