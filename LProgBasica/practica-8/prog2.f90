program prog2
	integer opcion

	print *, "Elija una opcion:"
	print *, "opcion 1"
	print *, "opcion 2"
	print *, "opcion 3"

	read *, opcion

	c = a + b
	d = c + 1
	 y = sqrt(x)   SQUARE ROOT

	select case(opcion)
		case (1)
			print *,"Opcion 1"
		case (2)
			print *,"Opcion 2"
		case (3)
			print *,"Opcion 3"
		case default
			print *,"esa opcion no existe"
	end select 

end program prog2