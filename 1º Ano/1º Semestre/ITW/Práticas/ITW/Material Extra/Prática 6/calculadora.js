
var putas = "";
var vinho_verde = "";
var ohcaralhenKa = "";

function addNumber(event){
	if (ohcaralhenKa != ""){
		vinho_verde += event.target.value;
		document.getElementById("res").innerText = putas + ohcaralhenKa + vinho_verde;
		return;
	}else{
		putas += event.target.value;
		document.getElementById("res").innerText = putas + ohcaralhenKa + vinho_verde;
	}
}

function addOperation(event){
	ohcaralhenKa = event.target.value;
}

function calculadora(){

	putas = parseInt(putas);
	vinho_verde = parseInt(vinho_verde);

	var foda_se_esta_merda;

	switch (ohcaralhenKa) {
        case "+":
            foda_se_esta_merda = putas + vinho_verde;
            break;
        case "-":
            foda_se_esta_merda = putas - vinho_verde;
            break;
        case "/":
        	if (vinho_verde == 0){
        		document.getElementById("res").innerText = "ÉS UM BURRO DO CARALHO"; 
        		apagarLikeABoss();
        		return;
        	}else{
        		foda_se_esta_merda = putas / vinho_verde;
        	}; 
            break;
        case "*":
            foda_se_esta_merda = putas * vinho_verde;
            break;
        default:
            alert("Operação inválida!");
			break;
            }

    document.getElementById("res").innerText = foda_se_esta_merda;

    putas = "" + foda_se_esta_merda;

    vinho_verde = "";

}

function apagar(){
	document.getElementById("res").innerText = 0;
	putas = "";
	vinho_verde = "";
	ohcaralhenKa = "";
}

function apagarLikeABoss(){
	putas = "";
	vinho_verde = "";
	ohcaralhenKa = "";
}