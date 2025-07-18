package basicos;

import java.util.Scanner;

public class URI_1020 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dias = input.nextInt();
		int anos = dias/365;
		dias -= anos * 365;
		int meses = dias/30;
		dias -= meses * 30;
		System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
		
		input.close();
	}

}
