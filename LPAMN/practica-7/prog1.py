archivo = open('datos.txt', 'r')

for linea in archivo:
	lista = linea.split(',')
	for elemento in lista:
		print elemento