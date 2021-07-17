package basicos;

import java.util.Scanner;

public class URI_1159 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		while(X!=0) {
			int soma = 0;
			if(X%2!=0)
				X++;
			for(int i=0;i<5;i++){
				soma += X;
				X += 2;
			}
			
			System.out.println(soma);
			X = input.nextInt();
		}
		
		input.close();
	}

}
