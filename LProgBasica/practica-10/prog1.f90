program arreglos

integer arreglo(10), b(5)
integer i

b = 20
arreglo = 4
arreglo(9) = 70

arreglo = arreglo + 1

do i=1,6,1
	arreglo(i)  = arreglo(i) + b(i)
end do

print *, arreglo
print *, arreglo(9)


end program arreglos

