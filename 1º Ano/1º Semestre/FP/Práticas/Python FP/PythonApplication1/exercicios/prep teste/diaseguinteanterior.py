ano = int(input("Ano: "))
mes = int(input("Mês: "))
dia = int(input("Dia: "))

def anobi(ano, mes, dia):
	if ano % 4 == 0 and ano % 100 == 0:
		if mes % 2 != 0 and mes == 8 and mes != 1 and mes != 3:
			if dia == 31:
				print("Anterior: Dia 30, Mês {}, Ano {}", mes, ano)
				mes = mes + 1
				print("Seguinte: Dia 1, Mês {}, Ano {}", dia, mes, ano)
			if dia == 1:
				mes = mes - 1
				print("Anterior: Dia 30, Mês {}, Ano {}", dia, mes, ano)
				dia = dia + 1
				print("Seguinte: Dia {}, Mês {}, Ano {}", dia, mes, ano)
			else:
				dia = dia - 1
				print("Anterior: Dia {}, Mês {}, Ano {}", dia, mes, ano)
				dia = dia + 1
				print("Seguinte: Dia {}, Mês {}, Ano {}", dia, mes, ano)
		
		elif mes == 1:
			if dia == 1:
				ano = ano - 1
				print("Anterior: Dia 31, Mês 12, Ano", ano)
				print("Seguinte: Dia 2, Mês 1, Ano", ano)
			
			elif dia == 31:
				print("Anterior: Dia 30, Mês 1, Ano {}", ano)
				print("Seguinte: Dia 1, Mês 2, Ano {}", ano)
			else:
				dia = dia - 1
				print("Anterior: Dia {}, Mês 1, Ano {}", dia, ano)
				dia = dia + 1
				print("Seguinte: Dia {}, Mês 1, Ano {}", dia, ano)
		elif mes == 3:
			if dia == 1:
				print("Anterior: Dia 29, Mês 2, Ano {}", ano)
				print("Seguinte: Dia 2, Mês 3 Ano {}", ano)
			elif dia == 31:
				print("Anterior: Dia 30, Mês 3, Ano {}", ano)
				print("Seguinte: Dia 1, Mês 4, Ano {}", ano)
			else:
				dia = dia - 1
				print("Anterior: Dia {}, Mês 1, Ano {}", dia, ano)
				dia = dia + 1
				print("Seguinte: Dia {}, Mês 1, Ano {}", dia, ano)
		elif mes == 2:
			pass
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

anobi(ano, mes, dia)
