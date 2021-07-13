package basicos;

import java.util.Scanner;

public class URI_2165 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String T = input.nextLine();
		if(T.length()<=140)
			System.out.println("TWEET");
		else
			System.out.println("MUTE");
		
		input.close();
	}

}
