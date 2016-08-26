#include <stdio.h>

int main(){
	
	int x;
	int *p;

	p = &x;

	*p = 3;

	printf("\n%p -> %d", &x, x);
	printf("\n%p", p);


	printf("\n\n");
	return 0;
}