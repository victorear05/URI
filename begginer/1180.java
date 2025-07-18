package basicos;

import java.util.Scanner;

public class URI_1180 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int vetor[] = new int[N];
		int menor, posicao = 0;
		vetor[0] = input.nextInt();
		menor = vetor[0];
		for(int i = 1;i<N;i++) {
			vetor[i] = input.nextInt();
			if(vetor[i] < menor) {
				menor = vetor[i];
				posicao = i;
			}
		}
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
		
		input.close();
	}

}
