import random

#Defenir função do jogo
def jogo(resposta,rand):
	opcoes = ["pedra","papel","tesoura"]
	print("PC: {}, TU: {}".format(opcoes[rand-1], opcoes[resposta-1]))
	if resposta-rand==1 or resposta-rand==-2:
		print("Win")
	elif resposta-rand==2 or resposta-rand==-1:
		print("Lose")
	else:
		print("Draw")


def gInput(a,b):
	print("Opção:\n1-Pedra\n2-Papel\n3-Tesoura")
	while(1):
		ans=int(input())
		if(ans<a or ans>b): print("Valor inválido, tente outra vez:",end='')
		else: return ans
		
def runGame():
	x=gInput(1,3)
	jogo(x,random.randint(1,3))
	
def main():
	while(1):
		opcao = input("Começar um jogo (1-Sim / 2-Nao)")
		if opcao=="1": runGame()
		elif opcao=="2": return 1
		else: print("Opção inválida, tente outra vez: ",end='')
		
main()