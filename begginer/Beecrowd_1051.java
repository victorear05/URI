package begginer;

import java.util.Scanner;

public class Beecrowd_1051 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		
		if(salario <= 2000)
			System.out.println("Isento");
		else {
			double imposto = calculaImposto(salario);
			System.out.printf(String.format(java.util.Locale.US,"R$ %.2f\n", imposto));
		}
		
		input.close();
	}
	
	static double calculaImposto(double salario) {
		
		double imposto = 0;

		if(salario <= 3000) {
			salario -= 2000;
			imposto = salario * 0.08;
		}
			
		else if(salario <= 4500) {
			imposto += 1000 * 0.08;
			salario -= 3000;
			imposto += salario * 0.18;
		}
			
		else {
			imposto += 1000 * 0.08;
			imposto += 1500 * 0.18;
			salario -= 4500;
			imposto += salario * 0.28;
		}
		
		return imposto;
	
	}

}
