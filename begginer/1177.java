package basicos;

import java.util.Scanner;

public class URI_1177 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int aux = 0;
		for(int i=0;i<1000;i++) {
			System.out.println("N[" + i + "] = " + aux);
			if(aux == T-1)
				aux=0;
			else
				aux++;
		}

		input.close();
	}

}
