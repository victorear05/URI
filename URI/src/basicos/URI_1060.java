package basicos;

import java.util.Scanner;

public class URI_1060 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pares = 0;
		for(int i=0;i<6;i++)
			if(input.nextDouble()>0)
				pares++;
		
		System.out.println(pares + " valores positivos");
		
		input.close();
	}

}
