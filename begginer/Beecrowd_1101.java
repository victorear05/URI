package begginer;

import java.util.Scanner;

public class Beecrowd_1101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int M,N, soma;
		
		M = input.nextInt();
		N = input.nextInt();
		
		while(M > 0 && N > 0) {
			soma = 0;
			if(M>N) {
				for(int i = N;i<=M;i++) {
					System.out.print(i + " ");
					soma += i;
				}
				System.out.println("Sum=" + soma);
			}
			else if(M<N) {
				for(int i = M;i<=N;i++) {
					System.out.print(i + " ");
					soma += i;
				}
				System.out.println("Sum=" + soma);
			}
			M = input.nextInt();
			N = input.nextInt();
		}
		input.close();
	}
}
