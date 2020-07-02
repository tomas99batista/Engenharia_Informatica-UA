def listmaker(l):
	newElement = input("Add a number: ")
	while len(newElement) != 0:
		l.append(int(newElement))
		newElement = input("Add a number: ")
	print(l)

n = []

listmaker(n)

def invert(l):
	newList = []

	for i in range (-1,-len(l)-1,-1):
		newList.append(l[i])
		

	print(newList)

invert(n)
	
