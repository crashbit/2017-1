#include <stdio.h>

int main(){

	FILE *archivo;
	char c;

	archivo = fopen("numeros.txt", "r");

	if(archivo == NULL){
		printf("No existe el archivo");
		return 0;
	}

	while(c != EOF){
		c = fgetc(archivo);
		printf("%c", c);
	}

	printf("\n\n");
	return 0;
}