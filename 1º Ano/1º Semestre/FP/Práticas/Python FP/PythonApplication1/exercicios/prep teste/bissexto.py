ano = int(input("Ano: "))

def anobi(ano):
	if ano % 4 == 0 and ano % 100 == 0:
		print("O ano é bissexto!")
	elif ano % 4 == 0:
		print("O ano é bissexto!2")
	else:
		print("Ops, o ano não é bissexto!")

anobi(ano)
