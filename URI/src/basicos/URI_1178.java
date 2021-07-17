package basicos;

import java.util.Scanner;

public class URI_1178 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double X = input.nextDouble();
		double N[] = new double[100];
		for(int i=0;i<100;i++)
			N[i] = X/(Math.pow(2, i));
		
		for(int i=0;i<100;i++)
			System.out.printf("N[%d] = %.4f\n", i, N[i]);
		
		input.close();
	}

}
