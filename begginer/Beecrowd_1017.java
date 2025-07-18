package begginer;

import java.util.Scanner;

public class Beecrowd_1017 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tempo = input.nextInt();
		int velocidade = input.nextInt();
		System.out.printf("%.3f\n", (double) (tempo * velocidade)/12 );
		input.close();
	}

}
