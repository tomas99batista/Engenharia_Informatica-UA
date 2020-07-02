tel = ['938555182', '234567111', '776882333']
nome = ['Angelina', 'Brad', 'Claudia']
cell = str(input("Dá-me o teu número ;)\n"))

def identifier(x,y,z):
	verified = 0
	for i in range(len(x)):
		if x[i] == z:
			print(y[i])
			verified = 1
			break

	if verified != 1:
		print(z)


identifier(tel,nome,cell)
			
		
