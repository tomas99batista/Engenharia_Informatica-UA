file = input("File abrir: ")
f = open(file)
soma = 0

while True:
    s = f.readline()
    if s == '':
        break
    else:
        soma += float(s)

print(soma)