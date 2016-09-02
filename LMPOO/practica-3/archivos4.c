#include <stdio.h>

int main(){

	FILE *archivo;
	int numero = 33;

	archivo = fopen("numeritos.txt", "w");

	fputc('A', archivo);
	fputs("PAMN", archivo);
	fprintf(archivo, "Hola mundo %d", numero);

	fclose(archivo);
	
	printf("\n\n");
	return 0;
}