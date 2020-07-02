def maior(l):
	maxim = l[0]
	for n in l:
		if n > maxim:
			maxim = n
	return maxim
	
	
a = [1,2,3,5,6,7,8,1,2,10,30,3]

print(maior(a))
