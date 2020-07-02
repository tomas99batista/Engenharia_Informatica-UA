
var alga;
var ef;
var c1;
var itw;
var fp;
var mas;
var c2;
var md;
var iac;
var poo;
var m1;
var m2;

function calcular()
{
	alga = parseFloat(document.getElementById("alga").value);
	ef = parseFloat(document.getElementById("ef").value);
	c1 = parseFloat(document.getElementById("c1").value);
	itw = parseFloat(document.getElementById("itw").value);
	fp = parseFloat(document.getElementById("fp").value);
	mas = parseFloat(document.getElementById("mas").value);
	c2 = parseFloat(document.getElementById("c2").value);
	md = parseFloat(document.getElementById("md").value);
	iac = parseFloat(document.getElementById("iac").value);
	poo = parseFloat(document.getElementById("poo").value);
	
	m1=(alga+ef+c1+itw+fp)/5;
	m2=(mas+c2+md+iac+poo)/5;
	
	document.getElementById("m1").value = m1;
	document.getElementById("m2").value = m2;
	
	return false;
}