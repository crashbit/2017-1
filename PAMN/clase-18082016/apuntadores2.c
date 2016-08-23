#include <stdio.h>

int main(){

	int arreglo[5] = {3, 20, -1, 10, 7};
	int *x;

	x = arreglo;

	printf("\n %p =  %d", x, *x);
	x++;
	printf("\n %p =  %d", x, *x);
	x++;
	printf("\n %p =  %d", x, *x);
	x++;
	printf("\n %p =  %d", x, *x);
	x++;
	printf("\n %p =  %d", x, *x);
	x++;
	printf("\n %p =  %d", x, *x);


	printf("\n\n");
	return 0;
}