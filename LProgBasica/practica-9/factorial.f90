program factorial
	integer i, n, fact

	fact = 1
	print *, "Introduzca el numero que desea el factorial: "
	read *, n

	if(n.eq.0)then 
		print *, fact
	else
		do i=n, 1, -1
			fact = fact * i
			print *, fact
		end do
	end if 



end program factorial

