import itertools

def interpretacoes(lista):
    l1 = [True, False]
    return list(itertools.permutations(lista, l1))


print(interpretacoes(['a', 'b']))