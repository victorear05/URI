package basicos;

import java.util.Scanner;

public class URI_1005 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		
		double M = (A*3.5 + B*7.5)/11;

		System.out.printf("MEDIA = %.5f\n", M);
		input.close();
	}

}
