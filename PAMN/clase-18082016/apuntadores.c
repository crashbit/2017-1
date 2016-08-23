#include <stdio.h>

int main(){
	int x = 3;
	int *p;

	printf("\n %p ", &x);
	printf("\n %p ", &p);

	printf("\n\n");

	p = &x;
	
	printf("\n %p -> %p ", p, &x);
	printf("\n %p -> %d ", p, *p);
	
	*p = 22;
	printf("\n %p -> %d ", p, x);


	printf("\n\n");
	return 0;
}