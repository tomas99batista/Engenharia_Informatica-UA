def segredo():
    from random import randint
    algarismo1 = randrange(1,10)
    algarismo2 = randrange(0,10)
    algarismo3 = randrange(0,10)    
    algarismo4 = randrange(0,10)
    segredo = [algarismo1, algarismo2, algarismo3, algarismo4]
    return segredo

def valida():
    tentativa = input("Tenta adivinhar! ")
    while len(tentativa) != 4:
        print("A tua tentativa deve conter 4 algarismos!")
        tentativa = input("Tenta adivinhar!")
    return tentativa

def pontuacao(segredo, tentativa):
    for i in segredo:
        for k in tentativa:
            if 