package basicos;

import java.util.Scanner;

public class URI_1013 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maior = input.nextInt();
		int aux = input.nextInt();
		if(aux > maior)
			maior = aux;
		aux = input.nextInt();
		if(aux > maior)
			maior = aux;
		
		System.out.println(maior + " eh o maior");	
		
		input.close();
	}

}
