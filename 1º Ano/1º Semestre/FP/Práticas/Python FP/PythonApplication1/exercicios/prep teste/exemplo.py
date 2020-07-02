def looptest(x):
	while True:
		print("ola")
		if x == 5:
			menu()
			break;
		x = x + 1
		
def menu():
	print("Menu")

looptest(1)
