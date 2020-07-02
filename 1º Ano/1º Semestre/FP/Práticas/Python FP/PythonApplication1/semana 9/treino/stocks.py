file = open('stocks.csv', 'r', encoding="utf-8")

def maisTransacionada():
    maximo = 0
    empresa = 'x'
    for line in file:
        if file[6] > maximo:
            maximo = file[6]
            empresa = file[0]
    return maximo

print (maisTransacionada())
