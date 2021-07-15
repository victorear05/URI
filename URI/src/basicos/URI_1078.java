package basicos;

import java.util.Scanner;

public class URI_1078 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(i + " x " + N + " = " + i*N);
		
		input.close();
	}

}
