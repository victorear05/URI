package begginer;

import java.util.Scanner;

public class Beecrowd_1181 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int L = input.nextInt();
		double somaLinha = 0;
		String operacao = input.next();
		for(int i=0;i<12;i++)
			for(int j=0;j<12;j++) 
				if(i == L)
					somaLinha += input.nextDouble();
				else
					input.nextDouble();
		if(operacao.equals("S"))
			System.out.printf(String.format(java.util.Locale.US, "%.1f\n", somaLinha));
		else
			System.out.printf(String.format(java.util.Locale.US, "%.1f\n", somaLinha/12));
		
		input.close();
	}

}
