import java.util.*;

public class Burbuja2{
	
	public static void main(String args[]){
		int i, j, temp;
		int[] x;
		int flag;
		String orden ="mayor";

		x = new int[args.length-1];

		for(i = 0; i<args.length-1; i++){
			x[i] = Integer.parseInt(args[i]);
		}

		if(orden.compareTo(args[args.length-1]) == 0){
			flag = 0;
		}
		else{
			flag = 1;
		}

	
		for(i=0; i< args.length-1;i++){
			for(j=i+1; j< args.length-1; j++){
				if(flag==1){
					if(x[i]>x[j]){
						temp = x[i];
						x[i] = x[j];
						x[j] = temp;
					}
				}
				else{
					if(x[i]<x[j]){
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
					}
				}	
			}
		}

		System.out.println(Arrays.toString(x));

	}

}