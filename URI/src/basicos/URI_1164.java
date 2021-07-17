package basicos;

import java.util.Scanner;

public class URI_1164 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++) {
			int X = input.nextInt();
			if(X == 1) {
				System.out.println("1 nao eh perfeito");
				continue;
			}
			int soma = 0;
			for(int j=2;j<=X/2;j++) {
				if(X%j==0)
					soma+=j;
			}
			if(soma == X-1)
				System.out.println(X + " eh perfeito");
			else
				System.out.println(X + " nao eh perfeito");
		}		
		
		input.close();
	}

}
