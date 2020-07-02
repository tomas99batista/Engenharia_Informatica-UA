#Pedido das equipas ao utilizador
print("\nCampeonato de Futebol!\n")
equipas = []
for i in range(4):
    equipa = input("Equipa {}: ".format(i+1))
    equipas.append(equipa)

#Pedido dos resultados de cada jogo
resultados = {} ; golos = {} ; pontos = {} ; jogos = {}
for i in range(4):
    for j in range(4):
        if i == j:
            continue
        else:
            print("\n{} x {}".format(equipas[i],equipas[j]))
            golosi = int(input("Golos {}: ".format(equipas[i])))
            golosj = int(input("Golos {}: ".format(equipas[j])))
            jogos[equipas[i],equipas[j]] = [golosi,golosj]
            if golosi > golosj:
                if equipas[i] not in resultados:
                    resultados[equipas[i]] = [1,0,0]
                else:
                    resultados[equipas[i]][0] += 1

                if equipas[j] not in resultados:
                    resultados[equipas[j]] = [0,0,1]
                else:
                    resultados[equipas[j]][2] += 1
            elif golosi == golosj:
                if equipas[i] not in resultados:
                    resultados[equipas[i]] = [0,1,0]
                else:
                    resultados[equipas[i]][1] += 1
                if equipas[j] not in resultados:
                    resultados[equipas[j]] = [0,1,0]
                else:
                    resultados[equipas[j]][1] += 1
            else:
                if equipas[i] not in resultados:
                    resultados[equipas[i]] = [0,0,1]
                else:
                    resultados[equipas[i]][2] += 1
                if equipas[j] not in resultados:
                    resultados[equipas[j]] = [1,0,0]
                else:
                    resultados[equipas[j]][0] += 1

            if equipas[i] not in golos:
                golos[equipas[i]] = [golosi,golosj]
            else:
                golos[equipas[i]][0] += golosi
                golos[equipas[i]][1] += golosj

            if equipas[j] not in golos:
                golos[equipas[j]] = [golosj,golosi]
            else:
                golos[equipas[j]][0] += golosj
                golos[equipas[j]][1] += golosi

for i in range(4):
    pontos[equipas[i]] = (resultados[equipas[i]][0] * 3) + resultados[equipas[i]][1]




l = sorted(pontos, key = lambda k: pontos[k], reverse = True)

'''for i in l:
    for j in l:
        if i == j:
            continue
        else:
            if l[i] == l[j]:
                resultado1 = jogos[equipas[i],equipas[j]]
                if resultado1[0] > resultado1[1]:
                    pontos1 = 3
                elif resultado1[0] == resultado1[1]:
                    pontos1 = 1
                    pontos2 = 1
                else:
                    pontos1 = 0
                resultado2 = jogos[equipas[j],equipas[i]]
                if resultado2[0] > resultado2[1]:
                    pontos2 = 3
                elif resultado1[0] == resultado1[1]:
                    pontos2 = 1
                    pontos1 = 1
                else:
                    pontos2 = 0
                if pontos1 < pontos2:
                    l[i] = l[j]
                    l[j] = l[i]'''

count = 1
for k in l:
    print()
    print(count, "º - ", k, " Pontos: ",pontos[k]," Vitórias: ",resultados[k][0], " Empates: ",resultados[k][1], " Derrotas: ", resultados[k][2], " Golos Marcados: ", golos[k][0], " Golos Sofridos: ", golos[k][1] )
    count += 1
