from Carrito import Carrito
from Producto import Producto

class Usuario():
	def __init__(self,id,nombre, email):
		self.id = id
		self.nombre = nombre
		self.email = email

	def __str__(self):
		return self.nombre


class Comprador(Usuario):
	def __str__(self):
		return self.nombre

	def asignaCarrito(self, carrito):
		self.carrito = carrito

	def comprar(self, producto, cantidad):
		self.carrito.agregar(producto, cantidad)

	def mostrarProductos(self):
		lista_productos = self.carrito.getLista()
		for producto in lista_productos:
			print "%s cantidad %d" % (producto[0], producto[1])

class Cajero(Usuario):
	def __str__(self):
		return "Soy un cajero"

Juanito = Comprador(1, "Juanito", "juanito@verduras.com")
Lalito = Cajero(2, "Lalito", "lalito@cajitas.com")
carrito = Carrito(1)
Juanito.asignaCarrito(carrito)

manzana = Producto("manzana", 20)
naranja = Producto("naranja", 15)

Juanito.comprar(manzana, 4)
Juanito.comprar(naranja, 20)

Juanito.mostrarProductos()
