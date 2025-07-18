package begginer;

import java.util.Scanner;

public class Beecrowd_1115 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		while(X != 0 && Y != 0) {
			if(X>0) 
				if(Y>0)
					System.out.println("primeiro");
				else
					System.out.println("quarto");
			else
				if(Y>0)
					System.out.println("segundo");
				else
					System.out.println("terceiro");
			X = input.nextInt();
			Y = input.nextInt();
		}
		
		input.close();
	}

}
