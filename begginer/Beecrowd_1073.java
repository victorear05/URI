package begginer;

import java.util.Scanner;

public class Beecrowd_1073 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int i = 2;
		while(i<=N) {
			System.out.printf("%d^2 = %d\n", i, i*i);
			i+=2;
		}
		
		input.close();
	}

}
