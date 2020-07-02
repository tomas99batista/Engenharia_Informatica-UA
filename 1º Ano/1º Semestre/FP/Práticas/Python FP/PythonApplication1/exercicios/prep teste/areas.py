import math

print("Escolha a area a calcular:")
print("1: Quadrado")
print("2: Retangulo")
print("3: Triangulo")
print("4: Circunferencia")

def area_quadrado(lado):
	return lado * lado

def perimetro_quadrado(lado):
	return 4 * lado
	
def area_retangulo(comprimento, altura):
	return comprimento * altura

def perimetro_retangulo(comprimento, altura):
	return comprimento * 2 + altura * 2

def area_triangulo(base, altura):
	return (base * altura) / 2

def perimetro_triangulo(base):
	return 3 * base

def area_circunferencia(raio):
	return math.pi * raio * raio

def perimetro_circunferencia(raio):
	return math.pi * (raio * 2)

		
x=-1
while x <= 0 or x>= 5:
	x = int(input("Insira a área desejada: "))

if x == 1:
	lado = -1
	while lado <= 0:
		lado = int(input("Lado: "))
	print("Area: {}, Perimetro: {}".format(area_quadrado(lado), perimetro_quadrado(lado)))

if x == 2:
	comprimento = -1
	altura = -1 
	while comprimento <= 0:
		comprimento = int(input("Comprimento: "))
	while altura <= 0:
		altura = int(input("Altura: "))
	print("Area {}, Perimetro {}".format(area_retangulo(comprimento, altura), perimetro_retangulo(comprimento, altura)))
	
if x == 3:
	base = -1
	altura = -1 
	while base <= 0:
		base = int(input("Base: "))
	while altura <= 0:
		altura = int(input("Altura: "))
	print("Area {}, Perimetro {}".format(area_triangulo(base, altura), perimetro_triangulo(base)))

if x == 4:
	raio = -1
	while raio <= -1:
		raio = int(input("Raio: "))
	print("Area {}, Perimetro {}".format(area_circunferencia(raio), perimetro_circunferencia(raio)))
