#Defenir os valores random do pc
from random import randint

#Jogo da Pedra, Papel, Tesoura
print("Bem vindo ao jogo da Pedra, Papel Tesoura!")
print("Vamos testar-te contra o computador :D")

#Defenir a função do jogo
def jogo (x, r, vitorias, derrotas, empates, jogos_jogados):
	if x == 1:
		if x == r:
			print("Ups o PC também escolheu Pedra --'")
			empates+=1	
		else:
			if r == 2:
				print("Shieet, o PC escolheu Papel ;(")
				derrotas+=1	
			else:
				print("GG m8, o PC vacilou(escolheu Tesoura), bela vitória :D")
				vitorias+=1			
	elif x == 2:
		if x == r:
			print("Ups o PC também escolheu Papel --'")
			empates+=1
		else:
			if r == 3:
				print("Shieet, o PC escolheu Tesouras ;(")
				derrotas+=1
			else:
				print("GG m8, o PC vacilou(escolheu Pedra, bela vitória :D")
				vitorias+=1
	elif x == 3:
		if x == r:
			print("Ups o PC também escolheu Tesouras --'")
			empates+=1
		else:
			if r == 1:
				print("Shieet, o PC escolheu Pedra ;(")
				derrotas+=1
			else:
				print("GG m8, o PC vacilou(escolheu Papel), bela vitória :D")
				vitorias+=1
	
	jogos_jogados+=1
	print("Empates:",empates)
	print("Vitórias:",vitorias)
	print("Derrotas:",derrotas)
	print("Jogos jogados:",jogos_jogados)
	
	return jogos_jogados, vitorias, derrotas, empates
	
	

def main():
	i=0 #Definir loop do jogo
	#Variables
	vitorias=0
	empates=0
	derrotas=0
	jogos_jogados=0
	while i == 0:
		print("(1)Pedra \n(2)Papel \n(3)Tesoura")
		#Definir counts
		r = randint(1,3)
		x = int( input("Escolhe a tua 'arma': "))

		while x<1 or x>3:
			x = int (input("Ups!! Valor inválido introduzido :O !! Tenta outra vez: "))

		#Chamar a função
		jogo(x, r, vitorias, derrotas, empates, jogos_jogados)
		i = int(input("Quer jogar outra vez? Sim(0) Não(1)"))

		
main()	