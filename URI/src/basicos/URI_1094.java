package basicos;

import java.util.Scanner;

public class URI_1094 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int C = 0, S = 0, R = 0;
		double Quantia = 0;
		for(int i=0;i<N;i++) {
			int qtd = input.nextInt();
			Quantia += qtd;
			String aux = input.next();
			if(aux.equals("C"))
				C+=qtd;
			else if(aux.equals("R"))
				R+=qtd;
			else
				S+=qtd;
		}
		
		double percentualC = (C/Quantia) * 100;
		double percentualR = (R/Quantia) * 100;
		double percentualS = (S/Quantia) * 100;
		
		System.out.println("Total: " + (int)Quantia + " cobaias"
				+ "\nTotal de coelhos: " + C
				+ "\nTotal de ratos: " + R
				+ "\nTotal de sapos: " + S);
		System.out.printf(String.format(java.util.Locale.US, "Percentual de coelhos: %.2f", percentualC));
		System.out.println(" %");
		System.out.printf(String.format(java.util.Locale.US, "Percentual de ratos: %.2f", percentualR));
		System.out.println(" %");
		System.out.printf(String.format(java.util.Locale.US, "Percentual de sapos: %.2f", percentualS));
		System.out.println(" %");
		input.close();
	}

}
