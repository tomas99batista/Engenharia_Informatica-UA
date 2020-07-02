# Complete este programa como pedido no guião da aula.

def listContacts(dic):
    """Print the contents of the dictionary as a table, one item per row."""
    print("{:>12s} : {}".format("Numero", "Nome"))
    for num in dic:
        print("{:>12s} : {}".format(num, dic[num]))

def addContact():
    nome = input("Nome do contacto: ") #Nome
    palavrasNome = nome.lower().split(" ")
    contador1 = 0;
    for p in palavrasNome:
        if p.isalpha():
            contador1 += 1
    numero = input("Número do contacto: ") #Número
    if contador1 == len(palavrasNome) and len(numero) == 9 and numero.isdigit():
        contactos[numero] = nome
        print("Contacto adicionado!")
    else:
        print("Erro!")

def removeContact():
    numero = input("Número a remover: ")
    if numero in contactos.keys():
        del contactos[numero]
        print("Contacto removido!")
    else:
        print("Contacto não listado")

def findNumber():
    numero = input("Número a procurar: ")
    valor = numberToName(contactos, numero)
    if valor == numero:
        print(numero, ": Número não listado!")
    else:
        print(valor," : ", numero)

def findPartName():
    partName = input("Parte do nome: ")
    d = filterPartName(contactos, partName)
    if len(d) != 0:
        for e in d:
            print(d[e], " : ", e)
    else:
        print("Correspondência não encontrada!")



def numberToName(contacts, number):
    """Returns the name associated to the given phone number,
    or the same number, if not in the contacts."""
    if number in contacts.keys():
        return contacts[number]
    else:
        return number


def filterPartName(contacts, partName):
    """Returns a new dict with the contacts whose names contain partName."""
    d = {}
    for number in contacts:
        if partName.lower() in contacts[number].lower():
            d[number] = contacts[number]

    return d





def menu():
    """Shows the menu and gets user option."""
    print()
    print("(L)istar contactos")
    print("(A)dicionar contacto")
    print("(R)emover contacto")
    print("Procurar (N)úmero")
    print("Procurar (P)arte do nome")
    print("(T)erminar")
    op = input("opção? ").upper()   # converts to uppercase...
    return op


#MAIN:

# The list of contacts (it's actually a dictionary!):
contactos = {"234370200": "Universidade de Aveiro",
    "727392822": "Cristiano Aveiro",
    "387719992": "Maria Matos",
    "887555987": "Marta Maia",
    "876111333": "Carlos Martins",
    "433162999": "Ana Bacalhau"
    }

op = ""
while op != "T":
    op = menu()
    if op == "T":
        print("Fim")
    elif op == "L":
        print("Contactos:")
        listContacts(contactos)
    elif op == "A":
        print("Adicionar contacto:")
        addContact()
    elif op == "R":
        print("Remover contacto:")
        removeContact()
    elif op == "N":
        print("Procurar número:")
        findNumber()
    elif op == "P":
        print("Procurar parte do nome:")
        findPartName()
    else:
        print("Não implementado!")
