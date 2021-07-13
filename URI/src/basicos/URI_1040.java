package basicos;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1040 {

	public static void main(String[] args) {
		
		DecimalFormat deciFormat = new DecimalFormat();
		deciFormat.setMaximumFractionDigits(1);
		deciFormat.setRoundingMode(RoundingMode.DOWN);
		deciFormat.applyPattern("#0.0");
		
		Scanner input = new Scanner(System.in);
		double N[] = new double[4];
		
		for(int i=0;i<4;i++)
			N[i] = input.nextDouble();
		
		double media = (N[0] * 2 + N[1] * 3 + N[2] * 4 + N[3]) /10;
		System.out.println("Media: " + deciFormat.format(media).replace(",", "."));
		
		if(media >= 7)
			System.out.println("Aluno aprovado.");
		else if(media < 5)
			System.out.println("Aluno reprovado.");
		else {
			System.out.println("Aluno em exame.");
			double exame = input.nextDouble();
			System.out.println("Nota do exame: " + deciFormat.format(exame).replace(",", "."));
			media = (media + exame)/2;
			if(media >= 5)
				System.out.println("Aluno aprovado.");
			else
				System.out.println("Aluno reprovado.");
			System.out.println("Media final: " + deciFormat.format(media).replace(",", "."));
		}
			
		input.close();
	}

}