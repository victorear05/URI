package basicos;

import java.util.Scanner;

public class URI_1150 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Z = input.nextInt();
		
		while(Z<=X)
			Z = input.nextInt();
		
		input.close();
		
		int i;
		for(i=1;X<Z;i++)
			X+=X+i;
	
		System.out.println(i+1);
	}

}
