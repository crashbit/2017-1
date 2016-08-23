# Calculo de un nUmero factorial utilizando una funcion recursiva
# declaramos la funcion 
def factorial(n):
	#Si llegamos a cero debemos regresar 1
	if n == 0: return 1
	if n > 0:
		#Aqui aplicamos la recursividad
		return n * factorial(n-1)

print(factorial(5))