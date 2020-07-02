equipas=['SLB','SCP','FCP']

def confronto(l):
	for i in range(len(l)-1):
		for x in range(i+1,len(l)):
			print(l[i], "vs" , l[x])

confronto(equipas)

print("Sou um génio.")