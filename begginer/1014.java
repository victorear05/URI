package basicos;

import java.util.Scanner;

public class URI_1014 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int distancia = input.nextInt();
		double combustivel = input.nextDouble();
		
		System.out.printf("%.3f km/l\n", (distancia/combustivel) );
			
		input.close();
	}

}
