#encode: UTF-8
def menu():
    print("1) Registar chamada\n2) Ler ficheiro\n3) Listar clientes\n4) Fatura\n5) Terminar")
    op = int(input("0) Opção? "))
    return op

def validateNum(num):
    validation = True
    if num[0] == '+' and num[1:].isdigit():
        if len(num) < 4:
            validation = False
     
    elif num[0:].isdigit():
        if len(num) < 3:
            validation = False
    else:
        validation = False
    
    return validation

while True:
    chamadas = {}
    op = menu()
    if op == 1:
        while True:
            origem = input("Telefone origem? ")
            if validateNum(origem): 
                break
            print("Telefone Inválido")

        while True:
            destino = input("Telefone destino? ")
            if validateNum(destino): 
                break
            print("Telefone Inválido")

        duracao = int(input("Duração (s)? "))
    
    elif op == 2:
        file = input("Ficheiro? ")
        ficheiro = open(file, 'r',)
        origem = []
        destino = []
        duracao = []
        for line in ficheiro:
            x = line.strip().split()
            origem.append(x[0])
            destino.append(x[1])
            duracao.append(x[2]) 
        print("File lido!")
    
    elif op == 3:

        clientes = []
        for l in origem:
            if l not in clientes:
                clientes.append(l)
        clientes = sorted(clientes)
        print(clientes)
    
    elif op == 4:
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
    
    elif op == 5:
        print("Fim!")        
        break
    
    else:
        print("Opção não definida")
        menu()

