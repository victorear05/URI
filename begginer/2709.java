package basicos;

import java.util.Scanner;

public class URI_2709 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){

			
			int M = input.nextInt();
			int moedas[] = new int[M+1];
			for(int i=0;i<M;i++)
				moedas[i] = input.nextInt();
			moedas[M] = 0;
			int N = input.nextInt();
			int i = M-1;
			while(i>=0) {
				moedas[M] += moedas[i];
				i-=N;
			}
			if(verificaPrimo(moedas[M]) == true)
				System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
			else
				System.out.println("Bad boy! I’ll hit you.");	
		
		}
		
		input.close();
	}

	static boolean verificaPrimo(int numero) {
		boolean primo = true;
		int i=3, raiz = (int) Math.sqrt(numero);
		if(numero <= 1 || numero != 2 && numero%2 == 0)
			primo = false;
		else
			while(i<=raiz&& primo == true){
				if(numero%i == 0)
					primo = false;
				i+=2;
			}
		return primo;
	}
}
