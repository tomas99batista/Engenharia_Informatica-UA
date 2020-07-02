texto = input("Ponha aqui o seu textinho: ")
l = {}
for i in texto:
    if i.isalpha():
        if i not in l:
            l[i] = 1
        if i in l:
            l[i] += 1

print(l)