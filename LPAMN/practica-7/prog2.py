#coding : UTF-8
archivo = open('cps.txt', 'r')

cp = raw_input('Codigo postal: ')
for linea in archivo:
	lista = linea.split('|')
	if cp in lista:
		print lista[1]
		print lista[3]