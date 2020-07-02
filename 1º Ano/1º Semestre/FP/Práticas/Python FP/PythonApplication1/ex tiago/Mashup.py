def maximum(l):
	max = l[0]
	for i in l:
		if i > max:
			max = i
	return(float(max))
	print(max)

def inf8(l):
	smaller = 0
	for i in l:
		if i < float(maximum(n)/2):
			smaller = smaller + 1
	return(smaller)
	print(smaller)

n = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]

print("O máx atingido foi" , maximum(n))
print("Metade do máx é então" , float(maximum(n)/2))

print("Na sua lista há" , inf8(n) , "elementos menores que metade do máximo valor atingido!")