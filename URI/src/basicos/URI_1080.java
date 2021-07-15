package basicos;

import java.util.Scanner;

public class URI_1080 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maior = input.nextInt();
		int posicao = 1;
		for(int i=2;i<=100;i++) {
			int aux = input.nextInt();
			if(aux>maior) {
				maior = aux;
				posicao = i;
			}
		}
		System.out.println(maior + "\n" + posicao);
		
		input.close();
	}

}
