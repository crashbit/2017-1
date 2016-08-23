#include <stdio.h>

int main(){

	int x;
	char c;
	int y;

	printf("Este programa muestra las direcciones de memoria de x c y");
	printf("\n\n %p ", &x);
	printf("\n %p ", &c);
	printf("\n %p ", &y);

	printf("\n\n");
	return 0;
}