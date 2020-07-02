import sys



def compareFiles():
    fic.seek(0) ; fic2.seek(0)
    count = 0
    while True:
        block = fic.read(1024)
        block2 = fic2.read(1024)
        for line in block:
            for char in line:
                letra = char
        for line in block2:
            for char in line:
                letra2 = char
        if letra != letra2:
            return "Os ficheiros são diferentes"
    return "Os ficheiros são iguais"











try:
    fic = input("Nome do primeiro ficheiro: ")
    fic = open(fic)
    fic2 = input("Nome do segundo ficheiro: ")
    fic2 = open(fic2)
except:
    print("Erro!")
else:
    print("Ficheiros abertos com sucesso!")
    compareFiles()
