package basicos;

import java.util.Scanner;

public class URI_2031 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++) {
			String jogador1 = input.next();
			String jogador2 = input.next();
			if(jogador1.equals(jogador2)) {
				if(jogador1.equals("papel")) 
					System.out.println("Ambos venceram");
				else if(jogador1.equals("pedra"))
					System.out.println("Sem ganhador");
				else
					System.out.println("Aniquilacao mutua");
			}
			else if(jogador1.equals("ataque"))
				System.out.println("Jogador 1 venceu");
			else if(jogador2.equals("ataque"))
				System.out.println("Jogador 2 venceu");
			else if(jogador1.equals("papel"))
				System.out.println("Jogador 2 venceu");
			else if(jogador2.equals("papel"))
				System.out.println("Jogador 1 venceu");
		}
		input.close();
	}

}
