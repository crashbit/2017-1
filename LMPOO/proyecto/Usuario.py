class Usuario():
	def __init__(self, id, nombre):
		self.id = id
		self.nombre = nombre

	def __str__(self):
		return self.nombre

class Cliente(Usuario):
	def __str__(self):
		return "Soy un cliente"

	def ligaCarrito(self, carrito):
		self.carrito = carrito

	def agregarProducto(self, producto, cantidad):
		self.carrito.agregar(producto, cantidad)

	def listarProductos(self):
		lista = self.carrito.obtenLista()
		return lista

class Cajero(Usuario):
	def __str__(self):
		return "Soy un cajero"

	def cobrar(self, Cliente):
		lista = Cliente.listarProductos()
		total = 0
		print "producto\tprecio\tunidades\ttotal"
		for producto in lista:
			subtotal = producto[0].precio * producto[1]	
			total = total + subtotal
			print "%s\t\t%d\t%d\t\t%d" % (producto[0].nombre, producto[0].precio, producto[1], subtotal)

		print "-----------------------------------------"
		print "\t\t\t\ttotal: %d" %(total)

class Proveedor(Usuario):
	def __str__(self):
		return "Soy un proveedor"

