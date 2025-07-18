package begginer;

import java.util.Scanner;

public class Beecrowd_1038 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int codigo = input.nextInt();
		int quantidade = input.nextInt();
		double[] precos = {4.0,4.5,5.0,2.0,1.5};
		System.out.printf("Total: R$ %.2f\n", precos[codigo-1]*quantidade);
		
		input.close();
	}	

}	
