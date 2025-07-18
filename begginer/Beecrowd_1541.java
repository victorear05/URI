package begginer;

import java.util.Scanner;

public class Beecrowd_1541 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double A = input.nextInt(); 
		while(A!=0) {
			double B = input.nextInt();
			double C = input.nextInt();
			int X = (int) Math.sqrt((A*B)/(C/100));
			System.out.println(X);
			A = input.nextInt();
		}
		input.close();
	}

}
