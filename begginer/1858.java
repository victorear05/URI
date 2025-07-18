package basicos;

import java.util.Scanner;

public class URI_1858 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int menor = N, posicao = 0;
		for(int i = 0;i<N;i++) {
			int aux = input.nextInt();
			if(aux < menor){
				menor = aux;
			posicao = i;
			}
		}
		System.out.println(posicao + 1);
		
		input.close();
	}

}
