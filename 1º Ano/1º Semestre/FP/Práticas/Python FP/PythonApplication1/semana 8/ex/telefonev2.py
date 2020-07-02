# Complete este programa como pedido no guião da aula.
def listContacts(dic):
    """Print the contents of the dictionary as a table, one item per row."""
    print("{:>12s} : {}".format("Numero", "Nome"))
    for num in dic:
        print("{:>12s} : {}".format(num, dic[num]))

def numberToName(contactos):
    """Returns the name associated to the given phone number,
    or the same number, if not in the contacts."""
    number = input("Número a procurar: ")
    if number in contactos:
        print("Nome: ",contactos[number])
    else:
        print("Not Found!", number)
    

def filterPartName(contactos):
    """Returns a new dict with the contacts whose names contain partName."""
   
def addContact():
    name = input("Nome: ")
    number = input("Número: ")
    novo = contactos[number] = name
    return novo

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

def removeContact(contactos):
    numero = input("Número a remover? ")
    if numero in contactos:
        del contactos[numero]
    else:
        print("Not Found! Impossível remover!")
    return contactos

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
        addContact()
    elif op == "R":
        removeContact(contactos)
    elif op == "N":
        numberToName(contactos)
    elif op == "P":
        filterPartName(contactos)
    else:
        print("Não implementado!")
        menu()
    
