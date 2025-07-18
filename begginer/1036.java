package basicos;

import java.util.Scanner;

public class URI_1036 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		if(A == 0)
			System.out.println("Impossivel calcular");
		else {
			double D = (B*B) - (4 * A * C); 
			if(D<0)
				System.out.println("Impossivel calcular");
			else {
				System.out.printf("R1 = %.5f\n", ( (-B + Math.sqrt(D) ) /(2*A) ) );
				System.out.printf("R2 = %.5f\n", ( (-B - Math.sqrt(D) ) /(2*A) ) );
			}
		}
		
		input.close();
	}

}
