import turtle
t = turtle.Pen()

def cuadrado(tamano, red, green, blue):
	t.color(red, green, blue)
	t.begin_fill()
	t.forward(tamano)
	t.left(90)
	t.forward(tamano)
	t.left(90)
	t.forward(tamano)
	t.left(90)
	t.forward(tamano)
	t.left(90)
	t.end_fill()

cuadrado(125, 1, 0.5, 0.5)
cuadrado(100,0.5, 0.5, 1 )
cuadrado(75, 0, 0, 1)
cuadrado(50, 0, 1, 0)
cuadrado(25, 1, 0, 0)

raw_input()