/*
Este programa muestra las direcciones y el uso de un arreglo bidimensional para demostrar que la memoria es lineal
 */

#include <stdio.h>

int main(){
	/* Declaramos el arreglo bidimensional de tipo entero para 9 valores (3, 3) y lo inicializamos*/
	int matriz[3][3] = {{10,100,1000}, {20, 200, 2000}, {30, 300, 3000}};

	/* imprimimos la dirección de donde esta alojado la matriz */
	printf("\n Dirección de la matriz: %p ", matriz);

	/* imprimimos las direcciones de cada uno de los elementos de la matriz asi como su contenido y posición */
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			printf("\n dirección: %p , valor: %d ,\t posición[i,j]: %d,%d ", &matriz[i][j], matriz[i][j], i, j );
		}
	}


	printf("\n\n");
	return 0;
}