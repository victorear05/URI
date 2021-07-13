package basicos;

import java.util.*;

public class URI_2028 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N, QuantidadeDeNumeros = 1;
        int caso = 1;
		while(input.hasNext()) {
			N = input.nextInt();
			QuantidadeDeNumeros = 1;
			for(int i=0;i<=N;i++)
				QuantidadeDeNumeros += i;
			if(N == 0) {
				System.out.println("Caso " + caso + ": " + QuantidadeDeNumeros + " numero");
				System.out.print("0");
			}
			else {
				System.out.println("Caso " + caso + ": " + QuantidadeDeNumeros + " numeros");
				System.out.print("0 ");
				for(int i = 1;i<=N;i++)
					for(int j = 0;j<i;j++)
						if(i == N && j == N-1)
							System.out.print(i);
						else
							System.out.print(i + " ");
			}
			caso ++;
			System.out.print("\n\n");
		}
		
		input.close();
	}

}