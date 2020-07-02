import sys #importação do módulo sys para leitura dos argumentos

file = open(sys.argv[1]) #abre o ficheiro

counter = {} #dicionário para contar as letras

for line in file: #ciclo sobre as linhas do ficheiro
    for letter in line: #ciclo sobre as letras de cada linha
        letter = letter.lower()
        if letter.isalpha():
            if letter in counter: #Adicionar as letras ao dicionario
                counter[letter] += 1
            else:
                counter[letter] = 1

for key,value in sorted(counter.items()): #imprimir o dicionario por ordem alfabetica
    print(key, value)
