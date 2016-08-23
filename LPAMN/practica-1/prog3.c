#include <stdio.h>

int main(){
	int x[5][5];
	
	for(int i = 0; i<5; i++){
		for(int j = 0; j<5; j++){
			printf("\n %p ", &x[i][j]);
		}
	}


	printf("\n\n");
	return 0;

}