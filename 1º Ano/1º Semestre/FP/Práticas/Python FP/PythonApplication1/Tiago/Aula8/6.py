def construcaoDeMatrizes(m,n):
    matriz = {}
    for i in range(m):
        for j in range(n):
            valor = input("Entrada [{},{}] : ".format(i,j))
            while valor.isdigit() == False and type(eval(valor)) != int:
                print("Erro!")
                valor = input("Entrada [{},{}] : ".format(i,j))
            matriz[(i,j)] = valor

    return matriz

def somaDeMatrizes():
    m = int(input("Número de linhas da matriz: "))
    n = int(input("Número de colunas da matriz: "))
    print("\nMatriz 1: \n")
    matriz1 = construcaoDeMatrizes(m,n)
    print("\nMatriz 2: \n")
    matriz2 = construcaoDeMatrizes(m,n)
    soma = {}
    for i in range(m):
        for j in range(n):
            soma[(i,j)] = int(matriz1[(i,j)]) + int(matriz2[(i,j)])
    print(soma)


def multiplicacaoDeMatrizes():
    m = int(input("Número de linhas da 1ª matriz: "))
    n2 = int(input("Número de colunas da 1ª matriz e de filas da 2ª matriz: "))
    n = int(input("Número de colunas da 2ª matriz: "))

    print("\nMatriz 1: \n")
    matriz1 = construcaoDeMatrizes(m,n2)
    print("\nMatriz 2: \n")
    matriz2 = construcaoDeMatrizes(n2,n)
    multiplicacao = {} ; count = 0
    for i in range(m):
        for j in range(n):
            for a in range(n2):
                count += (int(matriz1[(i,a)]) * int(matriz2[(a,j)]))

            multiplicacao[(i,j)] = count
            count = 0
    print("\nMultiplicação: ",multiplicacao)


def menu():
    print("Calculadora de Matrizes!")
    print()
    print("(S)oma de Matrizes")
    print("(M)ultiplicação de Matrizes")
    print("(T)erminar")
    op = input("Opção? ").upper()
    return op

op = ""
while op != "T":
    op = menu()
    if op == "T":
        print("Fim")
    elif op == "S":
        somaDeMatrizes()
    elif op == "M":
        multiplicacaoDeMatrizes()
    else:
        print("Não implementado!")
