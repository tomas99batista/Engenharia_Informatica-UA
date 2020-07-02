
import cv2
import numpy as np
import math

# load an image from a file
src = cv2.imread("pic1.png")

#show the original image
cv2.imshow("source", src)

#filter the image
dst = cv2.Canny(src, 50, 200)

#convert image to grayscale
cdst = cv2.cvtColor(dst, cv2.COLOR_GRAY2BGR)

#find lines on the image
lines = cv2.HoughLinesP(dst, 1, math.pi/180.0, 40, np.array([]), 50, 10)
a,b,c = lines.shape

#iterate on the detected lines
for i in range(a):
    # draw the lines
    cv2.line(cdst, (lines[i][0][0], lines[i][0][1]), (lines[i][0][2], lines[i][0][3]), (0, 0, 255), 3, cv2.LINE_AA)

#show the image with detected lines
cv2.imshow("detected lines", cdst)

#keep the image on the screen
cv2.waitKey(0)
