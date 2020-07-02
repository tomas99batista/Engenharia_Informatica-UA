def menu():
	opcao = -1
	while opcao < 0 or opcao > 2:
		print("Opcoes disponiveis:")
		print("0 - sair")
		print("1 - introduzir nova medida")
		print("2 - mostrar media atual")
		opcao = int(input("Opcao? "))
		return opcao
			
menu()

def lerValorRealPositivo():
	d = float(input("Distancia(km)? "))
	while d <= 0:
		d = float(input("Distancia(km)? "))
		return d
	
	else:
		return d
	
	t = float(input("Tempo (h)? "))	
	while t <= 0:
		t = float(input("Tempo (h)? "))
		return t
	else:
		return t

lerValorRealPositivo()

def velocidade ():
	lerValorRealPositivo()	
	v = d/t
	return v

velocidade()

def mensagem (speed):
	
	speed = velocidade (d, t)
	
	if speed <= 50:
		print("Velocidade media do veiculo: ", speed)
		print("Top")

	elif 50 < speed <= 70:
		print("Velocidade media do veiculo: ", speed)
		print("Crime")
	
	else:
		print("Velocidade media do veiculo: ", speed)
		print("Rápido")
	
mensagem(velocidade)
