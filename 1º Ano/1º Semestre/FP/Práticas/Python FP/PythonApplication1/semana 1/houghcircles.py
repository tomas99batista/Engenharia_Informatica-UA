import cv2
import numpy as np

#load an image from a file
src = cv2.imread("board.jpg", 1)

#display the loaded image
cv2.imshow("source", src)

# convert the image to grayscale
img = cv2.cvtColor(src, cv2.COLOR_BGR2GRAY)

#filter the image
img = cv2.medianBlur(img, 5)

#apply an algorithm to detect circles - try to change the parameters
circles = cv2.HoughCircles(img, cv2.HOUGH_GRADIENT, 1, 10, np.array([]), 100, 30, 1, 30)

 # iterate over the detected circles and add them to the image
a, b, c = circles.shape
for i in range(b):
    # draw the found circle
    cv2.circle(src, (circles[0][i][0], circles[0][i][1]), circles[0][i][2], (0, 0, 255), 3, cv2.LINE_AA)
    # draw center of circle
    cv2.circle(src, (circles[0][i][0], circles[0][i][1]), 2, (0, 255, 0), 3, cv2.LINE_AA)

#show the image with detected circles
cv2.imshow("result", src)

#keep the windows on the screen
cv2.waitKey(0)
