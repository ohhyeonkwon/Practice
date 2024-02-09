import math
import turtle

t=turtle.Turtle()

t.pendown()
for angle in range(360):
    y=math.sin(math.radians(angle))
    scaledX=angle
    scaledY=y*100
    print(scaledX,scaledY)
    t.goto(scaledX,scaledY)
t.penup()
