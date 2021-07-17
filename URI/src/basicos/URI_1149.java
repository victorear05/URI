package basicos;

import java.util.Scanner;

public class URI_1149 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int N = input.nextInt();
		while(N<=0)
			N = input.nextInt();
		int soma = 0;
		for(int i=0;i<N;i++)
			soma += A+i;
		
		System.out.println(soma);
		
		input.close();
	}

}
