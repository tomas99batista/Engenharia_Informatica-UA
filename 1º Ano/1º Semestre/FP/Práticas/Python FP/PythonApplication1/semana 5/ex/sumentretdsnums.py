a = int(input("N1: "))
b = int(input("N2: "))

def sumAll (a, b):
	x = range (a , b + 1)
	return sum(x)
	
print (sumAll (a,b))
