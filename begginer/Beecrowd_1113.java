package begginer;

import java.util.Scanner;

public class Beecrowd_1113 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		
		while(X!=Y) {
			if(X>Y)
				System.out.println("Decrescente");
			else
				System.out.println("Crescente");
			X = input.nextInt();
			Y = input.nextInt();
		}
		
		input.close();
	}

}
