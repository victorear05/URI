package begginer;

import java.util.Scanner;

public class Beecrowd_2626 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String DodoVence = "Os atributos dos monstros vao ser inteligencia, sabedoria...";
		String LeoVence = "Iron Maiden's gonna get you, no matter how far!";
		String PepperVence = "Urano perdeu algo muito precioso...";
		String Empate = "Putz vei, o Leo ta demorando muito pra jogar...";
		while(input.hasNext()) {
			String Dodo = input.next();
			String Leo = input.next();
			String Pepper = input.next();
			int IDodo = transformaEmNumero(Dodo);
			int ILeo = transformaEmNumero(Leo);
			int IPepper = transformaEmNumero(Pepper);
			if(Leo.equals(Pepper) && (IDodo - ILeo == 1 || IDodo - ILeo == -2))
				System.out.println(DodoVence);
			else if(Pepper.equals(Dodo) && (ILeo - IPepper == 1 || ILeo - IPepper == -2))
				System.out.println(LeoVence);
			else if(Dodo.equals(Leo) && (IPepper - IDodo == 1 || IPepper - IDodo == -2))
				System.out.println(PepperVence);
			else
				System.out.println(Empate);
		}
		input.close();
	}
	static int transformaEmNumero(String escolha) {
		if(escolha.equals("pedra"))
			return 0;
		else if(escolha.equals("papel"))
			return 1;
		else
			return 2;
	}
}
