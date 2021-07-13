package basicos;

import java.util.Scanner;

public class URI_1959 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(), L = input.nextInt();
		
		System.out.println((long)N*L);
		
		input.close();
	}

}
