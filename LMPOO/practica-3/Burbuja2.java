import java.util.*;

public class Burbuja2{
	
	public static void main(String args[]){
		int i, j, temp;
		int[] x;

		x = new int[args.length];

		for(i = 0; i<args.length; i++){
			x[i] = Integer.parseInt(args[i]);
		}
	
		for(i=0; i< args.length;i++){
			for(j=i+1; j< args.length; j++){
				if(x[i]>x[j]){
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(x));

	}

}