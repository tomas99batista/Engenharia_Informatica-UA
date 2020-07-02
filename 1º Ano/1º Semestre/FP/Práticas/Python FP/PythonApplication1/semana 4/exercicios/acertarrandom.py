import random

n = random.randint (1,100)

num = int(input("Nº: "))

x = 1

while num != n:
	 
	if num > n:
		x = x + 1
		print("Demasiado elevado, tenta um número menor")
	
	else:
		x = x + 1
		print("Demasiado baixo, tenta um número maior")
	
	num = int(input("Outro nº: "))
		
print("Acertaste, o número era", n)
print("Precisaste de", x, "tentativas")
