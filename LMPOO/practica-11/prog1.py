import turtle

turtle.title("Prueba")
turtle.setup(800, 800, 0, 0)

turtle.pensize(3)
turtle.penup()
turtle.goto(-200,-50)
turtle.pendown()
turtle.begin_fill()
turtle.color('red')
turtle.circle(40)
turtle.end_fill()

turtle.goto(0,0)


turtle.done()