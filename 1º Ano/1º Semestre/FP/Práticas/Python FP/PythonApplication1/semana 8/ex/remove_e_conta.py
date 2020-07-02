def remove_e_conta(lst, x):
	count = 0
	l = []
	for i in lst:
		if i != x:
			l.append(i)
		else:
			count += 1
			
	return l, count
	
lista = [1,2,3,4,4,4,4,5,6,7,8,2,4,6,7,8]
print(lista)

remove = int(input("Q nº remover? "))

print(remove_e_conta(lista, remove))
