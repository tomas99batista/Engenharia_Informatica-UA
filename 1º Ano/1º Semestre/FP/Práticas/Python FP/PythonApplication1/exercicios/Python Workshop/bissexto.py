bissexto = int(input("Ano: "))

def e_bi(bissexto):
	if bissexto % 4 == 0 and bissexto % 100 != 0:
		print ("O ano é bissexto!")
	elif bissexto % 4 == 0 and bissexto % 400== 0:
		print ("O ano é bissexto!")
	else:
		print ("O ano não é bissexto!")


e_bi(bissexto)
