#include <stdio.h>
#include <math.h>

float f(float x);
int main(){

	float a, b, c, tol;

	a = 1.2;
	b = 1.4;
	tol = 0.002;
	do{
		c = (a+b)/2;

		if(f(a)*f(c)< 0)
			b = c;
		else
			a = c;

		printf("\n %f", c);

	}while(fabs(a-b)< tol|| f(c) == 0);

}

float f(float x){
	return (x * exp(x)-5);
}