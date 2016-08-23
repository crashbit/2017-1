#include <stdio.h>
#include <string.h>

int main(){
	struct Alumno{
		char nombre[20];
		int edad;
		char sexo;
		float promedio;
	};

	struct Alumno fi[13300];

	fi[1].edad = 20;
	fi[1].sexo = 'M';
	strcpy(fi[1].nombre, "Leda");

}