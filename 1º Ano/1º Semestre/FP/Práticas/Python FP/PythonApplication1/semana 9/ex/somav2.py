file = input("File: ")
ficheiro = open(file)
soma = 0 

while True: 
    s = ficheiro.readline()
    if s == "":
        break
    else:
        soma += float(s)

print(soma)
