#include <stdio.h>

int main(){
	
	int x;
	void *cajoncito;
	char c;
	char *p;

	x = 10;
	c = 'A';

	cajoncito = &c;
	c= 'S';

	p = cajoncito;

	printf("\n%c", c);
	printf("\n%c", *p);

	printf("\n\n");
	return 0;
}