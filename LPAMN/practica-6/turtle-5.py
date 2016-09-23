import turtle
t = turtle.Pen()

def circulo(red, green, blue):
	t.color(red,green, blue)
	t.begin_fill()
	t.circle(50)
	t.end_fill()

circulo(.5,.5,1)

raw_input()