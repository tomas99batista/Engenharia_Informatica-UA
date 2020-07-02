def listmaker(l):
	newElement = input("Add a number: ")
	while len(newElement) != 0:
		l.append(int(newElement))
		newElement = input("Add a number: ")
	print(l)

n = []

listmaker(n)

def swapper(l):
	x = int(input("X = "))
	y = int(input("Y = "))
	newList = []
	
	for i in l:
		if i == x:
			newList.append(y)
		else:
			newList.append(i)

	return(newList)

print("Nova lista: " , swapper(n))
print("Antiga lista: " , n)
