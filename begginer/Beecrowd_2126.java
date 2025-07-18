package begginer;

import java.util.Scanner;

public class Beecrowd_2126 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cont = 1;
		while(input.hasNext()) {
			String resposta = "Caso #" + cont + ":\n";
			String N1 = input.next();
			String N2 = input.next();
			if(N2.contains(N1)) {
				resposta += "Qtd.Subsequencias: ";
				int pos = 0;
				int qtd = 0;
				int aux = N2.indexOf(N1);
				do {
					qtd++;
					pos = aux;
					aux = N2.indexOf(N1,aux+N1.length());
				}while(aux!=-1);
				resposta += qtd + "\nPos: " + (pos+1) + "\n";
			}
			else {
				resposta += "Nao existe subsequencia\n";
			}

			System.out.println(resposta);
			cont++;
		}	
		input.close();
	}

}
