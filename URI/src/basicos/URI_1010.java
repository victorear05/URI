package basicos;

import java.util.Scanner;

public class URI_1010 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.nextInt();
		int npeca1 = input.nextInt();
		double valor1 = input.nextDouble();
		
		input.nextInt();
		int npeca2 = input.nextInt();
		double valor2 = input.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", ( (npeca1*valor1) + (npeca2*valor2) ) );
		
		input.close();
	}

}
