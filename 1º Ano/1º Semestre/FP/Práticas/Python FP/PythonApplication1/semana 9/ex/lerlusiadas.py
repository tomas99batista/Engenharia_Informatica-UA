ficheiro = open("lusiadas.txt", encoding="utf8")
count = dict()
while True:
    s = ficheiro.readline()
    if s == '':
        break
    else:
        for l in s:
            if l >= 'a' and l <= 'z':
                if l.isalpha():
                    if l not in count:
                        count[l] = 1
                    else:
                        count[l] += 1
print(count)

