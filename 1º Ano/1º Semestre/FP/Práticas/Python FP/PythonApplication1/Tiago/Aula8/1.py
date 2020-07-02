texto = input("Introduza um texto: ")

d = {}

for c in texto.lower():
    if c.isalpha():
        if c in d:
            d[c] += 1
        else:
            d[c] = 1

print(d)
