from random import randint

print("Vamos jogar ao Pedra, Papel ou Tesoura! \nVais jogar contra o PC.\n")

x= 5
while x <= 0 or x >= 4:
	x = int(input("(1) Pedra \n(2) Papel \n(3) Tesoura \nOpção: "))
	
jogadapc = randint(0,2)

def joguinho(jogadapc, x):
 
	if jogadapc == x:
		print("Empate")
			
	elif jogadapc == 0 and x == 2:
		print("O PC escolheu Pedra!")
		print("Ganhaste, Papel ganha Pedra!")
		
	elif jogadapc == 0 and x == 3:
		print("O PC escolheu Pedra!")
		print("Perdeste, Tesoura perde contra Pedra!")
		
	elif jogadapc == 1 and x == 1:
		print("O PC escolheu Papel")
		print("Perdeste, Papel vence Pedra!")
		
	elif jogadapc == 1 and x == 3:
		print("O PC escolheu Papel!")
		print("Ganhaste, Tesoura vence Papel!")
		
	elif jogadapc == 2 and x == 1:
		print("O PC escolheu Tesoura!")
		print("Ganhaste, Pedra vence Tesoura!")
		

	elif jogadapc == 2 and x == 2:
		print("O PC escolheu Tesoura!")
		print("Perdeste, Tesoura vence Papel!")
		
joguinho(jogadapc, x)
