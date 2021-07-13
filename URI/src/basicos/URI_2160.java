package basicos;

import java.util.Scanner;

public class URI_2160 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String L = input.nextLine();
		if(L.length()>80)
			System.out.println("NO");
		else
			System.out.println("YES");
	
		input.close();
	}

}
