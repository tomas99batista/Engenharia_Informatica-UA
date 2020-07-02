tel = ['938555182', '234567111', '776882333']
nome = ['Angelina', 'Brad', 'Claudia']
nameInput = str(input("Search bar\n"))

def identifier(x,y,z):

	for i in range(len(nome)):
		if nameInput in nome[i]:
			print(nome[i] , "-", tel[i])

identifier(tel,nome,nameInput)