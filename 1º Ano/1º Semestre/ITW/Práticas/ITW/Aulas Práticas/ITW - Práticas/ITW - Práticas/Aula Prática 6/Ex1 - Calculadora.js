var res = document.getElementById("res");
var n1 = "";
var n2 = "";
var op = "";
var controlo = 1;

function addNumber() {
    var x = event.target.value;
    if (res.innerText == "0") {
        res.innerText = "";
    }

    if (controlo == 1) {
        n1 += parseFloat(x);
        //console.log("n1 = ", n1);
    }
    else {
        n2 += parseFloat(x);
        //console.log("n2 = ", n2);
    }
    res.innerText += x;
}

function addOperation() {
    var x = event.target.value;
    if (res.innerText == "0")
        alert("ERRO... Adicione um valor antes da operação!");
    else {
        if (op == "") {
            op = x;
            res.innerText += x;
            controlo = 2;
            //console.log(op);
            //console.log(controlo)
        }
        else
            alert("Erro!")
    }
}

function calculate() {
    switch (op) {
        case "+":
            res.innerText = parseFloat(n1) + parseFloat(n2);
            //console.log("1");
            break;
        case "-":
            res.innerText = n1 - n2;
            //console.log("2");
            break;
        case "*":
            res.innerText = n1 * n2;
            break;
        case "/":
            if (n2 == "0" || n2 == "") {
                alert("Erro...");
                clearResult();
            }
            else {
                res.innerText = n1 / n2;
                break;
            }
    }
}

function clearResult() {
    n1 = "";
    n2 = "";
    op = "";
    controlo = 1;
    res.innerText = 0;
}