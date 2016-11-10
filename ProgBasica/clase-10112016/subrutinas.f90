program intercambia

	integer x, y
	x = 33
	y = 75

	print *, "Valor de x: ", x
	print *, "Valor de y: ", y

	call cambia(x, y)

	print *, "Valor de x: ", x
	print *, "Valor de y: ", y

end program intercambia

subroutine cambia(a, b)
	integer a, b
	integer aux
	
	aux = a
	a = b
	b = aux

	return
end 