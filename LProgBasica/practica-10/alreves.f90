program alreves
	integer valores(5), i

	print *, "Introduce valores"

	do i = 1, 5, 1
		print *, "valor: ", i
		read *, valores(i)
	end do

	do i = 5, 1, -1 
		print *, valores(i)
	end do

end program alreves