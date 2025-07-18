package begginer;

import java.util.Scanner;

public class Beecrowd_1158 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++) {
			int X = input.nextInt();
			int Y = input .nextInt();
			int soma = 0;
			if(X%2==0)
				X++;
			for(int j=0;j<Y;j++) {
				soma+=X;
				X+=2;
			}
			System.out.println(soma);
		}
		
		input.close();
	}

}
