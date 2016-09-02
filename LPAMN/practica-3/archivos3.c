#include <stdio.h>

int main(){

	FILE *archivo;
	int total = 0;
	int numero;

	archivo = fopen("numeros.txt", "r");

	if(archivo == NULL){
		printf("No existe el archivo");
		return 0;
	}

	while(!feof(archivo)){
		numero = 0;
		fscanf(archivo, "%d,", &numero);
		total = total + numero;
	}

	printf("%d", total);

	printf("\n\n");
	return 0;
}