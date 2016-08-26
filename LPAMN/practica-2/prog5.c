#include <stdio.h>

#include <string.h>
int main(){
	
	int x[5] = {2, 4, 7, 10, 22};
	int *p;
	char c[5];

	p = x;
	p++;

	gets(c);

	printf("\n %d", *p);
	printf("\n %d", p[1]);


	printf("\n\n");
	return 0;
}