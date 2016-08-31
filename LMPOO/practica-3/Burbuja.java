
public class Burbuja{
	
	public static void main(String args[]){

		int x[] = new int[5];
		int i, j, temp;

		x[0] = -3;
		x[1] = 5;
		x[2] = 1;
		x[3] = 10;
		x[4] = 2;

		for(i = 0; i<5; i++){
			for(j=i+1;j<5;j++){
				if(x[i]>x[j]){
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

		for(i=0;i<5;i++){
			System.out.println(x[i]);
		}

	}

}