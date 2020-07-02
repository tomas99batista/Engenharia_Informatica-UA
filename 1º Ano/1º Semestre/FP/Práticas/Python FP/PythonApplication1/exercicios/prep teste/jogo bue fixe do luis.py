import random



def jogo():
	acabou = False
	print("Então fode-te, {}".format(input("Como te chamas cabrao?")))
	while not acabou:
		computador = random.randint(0,2)
		possiveis = ["pedra", "papel", "tesoura"]
		jogador = input("Pedra, Papel ou Tesoura\n").lower()
		jogador = possiveis.index(jogador)
		if jogador == computador:
			print("Empate :c")
		elif computador>jogador and jogador != 0:
			print("Hehe fodeste te, {} ganha a {} seu animal do caralho".format(possiveis[computador], possiveis[jogador]))
		else:
			print("Fodeste me, {} ganha a {}".format(possiveis[jogador], possiveis[computador]))
			print("Tiveste sorte, para a proxima fodo-te")
		if input("Queres tentar foder me +1x? (s/n)") == "s":
			acabou = False
		else:
			acabou = True
			
jogo()
		
