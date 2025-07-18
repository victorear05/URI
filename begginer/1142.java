package basicos;

import java.util.Scanner;

public class URI_1142 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=1;i<=N*4;i++) {
			if(i%4!=0)
				System.out.print(i + " ");
			else
				System.out.print("PUM\n");
			
		}
			
		input.close();
	}

}
