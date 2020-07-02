# Complete este programa como pedido no guião da aula.

def listContacts(dic):
	"""Print the contents of the dictionary as a table, one item per row."""
	print("{:>12s} : {}".format("Numero", "Nome"))
	for num in dic:
		print("{:>12s} : {}".format(num, dic[num]))
        
def adicionarContacto():
	name = str(input("Nome: "))
	number = input("Número: ")
	novo = contactos[number] = name
	return novo
	
def removerContacto(contactos):
	number = input("Número a remover: ")
	del contactos[number]
	return contactos

def numberToName(contacts):
	number = int(input("Número a Procurar: "))
	if number in contacts:
		print("Name: ", contactos[number])
	else:
		print(number, "Does not exist!")
		
def filterPartName(contacts, partName):
	"""Returns a new dict with the contacts whose names contain partName."""
	...


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
		adicionarContacto()
		
	elif op == "R":
		removerContacto(contactos)
	
	elif op == "N":
		numberToName(contactos)
	
	elif op == "P":
		numberToName(contacts, number)
		
	else:
		print("Não implementado!")
    
