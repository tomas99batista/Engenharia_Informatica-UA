texto = input("Texto?: ")

d = dict()

for i in texto.split( ):
	if i in d:
		d[i] += 1
			
	else:
		d[i] = 1
			

print(d)
