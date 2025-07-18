package begginer;

import java.util.Scanner;

public class Beecrowd_1043 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		if(A+B > C && A+C > B && B+C > A)
			System.out.printf("Perimetro = %.1f\n", A+B+C);
		else
			System.out.printf("Area = %.1f\n", (A+B)*C/2);
		
		input.close();
	}

}
