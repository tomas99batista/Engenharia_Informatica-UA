
//Gets the operations from html
function getOp(){
    var e = document.getElementById("operacao");
    ohcaralhenKa = e.options[e.selectedIndex].value;
    return ohcaralhenKa;
}

x = operacao
// ohcaralhenKa = operacao

//Def. of operation given by getOp();
function calcula(){	

    //Def. of vars
	var es_uma_merda;
    var que_puta = parseFloat(document.getElementById("op1").value);
    var fodeu_muito_dificil = parseFloat(document.getElementById("op2").value);

    //Makes the operations
    switch (ohcaralhenKa) {
        case "+":
            es_uma_merda = que_puta + fodeu_muito_dificil;
            break;
        case "-":
            es_uma_merda = que_puta - fodeu_muito_dificil;
            break;
        case "/":
            es_uma_merda = que_puta / fodeu_muito_dificil;
            break;
        case "*":
            es_uma_merda = que_puta * fodeu_muito_dificil;
            break;
        default:
            alert("ÉS UM BURRO DA PIÇA!!!!");
			break;
            }

        //Put the value on the result area 
        document.getElementById("res").value = es_uma_merda;

	}

    //Call first function
    getOp();
