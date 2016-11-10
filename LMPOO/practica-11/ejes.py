import turtle
import math

def dibujaLinea(ttl, x1, y1, x2, y2):
	ttl.penup()
	ttl.goto(x1,y1)
	ttl.pendown()
	ttl.goto(x2,y2)
	ttl.penup()

def etiquetaPunto(ttl, x, y, etiqueta):
	ttl.penup()
	ttl.goto(x,y)
	ttl.pendown()
	ttl.write(etiqueta)
	ttl.penup()

def dibujaMarcas(ttl, x, y, esVertical):
	if esVertical:
		dibujaLinea(ttl, x, y+5, x, y-5)
	else:
		dibujaLinea(ttl, x+5, y, x-5, y) 

def dibujaEtiquetasMarcas(ttl, x, y, esVertical, etiqueta):
	if esVertical:
		etiquetaPunto(ttl, x-20, y-20,etiqueta)
	else:
		etiquetaPunto(ttl, x+20, y, etiqueta)

def dibujaEje(ttl):
	dibujaLinea(ttl, -400, 0, 400, 0)
	dibujaLinea(ttl, 0, 400, 0, -400)

	for x in [-300, -200, -100, 100, 200, 300, 400]:
		dibujaMarcas(ttl, x, 0, True)
		dibujaEtiquetasMarcas(ttl,x, 0, True, (x/100, 0) )

	for y in [-300, -200, -100, 100, 200, 300, 400]:
		dibujaMarcas(ttl, 0, y, False)
		dibujaEtiquetasMarcas(ttl,0, y, False, (0, y/100) )

def dibujaFuncion(ttl, funcion, minimo, maximo, pasos):
	ttl.penup()
	x = minimo
	y = funcion(x)

	escalaX = x * 100
	escalaY = y * 100

	ttl.goto(escalaX, escalaY)
	ttl.pendown()

	while x < maximo:
		x = x + pasos
		y = funcion(x)
		escalaX = x * 100
		escalaY = y * 100
		ttl.goto(escalaX, escalaY)

	ttl.penup()

def miFuncion(x):
	return x**2 - 4


turtle.setup(800, 800, 0, 0)
dibujaEje(turtle)


dibujaFuncion(turtle, math.cos, -math.pi, math.pi, 0.01)
dibujaFuncion(turtle, math.sin, -math.pi, math.pi, 0.01)
dibujaFuncion(turtle, miFuncion, -math.pi, math.pi, 0.01)
turtle.done()