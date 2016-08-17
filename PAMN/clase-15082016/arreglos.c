/*
Este programa muestra las direcciones y el uso de un arreglo linea con 5 valores
 */

#include <stdio.h>

int main(){
	/* Declaramos el arreglo de tipo entero para 5 valores y lo inicializamos*/
	int arreglo[5] = {10, 15, 0, 30, 20};

	/* imprimimos la dirección de donde esta alojado el arreglo */
	printf("\n Dirección del arreglo: %p ", arreglo);

	/* Ahora vamos a imprimir cada uno de los valores y su respectiva dirección en memoria */
	/* Usamos '&' para obtener la dirección de la posición en el arreglo */
	for(int i = 0; i < 5; i++){
		printf("\n Dirección: %p , valor: %d , posición en arreglo: %d", &arreglo[i], arreglo[i], i);
	}


	printf("\n\n");
	return 0;
}