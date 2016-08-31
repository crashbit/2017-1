#include <stdio.h>

int main(){
	
	FILE *archivo;
	char c[5];
	int x;

	archivo = fopen("hola.txt", "r");

	if(archivo == NULL){
		printf("No existe el archivo");
		return 0;
	}

	while(!feof(archivo)){
		//c = fgetc(archivo);
		//fgets(c, 5, archivo);
		fscanf(archivo, "%d", &x);
		printf("%d\n", x+2);
	}

	fclose(archivo);

	printf("\n\n");
	return 0;
}