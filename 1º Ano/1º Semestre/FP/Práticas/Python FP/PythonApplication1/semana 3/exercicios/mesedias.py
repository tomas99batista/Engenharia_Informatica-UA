m = int(input("Mês: "))
a = int(input("Ano: "))

if (a % 100) == 0 and (a % 400) == 0:
	if m == 8:
		dias = "31 dias"
	elif m == 2:
		dias = "29 dias"
	elif (m % 2) == 0:
		dias = "30 dias"
	else:
		dias = "31 dias"
	
elif (a % 4) == 0:
	if m == 8:
		dias = "31 dias"
	elif m == 2:
		dias = "29 dias"
	elif (m % 2) == 0:
		dias = "30 dias"
	else:
		dias = "31 dias"
		
else:
	if m == 8:
		dias = "31 dias"
	elif m == 2:
		dias = "28 dias"
	elif (m % 2) == 0:
		dias = "30 dias"
	else:
		dias = "31 dias"

print (dias)
