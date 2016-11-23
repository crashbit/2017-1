from Producto import Producto

class Carrito():
	def __init__(self, id):
		self.id = id
		self.lista = []

	def agregar(self, producto, cantidad):
		par = (producto, cantidad)
		self.lista.append(par)

	def mostrar(self):
		print self.lista

	def obtenLista(self):
		return self.lista

