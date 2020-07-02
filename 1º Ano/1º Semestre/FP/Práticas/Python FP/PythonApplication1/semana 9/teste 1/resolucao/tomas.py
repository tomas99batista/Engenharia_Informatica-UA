def IMC (kg, m):
	imc = kg / (m * m)
	return imc
	
def classificacao(imc):
	if imc < 18.5:
		print("Baixo Peso")
	elif 18.5 <= imc <= 25:
		print("Normal")
	else:
		print("Obesidade")

def lerValorPositivo(text):
	n = float(input(text))
	while n < 0.0:
		n = float(input('Número inválido! ' + text))
	return n
	
def menu():
	print("Opções disponíveis:")
	print("0 - sair")
	print("1 - introduzir nova medida")
	print("2 - mostrar média atual")
	opcao = int(input("Opção? "))
	return opcao

print("Bem-Vindo ao meu programa!")
soma = 0
entradas = 0
while True:
	opcao = menu()
	if opcao == 0:
		print("Fim")
		break

	elif opcao == 1:
		print("")
		p = lerValorPositivo("Peso? (Kg) ")
		print("")
		a = lerValorPositivo("Altura? (Metros) ")
		print("")
		imc = IMC(p, a)
		print("Adulto com um IMC de", imc)
		classificacao(imc)
		print("")
		soma = soma + imc
		entradas = entradas + 1

	elif opcao == 2:
		print("")
		print("Estatísticas Atuais:")
		if entradas == 0:
			print("Ainda não tem entradas!")
			print("")
		else:
			media = soma / entradas
			print("Valor médio do IMC para", entradas, "adultos: ", media)
			print("")

	else:
		print("")
		print("Opção inválida!")
		print("")
print("Até Breve!")
