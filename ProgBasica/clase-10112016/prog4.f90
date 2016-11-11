program prog4
	integer x
	common /global/ x

	x = 20
	print *, "Valor de x: ", x
	x = cambias(2)
	
end program prog4

real function cambias(m)
	integer m
	integer x
	common /global/ x
	m = 10 + m
	x = 30
	cambias = m
	return
end 