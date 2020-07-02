def initializeDic(): #Inicialização do dicionário
    f = open('fp.csv', 'r', encoding='utf8')
    f.readline() #ignore header
    d = {}
    for l in f:
        fields = l.rstrip().split(',')
        d[fields[0]] = tuple(fields[1:])
    return f, d

def ordM(option): #Ordenação por número mecanográfico
    f, d = initializeDic()
    print("Ordenação por Número Mecanográfico: ")
    if option == "1":
        for k in d:
            print("Nº Mec: ",k, " : Dados: ", d[k])
    elif option == "2":
        for k in sorted(d, reverse = True):
            print("Nº Mec: ",k, " : Dados: ", d[k])
    else:
        print("\nNão implementado!")
    f.close()

def ordN(option): #Ordenação por nome
    f, d = initializeDic()
    if option == "1":
        l = sorted(d, key = lambda k: d[k][0])
        for k in l:
          print("Nome: {:<50} : Nº Mecanográfico: {:<7}".format(d[k][0], k), "Dados: ", d[k])
    elif option == "2":
        l = sorted(d, key = lambda k: d[k][0], reverse = True)
        for k in l:
          print("Nome: {:<50} : Nº Mecanográfico: {:<7}".format(d[k][0], k), "Dados: ", d[k])
    else:
        print("\nNão implementado!")
    f.close()

def ordT(option): #Ordenação por turma
    f, d = initializeDic()
    if option == "1":
        l = sorted(d, key = lambda k:int(d[k][1][1:]))
        for k in l:
          print("Turma: P",int(d[k][1][1:]),"Nº Mecanográfico: ", k,"Dados: ", d[k])
    elif option == "2":
        l = sorted(d, key = lambda k:int(d[k][1][1:]), reverse = True)
        for k in l:
          print("Turma: P",int(d[k][1][1:]),"Nº Mecanográfico: ", k,"Dados: ", d[k])
    else:
        print("\nNão implementado!")
    f.close()

def ordA(option): #Ordenação por API
    f, d = initializeDic()
    d2 = {}
    if option == "1":
        for k in d:
            if d[k][2] != "F":
                d2[k] = d[k]
        l = sorted(d2, key = lambda k: float(d2[k][2]))
        for k in l:
            print("Nota API: ",d2[k][2],"Nº Mecanográfico: ", k,"Dados: ", d2[k])
    elif option == "2":
        for k in d:
            if d[k][2] != "F":
                d2[k] = d[k]
        l = sorted(d2, key = lambda k: float(d2[k][2]), reverse = True)
        for k in l:
            print("Nota API: ",d2[k][2],"Nº Mecanográfico: ", k,"Dados: ", d2[k])
    else:
        print("\nNão implementado!")
    f.close()

def ordP(option): #Ordenação por ATP
    f, d = initializeDic()
    d2 = {}
    if option == "1":
        for k in d:
            if d[k][4] != "F":
                d2[k] = d[k]
        l = sorted(d2, key = lambda k: float(d2[k][4]))
        for k in l:
            print("Nota ATP: ",d2[k][4],"Nº Mecanográfico: ", k,"Dados: ", d2[k])
    elif option == "2":
        for k in d:
            if d[k][4] != "F":
                d2[k] = d[k]
        l = sorted(d2, key = lambda k: float(d2[k][4]), reverse = True)
        for k in l:
            print("Nota ATP: ",d2[k][4],"Nº Mecanográfico: ", k,"Dados: ", d2[k])
    else:
        print("\nNão implementado!")
    f.close()

def menu():
    print("\nOrdenador da lista dos alunos de FP!")
    print()
    print("Ordenar por número (M)ecanográfico")
    print("Ordenar por (N)ome")
    print("Ordenar por (T)urma")
    print("Ordenar por (A)PI")
    print("Ordernar por AT(P)")
    print("(S)air")
    op = input("\nOpção? ").upper()
    return op

def menu2():
    print("\nEscolha da ordem:")
    print("\n(1) - Crescente")
    print("\n(2) - Decrescente")
    op = input("\nOpção? ").upper()
    return op

op = ""
while op != "S":
    op = menu()
    if op == "S":
        print("Fim")
    elif op == "M":
        op2 = menu2()
        ordM(op2)
    elif op == "N":
        op2 = menu2()
        ordN(op2)
    elif op == "T":
        op2 = menu2()
        ordT(op2)
    elif op == "A":
        op2 = menu2()
        ordA(op2)
    elif op == "P":
        op2 = menu2()
        ordP(op2)
    else:
        print("Não implementado!")
