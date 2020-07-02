p = float(input("Peso: "))
a = float(input("Altura: "))

def imc ( p, a ):
	return p/(a*a)
	
	
print ("IMC: ", imc(p,a))
 
