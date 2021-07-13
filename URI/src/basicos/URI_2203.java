package basicos;

import java.util.Scanner;

public class URI_2203 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int posFX = input.nextInt();
			int posFY = input.nextInt();
			int posIX = input.nextInt();
			int posIY = input.nextInt();
			int VI = input.nextInt();
			int RF = input.nextInt();
			int RC = input.nextInt();
			
			double D = Math.sqrt(Math.pow(posFX-posIX,2)+Math.pow(posFY-posIY,2));
			
			if(RF + RC >= D + (1.5*VI))
				System.out.println("Y");
			else
				System.out.println("N");
		}
		
		input.close();
	}

}
