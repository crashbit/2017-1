#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int *p;

	p = (int *)malloc(sizeof(int));

	*p = 22;
	p++;
	*p = 100;
	p[2] = 23;

	printf("\n%p -> %d", p, *p);
	printf("\n%p -> %d", p, p[0]);
	//printf("\n%p -> %d", p, p[2]);

	printf("\n\n");
	return 0;
}