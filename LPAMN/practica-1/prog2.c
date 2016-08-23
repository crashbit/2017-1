#include <stdio.h>

int main(){
	int x[5];
	
	printf("\n %p ", x);
	for(int i = 0; i<5; i++){
		printf("\n %p ", &x[i]);
	}


	printf("\n\n");
	return 0;

}