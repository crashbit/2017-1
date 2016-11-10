program funciones
	integer x
	integer y

	print *, "Valor de x: ", x
	print *, "Valor de y: ", y

	y = 2

	x = suma1104(y)

	print *, "Valor de x: ", x
	print *, "Valor de y: ", y

end program funciones

real function suma1104(m)
	integer m
	m = m + 10
	suma1104 = 20 + m
	print *, "funcion1104"
end 