from Producto import Producto

class Carrito():
	def __init__(self, id):
		self.id = id
		self.lista = []

	def agregar(self, producto, cantidad):
		tupla = (producto, cantidad)
		self.lista.append(tupla)

	def getLista(self):
		return self.lista
