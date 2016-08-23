#include <stdio.h>
#include <stdlib.h>

int main(){

	int *x;

	x = (int *)malloc(sizeof(x));
	*x=3;
	x++;
	*x=5;
	x[3] = 10;

	printf("\n %p = %d", x, x[3]);

	printf("\n\n");
	return 0;
}