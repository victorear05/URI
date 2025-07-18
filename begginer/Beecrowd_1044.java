package begginer;

import java.util.Scanner;

public class Beecrowd_1044 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		
		if(A%B == 0.0 || B%A == 0.0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");
		
		input.close();

	}

}
