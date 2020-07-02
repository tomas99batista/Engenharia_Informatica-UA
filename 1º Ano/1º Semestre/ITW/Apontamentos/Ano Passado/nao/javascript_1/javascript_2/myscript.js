function soma(x, y)
{
    return x + y;
}
function soma_2(x, y)
{
    if (x === y)
        {
            alert("Iguais");
        }
    else
        {
            alert("Diferentes");
        }
        
}
function compare(x)
{
    switch (x)
        {
            case "a":
                alert("x é igual a a");
                break;
            case 3:
                alert("x é igual a 3");
            case "3":
                alert("x é igual a \"3\"");
                break;
            default:
                alert("x é outra coisa qualquer");
        }
}
function fatorial(n)
{
    var res = 0;
    if (n == 1)
        return = 0;
    else
        return = fatorial(n-1) * n;
        
}
function calculadora()
{
    var op = document.getElementById("op");
    var x = document.getElementById("op1");
    var y = document.getElementById("op2");
    console.log(x.value);
    console.log(y.value);
    switch(op.value)
        {
            case "+":
                console.log(parseFloat(x.value) + parseFloat(y.value));
                break;
            case "-":
                console.log(parseFloat(x.value) - parseFloat(y.value));
                break;
            case "*":
                console.log(parseFloat(x.value) * parseFloat(y.value));
                break;
            case "/":
                console.log(parseFloat(x.value) / parseFloat(y.value));
                break;
            case "%":
                console.log(parseFloat(x.value) % parseFloat(y.value));
                break;
            case "!":
                console.log(fatorial(parseFloat(x.value)));
                console.log(fatorial(parseFloat(y.value)));
                break;
                
        }    
}
/*var resultado = soma(3, "3");*/
/*var resultado_2 = soma_2(3, "3");*/
/*var resultado_3 = compare(3)*/
window.onload = calculadora;