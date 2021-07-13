package basicos;

import java.util.Scanner;

public class URI_1021 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String strDinheiro = entrada.next();
		float dinheiro = Float.valueOf(strDinheiro).floatValue();
				
		int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0;
		int moedas1 = 0, moedas05 = 0, moedas025 = 0, moedas010 = 0, moedas005 = 0, moedas001 = 0;
		
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
			moedas1++;
		}
		
		while(dinheiro < 1 && dinheiro >= 0.5) {
			dinheiro -= 0.5;
			moedas05++;
		}
		
		while(dinheiro < 0.5 && dinheiro >= 0.25) {
			dinheiro -= 0.25;
			moedas025++;
		}
		
		while(dinheiro < 0.25 && dinheiro >= 0.10) {
			dinheiro -= 0.10;
			moedas010++;
		}
		
		while(dinheiro < 0.10 && dinheiro >= 0.05) {
			dinheiro -= 0.05;
			moedas005++;
		}
		
		if(strDinheiro.charAt(strDinheiro.length() - 1) == '1')
			moedas001 = 1;
		if(strDinheiro.charAt(strDinheiro.length() - 1) == '2')
			moedas001 = 2;
		if(strDinheiro.charAt(strDinheiro.length() - 1) == '3')
			moedas001 = 3;
		if(strDinheiro.charAt(strDinheiro.length() - 1) == '4')	
			moedas001 = 4;
		if(strDinheiro.charAt(strDinheiro.length() - 1) == '6')
			moedas001 = 1;
		if(strDinheiro.charAt(strDinheiro.length() - 1) == '7')
			moedas001 = 2;
		if(strDinheiro.charAt(strDinheiro.length() - 1) == '8')	
			moedas001 = 3;
		if(strDinheiro.charAt(strDinheiro.length() - 1) == '9')	
			moedas001 = 4;
			
		System.out.println("NOTAS:");
		System.out.println(notas100 + " nota(s) de R$ 100.00");
		System.out.println(notas50 + " nota(s) de R$ 50.00");
		System.out.println(notas20 + " nota(s) de R$ 20.00");
		System.out.println(notas10 + " nota(s) de R$ 10.00");
		System.out.println(notas5 + " nota(s) de R$ 5.00");
		System.out.println(notas2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moedas1 + " moeda(s) de R$ 1.00");
		System.out.println(moedas05 + " moeda(s) de R$ 0.50");
		System.out.println(moedas025 + " moeda(s) de R$ 0.25");
		System.out.println(moedas010 + " moeda(s) de R$ 0.10");
		System.out.println(moedas005 + " moeda(s) de R$ 0.05");
		System.out.println(moedas001 + " moeda(s) de R$ 0.01");
		
		entrada.close();
	}

}
