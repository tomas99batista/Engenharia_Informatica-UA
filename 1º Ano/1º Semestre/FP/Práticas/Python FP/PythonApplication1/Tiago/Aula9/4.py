import os, sys

directory = sys.argv[1]
extension = sys.argv[2]

for root, dirs, files in os.walk(directory, topdown=False):
	for name in files:
		if extension in name:
			print(os.path.join(root, name))
