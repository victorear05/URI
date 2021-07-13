package basicos;

import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.next();
		double fixo = input.nextDouble();
		double vendas = input.nextDouble();
		System.out.printf("TOTAL = R$ %.2f\n", (fixo + (0.15 * vendas)) );
		
		input.close();
	}

}
