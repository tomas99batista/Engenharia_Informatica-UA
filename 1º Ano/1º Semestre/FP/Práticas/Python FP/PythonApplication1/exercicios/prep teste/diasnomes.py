ano = int(input("Ano: "))
mes = int(input("Mês: "))

def anobi(ano, mes):
	if ano % 4 == 0 and ano % 100 == 0:
		if mes % 2 != 0 and mes == 8:
			print("O mês tem 31 dias!")
		elif mes == 2:
			print("O mês tem 29 dias!")
		else:
			print("O mês tem 30 dias!")	
	elif ano % 4 == 0:
		if mes % 2 != 0 and mes == 8:
			print("O mês tem 31 dias!")
		elif mes == 2:
			print("O mês tem 29 dias!")
		else:
			print("O mês tem 30 dias!")
	else:
		if mes % 2 != 0 and mes == 8:
			print("O mês tem 31 dias!")
		elif mes == 2:
			print("O mês tem 28 dias!")
		else:
			print("O mês tem 30 dias!")

anobi(ano, mes)
