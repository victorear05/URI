package basicos;

import java.util.Scanner;

public class URI_1165 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++) {
			int X = input.nextInt();
			if(X==1) {
				System.out.println("1 nao eh primo");
				continue;
			}
			if(X==3) {
				System.out.println("3 eh primo");
				continue;
			}
			else {
				boolean primo = true;
				for(int j=2;j<=X/2;j++)
					if(X%j==0) {
						primo = false;
						break;
					}
				if(primo == true)
					System.out.println(X + " eh primo");
				else
					System.out.println(X + " nao eh primo");
			}
		}
				
		input.close();
	}

}
