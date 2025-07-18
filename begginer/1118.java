package basicos;

import java.util.Scanner;

public class URI_1118 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int novoCalculo = 1;
		while(novoCalculo != 2) {
			double nota1 = -1;
			double nota2 = -1;
			if(novoCalculo == 1) {
				nota1 = input.nextDouble();
				while(nota1 < 0 || nota1 > 10) {
					System.out.println("nota invalida");
					nota1 = input.nextDouble();
				}
				nota2 = input.nextDouble();
				while(nota2 < 0 || nota2 > 10) {
					System.out.println("nota invalida");
					nota2 = input.nextDouble();
				}
				System.out.printf(String.format(java.util.Locale.US, "media = %.2f", (nota1+nota2)/2));
				System.out.println("\nnovo calculo (1-sim 2-nao)");
			}
			else
				System.out.println("novo calculo (1-sim 2-nao)");
			novoCalculo = input.nextInt();
		}
		input.close();
	}

}
