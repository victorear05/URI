package basicos;

import java.util.Scanner;

public class URI_1864 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase = "LIFE IS NOT A PROBLEM TO BE SOlVED";
		int N = input.nextInt();
		for(int i = 0;i<N;i++)
			System.out.print(frase.charAt(i));
		System.out.println();
		input.close();
	}

}
