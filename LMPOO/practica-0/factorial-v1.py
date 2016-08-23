# Desarrollo del programa de factorial usando un for

#Declaramos un valor inicial
n = 5
total = 1

#Utilizamos un for para iterar
for i in reversed(range(1,n+1)):
	total = total * i

print(total)