package basicos;

import java.util.Scanner;

public class URI_1145 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		int linha = 0;
		for(int i=1;i<=Y;i++) {
			if(linha == 0)
				System.out.print(i);
			else
				System.out.print(" " + i);
			linha++;
			if(linha == X) {
				System.out.println();
				linha = 0;
			}
		}
		input.close();
	}

}
