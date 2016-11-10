program multiplos

	integer valores(10), i, res

	print *, "Introduce 10 valores:"

	do i = 1, 10, 1
		print *, "valor: ", i
		read *, valores(i)
	end do

	do i = 1, 10, 1
		res = mod(valores(i), 3)
		if(res.eq.0) then
			print *, valores(i)
		end if 
	end do


end program multiplos