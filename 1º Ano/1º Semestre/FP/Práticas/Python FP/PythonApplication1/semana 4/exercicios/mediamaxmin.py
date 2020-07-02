num = int(input("Nº: "))

count = 0
media = 0
min = num
max = num

while num != 0:

	media = media + num
	
	count = count + 1
	
	if num < min:
		min = num
	
	if num > max:
		max = num
	
	num = int(input("Outro nº: "))
	
print("Introduziu", count, "números")
print("Valor mais baixo:", min)
print("Valor mais alto:", max)
print("Média: ", media / count)
