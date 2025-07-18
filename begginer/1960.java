package basicos;

import java.util.Scanner;

public class URI_1960 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String resposta = ""; 
		if(N/100>=1) {
			resposta += transformaEmRomano(N, 100);
			int centena = N/100;
			N -= centena*100;	
		}
		if(N/10 >=1) {
			resposta += transformaEmRomano(N, 10);
			int dezena = N/10;
			N -= dezena*10;

		}
		resposta+=transformaEmRomano(N, 1);

		System.out.println(resposta);
		
		input.close();
	}

	static String transformaEmRomano(int N, int tam) {	
		String a;
		String b;
		String c;
		if(tam == 100) {
			a = "C";
			b = "M";
			c = "D";
			
		}
		else if(tam == 10) {
			a = "X";
			b = "C";
			c = "L";		
		}
		else {
			a = "I";
			b = "X";
			c = "V";			
		}
		int divisao = N/tam;
		String resposta = "";
		if(divisao == 9)
			resposta += a.concat(b);
		else if(divisao == 4)
			resposta += a.concat(c);
		else if(divisao >= 5) {
			resposta += c;
			for(int i=0;i<divisao-5;i++)
				resposta += a;
		}
		else
			for(int i=0;i<divisao;i++)
				resposta += a;
		return resposta;
	}
	
}
