def removeAndCount(lst,x):
    count = 0
    l = []
    for element in lst:
        if element != x:
            l.append(element)
        else:
            count += 1

    return (l, count)

print(removeAndCount([1,6,2,5,5,2,5,2], 2))
print(removeAndCount([1,3,2,3,5,3,5,2], 3))
print(removeAndCount([1,4,2,5,5,4,5,2], 4))
print(removeAndCount([1,6,2,5,5,2,5,2], 5))
