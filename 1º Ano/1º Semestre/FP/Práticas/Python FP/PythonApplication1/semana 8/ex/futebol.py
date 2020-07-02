print("Bem Vindo!")
equipas = []
equipa1 = input("Equipa Nº 1: ")
equipas.append(equipa1)
equipa2 = input("Equipa Nº 2: ")
equipas.append(equipa2)
equipa3 = input("Equipa Nº 3: ")
equipas.append(equipa3)
equipa4 = input("Equipa Nº 4: ")
equipas.append(equipa4)

def confronto(l, dict):
    
    for i in range(len(l) - 1):
        for x in range(i + 1,len(l)):
            print(l[i], "vs" , l[x])
            dict[l[i]] = l[x]
    print(dict)

    return dict

confrontos = {}
confronto(equipas, confrontos)