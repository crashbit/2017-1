from Producto import Producto
from Usuario import Cliente
from Usuario import Cajero
from Carrito import Carrito

carrito = Carrito(1)
alonso = Cliente(1, "Alonso")
manzana = Producto(1, "manzana", 45)
naranja = Producto(2, "naranja", 10)

alonso.ligaCarrito(carrito)
alonso.agregarProducto(naranja, 2)
alonso.agregarProducto(manzana, 5)

itzel = Cajero(2, "Itzel")
itzel.cobrar(alonso)

