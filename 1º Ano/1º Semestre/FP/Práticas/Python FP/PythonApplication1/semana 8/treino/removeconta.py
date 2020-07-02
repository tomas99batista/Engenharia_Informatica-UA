lista = [1,2,3,4,5,6,7,8,9,10,2,3,5,5,5,5,5,5,5]
print (lista)
remover = int(input("nº a remover? "))
def remove_e_conta(lst, x):
    l = []
    s = 0
    for i in lst:
        if i != x:
            l.append(i)
        else: 
            s += 1
    return l, s

print(remove_e_conta(lista,remover))