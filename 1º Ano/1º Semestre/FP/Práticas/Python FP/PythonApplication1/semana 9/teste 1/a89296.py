distancia = -10 
while distancia < 0:
	distancia = float(input("Distancia (Km)? "))
 
tempo = -10
while tempo < 0:
	tempo = float(input("Tempo (h)? "))
	
velocidade = distancia / tempo

if velocidade <= 50:
	print("Velocidade media do veiculo: ",velocidade)
	print("Top")

elif 50 < velocidade <= 70:
	print("Velocidade media do veiculo: ",velocidade)
	print("Crime")
	
else:
	print("Velocidade media do veiculo: ",velocidade)
	print("Rápido")
