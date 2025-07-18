package begginer;

import java.util.Scanner;

public class Beecrowd_1019 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int segundos = input.nextInt();
		int horas = segundos/3600;
		segundos -= horas * 3600;
		int minutos = segundos/60;
		segundos -= minutos * 60;
		System.out.println(horas + ":" + minutos + ":" + segundos);
		input.close();
	}

}
