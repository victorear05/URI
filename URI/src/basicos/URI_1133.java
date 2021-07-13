package basicos;

import java.util.Scanner;

public class URI_1133 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt(), Y = input.nextInt();
		int maior, menor;
		if(X>Y) {
			maior = X;
			menor = Y;
		}
		else {
			maior = Y;
			menor = X;
		}
		for(int i=menor+1;i<maior;i++)
			if(i%5 == 2 || i%5 == 3)
				System.out.println(i);
		
		input.close();
	}

}
