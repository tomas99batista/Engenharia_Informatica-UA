texto = input("Introduza um texto: ")
texto = texto.lower().split(" ")

d = {}

for palavra in texto:
    if palavra.isalpha():
        if palavra in d:
            d[palavra] += 1
        else:
            d[palavra] = 1

print(d)
