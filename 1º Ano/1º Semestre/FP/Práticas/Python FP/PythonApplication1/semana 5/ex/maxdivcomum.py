a = int(input("N1: "))
b = int(input("N2: "))

def gcdIter(a, b):
    if b == 0:
        return a
    else:
        return gcdIter(b, a % b)
      
print("MDC: ", gcdIter(a, b))
