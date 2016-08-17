/*
Este programa muestra la diferencia entre usar arreglos y struct cuando se manejan varios tipos de datos
Se van a capturar 3 pares de coordenadas x,y
 */

#include <stdio.h>

int main(){
	/*Declaramos un arreglo para el manejo de 'x'*/
	int x[3];
	/*Declaramos un arreglo para el manejo de 'y'*/
	int y[3];

	/*Asignamos valores*/
	x[0]=10, y[0]=100;
	x[1]=20, y[0]=200;
	x[2]=30, y[0]=300;

	/*Ahora usando struct*/

	/*Declaramos nuestra estructura llamada coordenadas*/
	struct Coordenadas{
		int x;
		int y;
	};

	/*Usamos la estructura Coordenadas y la llamaremos valores, indicamos que será 3 pares de valores*/
	struct Coordenadas valores[3];
	valores[0].x = 10, valores[0].y = 100;
	valores[1].x = 20, valores[1].y = 200;
	valores[2].x = 30, valores[2].y = 300;

	/* observamos que es mucho mejor usar structs cuando hay muchos valores */

	/* ESTE PROGRAMA NO MUESTRA VALORES EN PANTALLA */



	printf("\n\n");
	return 0;
}