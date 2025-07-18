package basicos;

import java.util.Scanner;

public class URI_1146 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		while(i!=0) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				if(j!=i)
					System.out.print(" ");
			}
			System.out.println();
			i = input.nextInt();
		}
		input.close();
	}

}
