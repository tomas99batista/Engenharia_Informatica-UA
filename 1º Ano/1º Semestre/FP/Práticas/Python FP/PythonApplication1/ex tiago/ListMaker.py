def listmaker(l):
	newElement = input("Add a number: ")
	while len(newElement) != 0:
		l.append(int(newElement))
		newElement = input("Add a number: ")
	print(l)

n = []
x = [2,3]

listmaker(x)

