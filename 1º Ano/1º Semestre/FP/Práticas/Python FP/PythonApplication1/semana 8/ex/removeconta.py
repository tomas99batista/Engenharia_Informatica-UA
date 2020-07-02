lst = [1,2,3,4,5,6,7,7,8,9]
print(lst)
def remove_e_conta(lista, x):
    l = []
    count = 0
    for i in lista:
        if i != x:
            l.append(i)
        else:
            count += 1
    print(l, ": nova lista")
    print(count, ": nº de vezes")

x = int(input("Nº a remover?"))

remove_e_conta(lst, x)


