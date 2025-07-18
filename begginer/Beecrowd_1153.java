package begginer;

import java.util.Scanner;

public class Beecrowd_1153 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int soma = 1;
		for(int i=2;i<=N;i++)
			soma*=i;
		
		System.out.println(soma);
		
		input.close();
	}

}
