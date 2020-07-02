var res = document.getElementById("res");
var op = 0;
var op1 = 0;
var operacao = '';

function addNumber()
{
	var x = event.target.value;
	if (res.innerHTML == 0) {
		res.innerHTML = x;
		op += x;}
	else {
		op += x;
		res.innerHTML += x;}
}

function addOperation()
{
	var x = event.target.value;
	switch (x)
	{
		case '+':
			res.innerHTML += '+';
			op1 = op;
			op = 0;
			operacao = '+';
			break;
		case '-':
			res.innerHTML += '-';
			op1 = op;
			op = 0;
			operacao = '-';
			break;
		case '*':
			res.innerHTML += '*';
			op1 = op;
			op = 0;
			operacao = '*';
			break;
		case '/':
			res.innerHTML += '/';
			op1 = op;
			op = 0;
			operacao = '/';
			break;
	}
}

function calculate()
{
	switch (operacao)
	{
		case '+':
			res.innerHTML = parseFloat(op1) + parseFloat(op);
			op = res.innerHTML;
			break;
		case '-':
			res.innerHTML = parseFloat(op1) - parseFloat(op);
			op = res.innerHTML;
			break;
		case '*':
			res.innerHTML = parseFloat(op1) * parseFloat(op);
			op = res.innerHTML;
			break;
		case '/':
			if (parseFloat(op) == 0){res.innerHTML = "ERRO!!!"; break;}
			res.innerHTML = parseFloat(op1) / parseFloat(op);
			op = res.innerHTML;
			break;
	}
}

function clearResult()
{
	res.innerHTML = "0";
	op = 0;
	op1 = 0;
}

