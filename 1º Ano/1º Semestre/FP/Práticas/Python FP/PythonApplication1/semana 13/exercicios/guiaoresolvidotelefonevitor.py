#encode: UTF-8


def validar(numero):

	#print("{}".format(str(numero[0])))
	
	numero2 = 0

	if(str(numero[0]) == "+"):
		if(len(numero) >= 4):
			if(numero[1:].isdigit()):
				numero2 = numero
			elif(numero[1:].isalpha()):
				numero2 = 0
	
	elif(str(numero[0]) != "+"):
		if(len(numero) >= 3):
			if(numero.isdigit()):
				numero2 = numero
			elif(numero.isalpha()):
				numero2 = 0

	
	return numero2


opcao = 0

origem = []
destino = []
duracao = []
dic = dict()
tuplo = []
l = []

while(opcao != "5"):
	
	print("\n1) Registar chamada\n2) Ler ficheiro\n3) Listar clientes\n4) Fatura\n5) Terminar\n0) Opção?")
	opcao = str(input())

	if(opcao == "1"):
		
		teforigem = 0
		tefdestino = 0
		duracao = ""

		while(teforigem == 0):
			teforigem = str(input("Telefone origem? "))
			teforigem = validar(teforigem)
		
		while(tefdestino == 0):
			tefdestino = str(input("Telefone destino? "))
			tefdestino = validar(tefdestino)

		if(not duracao.isdigit()):
			duracao = str(input("Duração (s)? "))


	if(opcao == "2"):

		origem = []
		destino = []
		duracao = []
		l = []
		dic = dict()

		ficheiro = str(input("Ficheiro? "))
		ficheiro2 = open(ficheiro, 'r')

		for line in ficheiro2:
			x = line.strip().split("\t")

			origem.append(x[0])
			destino.append(x[1])
			duracao.append(x[2])

			if(x[0] not in dic):

				dic[x[0]] = []

			dic[x[0]].append([x[1], x[2]])


		ficheiro2.close()

	if(opcao == "3"):

		lista_sem_repeticoes = []

		for i in origem:
			if i not in lista_sem_repeticoes:
				lista_sem_repeticoes.append(i)

		sorted_list = sorted(lista_sem_repeticoes)

		print("Clientes:")

		for y in sorted_list:
			print(y)

	if(opcao == "4"):

		cliente = str(input("Cliente? "))

		tuplo = []
		custos = []

		#print(dic)

		for key in dic:
			if(key == cliente):
				#print(key)
				for i in dic[key]:
					tuplo.append(i)

		#print(tuplo)

		for x in tuplo:
			#print(x)
			if(x[0][0] == "2"):
				custo = int(x[1])*(0.02/60)
				custos.append(custo)

			elif(x[0][0] == "+"):
				custo = int(x[1])*(0.80/60)
				custos.append(custo)

			elif(x[0][0:2] == cliente[0:2]):
				custo = int(x[1])*(0.04/60)
				custos.append(custo)

			else:
				custo = int(x[1])*(0.10/60)
				custos.append(custo)

		print("{:<20} {:>15} {:>10}".format("Destino", "Duração", "Custo"))
		
		z = 0

		for x in tuplo:
			print("{:<20} {:>15} {:>10.2f}".format(x[0], x[1], float(custos[z])))
			z += 1



