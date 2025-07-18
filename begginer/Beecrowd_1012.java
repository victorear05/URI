package begginer;

import java.util.Scanner;

public class Beecrowd_1012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f\n", (A*C)/2);
		System.out.printf("CIRCULO: %.3f\n", 3.14159 * Math.pow(C, 2));
		System.out.printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2);
		System.out.printf("QUADRADO: %.3f\n", B*B);
		System.out.printf("RETANGULO: %.3f\n",A*B);
				
		input.close();
	}

}
