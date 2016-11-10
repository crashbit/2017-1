program prog3
	integer x

	x = par(2)
	if(x.eq.0) then
		print *, "par"
	else
		print *, "impar"
	end if
end program

real function par(m)
	integer m
	par = mod(m, 2)
	return
end 
