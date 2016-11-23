class Producto():
	def __init__(self, id, nombre, precio):
		self.id = id
		self.nombre = nombre
		self.precio = precio

	def __str__(self):
		return self.nombre