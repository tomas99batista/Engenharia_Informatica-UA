'''Para este exercício, irá ser usado o mesmo ficheiro do exercício anterior para
   calcular a mediana das notas da API'''

f = open('fp.csv', 'r', encoding='utf8') #Abrir o ficheiro
f.readline() #ignore header
d = {}

for l in f:
    fields = l.rstrip().split(',')
    d[fields[0]] = tuple(fields[1:])

d2 = {}

for k in d:
    if d[k][2] != "F":
        d2[k] = d[k]
l = sorted(d2, key = lambda k: float(d2[k][2]))
notas = []

for k in l:
    notas.append(d2[k][2])

def mediana(lista):
    if len(lista) % 2 == 0:
        meio = int((len(lista) / 2) - 1)
        med = (float(lista[meio]) + float(lista[meio + 1])) / 2
    else:
        med = lista[int((len(lista) / 2) - 0.5)]
    return med

listaPar = [1,2,3,4,5,6,7,8,9,10]
listaÍmpar = [1,2,3,4,5,6,7,8,9]

print("Mediana par: ", mediana(notas))
print("Mediana par2: ", mediana(listaPar))
print("Mediana ímpar: ", mediana(listaÍmpar))

f.close()
