#include <stdio.h>

int main(){

	FILE *archivo;
	char c[5];

	archivo = fopen("numeros.txt", "r");

	if(archivo == NULL){
		printf("No existe el archivo");
		return 0;
	}

	while(!feof(archivo)){
		fgets(c, 5, archivo);
		printf("%s\n", c);
	}

	printf("\n\n");
	return 0;
}