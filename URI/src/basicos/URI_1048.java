package basicos;

import java.util.Scanner;

public class URI_1048 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		if(salario <= 400)
			System.out.printf("Novo salario: %.2f\n"
					+ "Reajuste ganho: %.2f\n"
					+ "Em percentual: 15 %%\n", (salario*0.15+salario),salario*0.15);
		else if(salario <= 800)
			System.out.printf("Novo salario: %.2f\n"
					+ "Reajuste ganho: %.2f\n"
					+ "Em percentual: 12 %%\n", (salario*0.12+salario),salario*0.12);
		else if(salario <= 1200)
			System.out.printf("Novo salario: %.2f\n"
					+ "Reajuste ganho: %.2f\n"
					+ "Em percentual: 10 %%\n", (salario*0.10+salario),salario*0.10);
		else if(salario <= 2000)
			System.out.printf("Novo salario: %.2f\n"
					+ "Reajuste ganho: %.2f\n"
					+ "Em percentual: 7 %%\n", (salario*0.07+salario),salario*0.07);
		else
			System.out.printf("Novo salario: %.2f\n"
					+ "Reajuste ganho: %.2f\n"
					+ "Em percentual: 4 %%\n", (salario*0.04+salario),salario*0.04);
		
		input.close();
	}

}
