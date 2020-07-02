fic = open('stocks.csv')

def EMT(): # a) Empresa Mais Transacionada (com maior volume total).
    dic = {}
    biggest = 0
    for line in fic:
        l = line.rstrip().split(',')
        if l[0] in dic:
            dic[l[0]] += int(l[6])
        else:
            dic[l[0]] = int(l[6])
        if dic[l[0]] > biggest:
            biggest = dic[l[0]]
            t = (l[0], dic[l[0]])
    return t

print(EMT())

def BA(): #b) Dia e valor em que cada ação atingiu o valor mais elevado.
    dic = {}
    biggest = 0
    date = ''
    for line in fic:
        l = line.rstrip().split(',')
        if eval(l[3]) > biggest:
            biggest = eval(l[3])
            date = l[1]
        dic[l[0]] = (date, biggest)
    return dic

#print(BA())

def EMVD(): #c) Empresa com maior valorização diária.
    dic = {}
    for line in fic:
        l = line.rstrip().split(',')
        if l[1] not in dic:
            dic[l[1]] = (l[0], eval(l[3]))
        else:
            if eval(l[3]) > dic[l[1]][1]:
                dic[l[1]] = (l[0], eval(l[3]))
    return dic

#print(EMVD())
