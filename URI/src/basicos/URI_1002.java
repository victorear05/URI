package basicos;

import java.util.Scanner;

public class URI_1002 {

	public static void main(String[] args) {
		
		double pi = 3.14159;
		double raio;
		Scanner entrada = new Scanner(System.in);
		raio = entrada.nextDouble();
		System.out.printf("A=%.4f%n", (pi*raio*raio));
		
		entrada.close();
	}

}
