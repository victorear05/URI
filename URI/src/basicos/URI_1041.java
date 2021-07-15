package basicos;

import java.util.Scanner;

public class URI_1041 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double X = input.nextDouble();
		double Y = input.nextDouble();
		
		if(X == 0.0 && Y == 0.0)
			System.out.println("Origem");
		else if(X == 0.0)
			System.out.println("Eixo Y");
		else if(Y == 0.0)
			System.out.println("Eixo X");
		else {
			if(X>0)
				if(Y>0)
					System.out.println("Q1");
				else
					System.out.println("Q4");
			else
				if(Y>0)
					System.out.println("Q2");
				else
					System.out.println("Q3");
		}
		
		input.close();
	}

}
