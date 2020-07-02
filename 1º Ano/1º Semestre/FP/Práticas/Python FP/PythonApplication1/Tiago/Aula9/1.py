file = input("Nome do ficheiro: ")

file = open(file)

soma = 0
for line in file:
    soma += int(line)

print("Soma = ", count)

file.close()
