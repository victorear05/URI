package begginer;

import java.util.Scanner;

public class Beecrowd_1045 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();		
		double C = input.nextDouble();
		if(B>A && B>C) {
			double aux = A;
			A = B;
			B = aux;
		}else if(C>A && C>B) {
			double aux = A;
			A = C;
			C = aux;
		}
		
		if(A >= B + C)
			System.out.println("NAO FORMA TRIANGULO");
		else {
			if(A*A == B*B + C*C)
				System.out.println("TRIANGULO RETANGULO");
			if(A*A > B*B + C*C)
				System.out.println("TRIANGULO OBTUSANGULO");
			if(A*A < B*B + C*C)
				System.out.println("TRIANGULO ACUTANGULO");
			if(A == B && B == C)
				System.out.println("TRIANGULO EQUILATERO");
			if( (A == B && B != C) || (A == C && C != B) || (B == C && C != A))
				System.out.println("TRIANGULO ISOSCELES");
		}
		
		input.close();
	}

}
