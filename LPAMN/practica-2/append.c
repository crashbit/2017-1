#include <stdio.h>

int main(){
	
	FILE *archivo;
	char c[5];
	int x = 8;

	archivo = fopen("hola.txt", "a");

	fprintf(archivo, "%d", x);


	fclose(archivo);

	printf("\n\n");
	return 0;
}