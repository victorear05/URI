package begginer;

import java.util.Scanner;

public class Beecrowd_1114 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.nextInt() != 2002)
			System.out.println("Senha Invalida");
		System.out.println("Acesso Permitido");
		
		input.close();
	}

}
