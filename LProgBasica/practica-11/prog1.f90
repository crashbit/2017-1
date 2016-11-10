program prog1

	integer A(2,3), B(2,3)
	integer i, j

	do i=1,2,1
		do j=1,3,1
			print *, "Valor para A", i, j
			read *, A(i,j)
		end do
	end do

	do i=1, 2, 1
		do j=1, 3, 1
			B(i,j) = A(i,j)
		end do
	end do

	do i=1, 2, i
		print *, (A(i,j), j=1, 3)
	end do
	print *,"--------------------------"

	do i=1, 2, i
		print *, (B(i,j), j=1, 3)
	end do

end program prog1