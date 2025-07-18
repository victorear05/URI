package begginer;

import java.util.Scanner;

public class Beecrowd_2724 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String resposta = "";
		for(int i=0;i<N;i++) {
			
			int T = input.nextInt();
			String formulas[] = new String[T];
			for(int j=0;j<T;j++)
				formulas[j] = input.next();
			int U = input.nextInt();
			String experimentos[] = new String[U];
			for(int j=0;j<U;j++)
				experimentos[j] = input.next();
			for(int j=0;j<U;j++) {
				boolean perigoso = false;
				for(int k=0;k<T;k++) {
					if(experimentos[j].contains(formulas[k])) {
						perigoso = verificaProximo(experimentos[j], formulas[k]);
						if(perigoso == true)
							break;
					}
				}
				if(perigoso == true)
					resposta += "Abortar\n";
				else
					resposta += "Prossiga\n";
			}
			if(i!=N-1)
				resposta += "\n";
		}
		System.out.print(resposta);
		input.close();
	}
	static boolean verificaProximo(String experimento, String formula) {
		
		boolean perigoso = true;
		int proximo;
	
		proximo = experimento.indexOf(formula) + formula.length();
		if(experimento.length() > proximo) {
			char charProximo = experimento.charAt(proximo);
			if(Character.isLowerCase(charProximo) || Character.isDigit(charProximo))
				perigoso = false;			
		}
		
		return perigoso;
	}
}