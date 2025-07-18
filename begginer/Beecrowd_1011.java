package begginer;

import java.util.Scanner;

public class Beecrowd_1011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double R = input.nextDouble();
		System.out.printf("VOLUME = %.3f\n", (4/3.0) * 3.14159 * Math.pow(R, 3) );
			
		input.close();
	}

}
