program prog1
	
	integer sem1, sem2, resultado, contador, n
	sem1 = 1;
	sem2 = 1;
	contador = 0

	print *, "Cuantos numeros desea? "
	read *, n

	do while(contador .ne. n)
		resultado = sem1 + sem2
		print *, resultado
		sem1 = sem2
		sem2 = resultado
		contador = contador + 1 
	end do

end program prog1