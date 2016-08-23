#include <stdio.h>
#include <string.h>

int main(){
	struct Alumno{
		char nombre[20];
		int edad;
		char sexo;
		float promedio;
	};

	struct Alumno fi;

	fi.edad = 20;
	strcpy(fi.nombre, "Leda");
	fi.sexo = 'M';

	printf("\n %s, %d, %c", fi.nombre, fi.edad, fi.sexo);

	printf("\n\n");
	return 0;

}