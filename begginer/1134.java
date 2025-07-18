package basicos;

import java.util.Scanner;

public class URI_1134 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int combustivel = 0;
		while(combustivel != 4) {
			combustivel = input.nextInt();
			switch(combustivel) {
				case 1:{
					alcool++;
					break;
				}
				case 2:{
					gasolina++;
					break;
				}
				case 3:{
					diesel++;
					break;
				}
			}
		}
		System.out.println("MUITO OBRIGADO"
				+ "\nAlcool: " + alcool
				+ "\nGasolina: " + gasolina
				+ "\nDiesel: " + diesel);
		input.close();
	}

}
