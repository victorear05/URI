package basicos;

import java.util.Scanner;

public class URI_1074 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++) {
			int aux = input.nextInt();
			if(aux==0)
				System.out.println("NULL");
			else {
				if(aux%2==0)
					System.out.print("EVEN ");
				else
					System.out.print("ODD ");
				if(aux>0)
					System.out.println("POSITIVE");
				else
					System.out.println("NEGATIVE");
			}
			
		}

		input.close();
	}

}
