import os, sys

def fileSize():
    directory = sys.argv[1]
    for root, dirs, files in os.walk(directory, topdown=False):
        for name in files:
            print("Root & Name: {:^30} File Size: {:<7} bytes".format(os.path.join(root, name), os.stat(name).st_size))

fileSize()
