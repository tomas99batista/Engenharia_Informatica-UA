
//Get numbers and operation
function 
var e = document.getElementById("operacao");
operacao = e.options[e.selectedIndex].value;

var n1 = document.getElementById("op1");
var n2 = document.getElementById("op2");

//Write value
document.getElementById("res").value = calculo(n1, n2, operacao);

//Calculates the final result based on 2 numbers and 1 operation
function calculo() {

    var resultado;

    switch (operacao) {
        case "+":
            resultado = parseFloat(n1) + parseFloat(n2);
            break;
        case "-":
            resultado = parseFloat(n1) - parseFloat(n2);
            break;
        case "/":
            resultado = parseFloat(n1) / parseFloat(n2);
            break;
        case "*":
            resultado = parseFloat(n1) * parseFloat(n2);
            break;
        default:
            alert("noob");
            break;
    }

    return resultado;

}