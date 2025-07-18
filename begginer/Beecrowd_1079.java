package begginer;

import java.util.Scanner;

public class Beecrowd_1079 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++) {
			double media = 0;		
			media += 2*input.nextDouble();
			media += 3*input.nextDouble();
			media += 5*input.nextDouble();
			
			System.out.printf("%.1f\n", media/10);
		}
		
		input.close();
	}

}
