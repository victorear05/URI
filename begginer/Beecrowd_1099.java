package begginer;

import java.util.Scanner;

public class Beecrowd_1099 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++) {
			int soma = 0;
			int N1 = input.nextInt();
			int N2 = input.nextInt();
			if(N1<N2) {
				for(int j=N1+1;j<N2;j++)
					if(j%2!=0)
						soma += j;
			}
			else
				for(int j=N2+1;j<N1;j++)
					if(j%2!=0)
						soma += j;
			System.out.println(soma);
		}
		input.close();
	}
}
