package begginer;

import java.util.Scanner;

public class Beecrowd_1154 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idades = input.nextInt();
		int somatorio = 0;
		double cont = 0;
		while(idades > 0) {
			somatorio += idades;
			idades = input.nextInt();
			cont++;
		}
		
		System.out.printf("%.2f\n",somatorio/cont);
		
		input.close();
	}

}
