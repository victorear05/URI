package begginer;

import java.util.Scanner;

public class Beecrowd_1006 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();		
		double C = input.nextDouble();
		
		System.out.printf("MEDIA = %.1f\n", (A*2 + B*3 + C*5)/10);
		
		input.close();
	}

}
