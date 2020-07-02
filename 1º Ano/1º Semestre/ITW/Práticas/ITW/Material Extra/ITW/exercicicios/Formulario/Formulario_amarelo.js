function validar() {
	var nomeerro=document.getElementById("nomeerro");
	var nome=document.getElementById("Fn");
	var loginerro=document.getElementById("loginerro");
	var login=document.getElementById("login");
	var passerro=document.getElementById("passerro");
	var pass=document.getElementById("pass");
	var nomecorreto=false;
	var passcorreto=false;
	var logincorreto=false;


	if (nome.value.length < 10 || nome.value.length > 100) {
		nomeerro.innerHTML="O seu nome tem de ter no mínimo 10 carateres e no máximo 100!";
		nomeerro.style.color="red";
	};
	else{
		nomecorreto=true;
		nomeerro.innerHTML="";
	}


	if(login.value.length < 10 || login.value.length > 30) {
		loginerro.innerHTML="O seu login tem de ter o mínimo 10 carateres e no máximo 30!";
		loginerro.style.color="red";
	}
	 else{
	 	logincorreto=true;
	 	loginerro.innerHTML=""
	 }

	 if (pass.value.length <7 || pass.value.length >30) {
	 	pass.innerHTML="A sua palavra passe tem de ter no mínimo 7 carateres e no máximo 30";
	 	pass.style.color="red"
	 }
	 else{
	 	passcorreto=true;
	 	passcorreto.innerHTML=""
	 }

	 if (nomecorreto=true && logincorreto=true && passcorreto=true) {
	 	return true;
	 }
	 else {return false;}


}