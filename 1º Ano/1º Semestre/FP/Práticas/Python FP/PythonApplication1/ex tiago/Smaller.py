

def inf5(l):
	smaller = 0
	for i in l:
		if i < 5:
			smaller = smaller + 1
	print("Na sua lista há" , smaller , "elementos menores que 5!")

n = [0,5,6,2,3,7,10,100]
inf5(n)