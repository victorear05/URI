package basicos;

import java.util.Scanner;

public class URI_1018 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dinheiro = input.nextInt();
		System.out.println(dinheiro);
		int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0, notas1 = 0;
		
		while(dinheiro >= 100) {
			dinheiro -= 100;
			notas100++;
		}
		
		while(dinheiro < 100 && dinheiro >= 50) {
			dinheiro -= 50;
			notas50++;
		}
		
		while(dinheiro < 50 && dinheiro >= 20) {
			dinheiro -= 20;
			notas20++;
		}
		
		while(dinheiro < 20 && dinheiro >= 10) {
			dinheiro -= 10;
			notas10++;
		}
		
		while(dinheiro < 10 && dinheiro >= 5) {
			dinheiro -= 5;
			notas5++;
		}
		
		while(dinheiro < 5 && dinheiro >= 2) {
			dinheiro -= 2;
			notas2++;
		}
		
		while(dinheiro < 2 && dinheiro >= 1) {
			dinheiro -= 1;
			notas1++;
		}
		
		System.out.print(notas100 + " nota(s) de R$ 100,00\n"
				+ notas50 + " nota(s) de R$ 50,00\n"
				+ notas20 + " nota(s) de R$ 20,00\n"
				+ notas10 + " nota(s) de R$ 10,00\n"
				+ notas5 + " nota(s) de R$ 5,00\n"
				+ notas2 + " nota(s) de R$ 2,00\n"
				+ notas1 + " nota(s) de R$ 1,00\n");
		
		input.close();
	}

}
