package basicos;

import java.util.Scanner;

public class URI_1157 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String resposta = "";
		
		for(int i=1;i<=N/2;i++)
			if(N%i==0)
				resposta+= i + "\n";
		
		System.out.println(resposta + N);
		
		input.close();
	}

}
