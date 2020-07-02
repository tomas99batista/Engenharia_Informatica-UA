def readFile():
    try:
        fin = input("\nNome do ficheiro: ")
        fin = open(fin)
    except:
        print("\nErro!")
    else:
        print("\nFicheiro aberto com sucesso!")
        l = []
        for line in fin:
            for word in line.split():
                word = word.lower()
                if word[len(word)-1].isalpha():
                    if word not in l:
                        l.append(word)
                    if word not in counter:
                        counter[word] = 1
                    else:
                        counter[word] += 1
                else:
                    if word[0:len(word)-1] not in l:
                        l.append(word[0:len(word)-1])
                    if word[0:len(word)-1] not in counter:
                        counter[word[0:len(word)-1]] = 1
                    else:
                        counter[word[0:len(word)-1]] += 1
        print(sorted(l))
        print()
        fin.close()
        return counter







def menu():
    print("\nOrdenador de texto!")
    print()
    print("\n(L)er um ficheiro e ordenar as palavras lexicograficamente")
    print("(N)úmero de ocorrências das palavras por ordem decrescente")
    print("(T)erminar")
    op = input("Opção? ").upper()
    return op

op = ""
counter = {}
while op != "T":
    op = menu()
    if op == "T":
        print("Fim")
    elif op == "L":
        counter = readFile()
    elif op == "N":
        if counter != {}:
            for i in sorted(counter, key=counter.get, reverse=True):
                print (" ",i," - ", counter[i])
        else:
            print("\nOperação inválida!")
    else:
        print("Não implementado!")
