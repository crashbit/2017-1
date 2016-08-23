/*
Este programa muestra las direcciones de las variables que han sido declaradas
 */

#include <stdio.h>

int main(){

	/* Declaramos variables */
	int x;
	char c;
	int y;

	/* mostramos en pantalla las direcciones en memoria de cada variable
	usar %p para indicar que requerimos una direccion para mostrar y usamos el & para devolver la dirección
	de la variable
	*/
	printf("\n %p ", &x);
	printf("\n %p ", &c);
	printf("\n %p ", &y);

	printf("\n\n");
	return 0;
}