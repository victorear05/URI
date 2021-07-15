package basicos;

import java.util.Scanner;

public class URI_1065 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pares = 0;
		for(int i=0;i<5;i++)
			if(input.nextInt()%2 == 0)
				pares++;
		
		System.out.println(pares + " valores pares");
		
		input.close();

	}

}
