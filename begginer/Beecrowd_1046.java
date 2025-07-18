package begginer;

import java.util.Scanner;

public class Beecrowd_1046 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inicio = input.nextInt();
		int fim = input.nextInt();
		
		if(inicio == fim)
			System.out.println("O JOGO DUROU 24 HORA(S)");
		else if(inicio < fim)
			System.out.println("O JOGO DUROU " + (fim - inicio) + " HORA(S)");
		else 
			System.out.println("O JOGO DUROU " + (24 - inicio + fim) + " HORA(S)");
		
		input.close();
	}

}
