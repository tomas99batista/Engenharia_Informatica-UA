def maximum(l):
	max = l[0]
	for i in l:
		if i > max:
			max = i
	return(max)

n = [0, 1, 2, 3, -1]
x = [-2]

print(maximum(x))