fi = input("file: ")
ficheiro = open (fi)
soma = 0

while True:
	s = ficheiro.readline()
	if s == "":
		break
	else:
		soma += float(s)

print(soma)
