package basicos;

import java.util.Scanner;

public class URI_1064 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pares = 0;
		double media = 0;
		for(int i=0;i<6;i++) {
			double aux = input.nextDouble();
			if(aux > 0) {
				media += aux;
				pares++;
			}
		}
		
		System.out.printf("%d valores positivos\n%.1f\n", pares, media/pares);
		
		input.close();
	}

}
