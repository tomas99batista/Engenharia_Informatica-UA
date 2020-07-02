function Calcularmais()
{  var x = document.getElementById( "op1" );
	var y = document.getElementById( "op2" );
	console.log( parseFloat(x.value) );
	console.log( parseFloat(y.value) );
	console.log( x+y );
	var res = document.getElementById('res');
	res.value = parseFloat(x.value)+parseFloat(y.value);  
}
	

function Calcularmenos()
{  var x = document.getElementById( "op1" );
	var y = document.getElementById( "op2" );
	console.log( parseFloat(x.value) );
	console.log( parseFloat(y.value) );
	console.log( x-y );
	var res = document.getElementById('res');
	res.value = parseFloat(x.value)-parseFloat(y.value);  
}


function Calculardividir()
{  var x = document.getElementById( "op1" );
	var y = document.getElementById( "op2" );
	console.log( parseFloat(x.value) );
	console.log( parseFloat(y.value) );
	console.log( x/y );
	var res = document.getElementById('res');
	res.value = parseFloat(x.value)/parseFloat(y.value);  
}


function Calcularmultiplicar()
{  var x = document.getElementById( "op1" );
	var y = document.getElementById( "op2" );
	console.log( parseFloat(x.value) );
	console.log( parseFloat(y.value) );
	console.log( x*y );
	var res = document.getElementById('res');
	res.value = parseFloat(x.value)*parseFloat(y.value);  
}
