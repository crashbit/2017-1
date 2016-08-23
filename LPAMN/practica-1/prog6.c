#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){
	struct Alumno{
		char nombre[20];
		int edad;
		char sexo;
		float promedio;
	};

	struct Alumno *fi;

	fi = (struct Alumno *)malloc(sizeof(struct Alumno));

	fi->edad = 20;
	fi->promedio = 7.6;
	strcpy(fi->nombre, "Leda");

	printf("\n %s, %d, %f", fi->nombre, fi->edad, fi->promedio);

	printf("\n\n");
	return 0;

}