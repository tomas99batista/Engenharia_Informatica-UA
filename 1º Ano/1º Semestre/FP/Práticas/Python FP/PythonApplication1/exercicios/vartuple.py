def printinfo( arg1, *vartuple ):
	print(arg1)
	for var in vartuple:
		print(var)
printinfo( 10 )
printinfo( 70, 60, 50 )
