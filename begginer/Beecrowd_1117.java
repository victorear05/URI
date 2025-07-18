package begginer;

import java.util.Scanner;

public class Beecrowd_1117 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double N1 = input.nextDouble();
		while(N1 < 0 || N1 >10) {
			System.out.println("nota invalida");
			N1 = input.nextDouble();
		}
		
		double N2 = input.nextDouble();
		while(N2 < 0 || N2 >10) {
			System.out.println("nota invalida");
			N2 = input.nextDouble();
		}
		System.out.printf("media = %.2f\n", (N1+N2)/2);
		input.close();
	}

}
