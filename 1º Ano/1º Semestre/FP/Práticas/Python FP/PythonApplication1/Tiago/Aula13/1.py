def validarNumero(numero):
    if numero[0] == '+':
        if len(numero) >= 4 and numero[1:].isdigit():
            return True
        else:
            return False
    else:
        if len(numero) >= 3 and numero.isdigit():
            return True
        else:
            return False

def menu():
    print("\nProcessador de chamadas!\n")
    print("1) Registar chamada")
    print("2) Ler ficheiro")
    print("3) Listar clientes")
    print("4) Fatura")
    print("5) Terminar")
    op = input("Opção? ")
    return op

chamadas = []
callers = []
op = ""
while op != "5":
    op = menu()
    if op == "5":
        print("\nFim")
    elif op == "1":
        count = 1
        retVal = False
        while retVal == False:
            numOrigem = input("{}) Telefone origem? ".format(count))
            retVal = validarNumero(numOrigem)
            count += 1
        retVal = False
        while retVal == False:
            numDestino = input("{}) Telefone destino? ".format(count))
            retVal = validarNumero(numDestino)
            count += 1
        retVal = False
        while retVal == False:
            duracao = input("{}) Duração (s)? ".format(count))
            if duracao.isdigit() and int(duracao) > 0:
                retVal = True
            count += 1
        chamadas.append([numOrigem, numDestino, duracao])
        print("\nContacto adicionado com sucesso")
    elif op == "2":
        try:
            ficheiro = input("Ficheiro? ")
            ficheiro = open(ficheiro, 'r')
        except:
            print("\nErro ao abrir o ficheiro!")
        else:
            print("\nFicheiro lido com sucesso!")
            for line in ficheiro:
                chamadas.append(line.rstrip().split("\t"))
            ficheiro.close()

    elif op == "3":
        for lista in chamadas:
            if lista[0] not in callers:
                callers.append(lista[0])
        print("\nClientes: \n")
        for number in callers:
            print(number)

    elif op == "4":
        clientCalls = []
        retVal = False
        total = 0
        while retVal == False:
            clientNumber = input("\nCliente? ")
            retVal = validarNumero(clientNumber)
        print("\nFatura do cliente\n", clientNumber)
        for lista in chamadas:
            if lista[0] == clientNumber:
                clientCalls.append(lista)
        print("{:<20s}{:<10s}{:>12s}\n".format("Destino", "Duração","Custo"))
        for lista in clientCalls:
            origem = lista[0]
            destino = lista[1]
            duracao = lista[2]
            if destino[0] == "2":
                custo = (int(duracao) / 60) * 0.02
            elif destino[0] == "+":
                custo = (int(duracao) / 60) * 0.8
            elif origem[0] == destino[0] and origem[1] == destino[1]:
                custo = (int(duracao) / 60) * 0.04
            else:
                custo = (int(duracao) / 60) * 0.1
            total += custo
            print("{:<20s}{:<10s}{:>12}".format(destino, duracao, round(custo, 2)))
        print("{:>32s}: {:>8}".format("Total",round(total, 2)))






    else:
        print("\nNão implementado!")
