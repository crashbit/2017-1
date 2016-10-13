program primos
	integer i, n, p, primo
	primo = 1

	print *, "Numero? "
	read *, n
	do i=2, n-1, 1
		p = mod(n, i)
		if(p.eq.0) then
			print *, "No es primo"
			primo = 0
			exit
		end if
	end do

	if(primo.eq.1)then
		print *, n, "es primo"
	else 
		print *, n, "NO ES PRIMO"
	end if

end program primos