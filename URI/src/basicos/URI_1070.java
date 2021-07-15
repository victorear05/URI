package basicos;

import java.util.Scanner;

public class URI_1070 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int i = 0;
		while(i<=5) {
			if(X%2!=0) {
				System.out.println(X);
				i++;
			}
			X++;
		}
		input.close(); 

	}

}
