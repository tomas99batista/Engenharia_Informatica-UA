x = int(input("Quantidade de litros a abastecer? "))

b = x * 1.40

c = (x * 1.40) * 0.90

if x > 40:
	print("Preço :", c, "€")
	
else:
	print("Preço :", b, "€")
