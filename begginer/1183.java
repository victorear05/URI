package basicos;

import java.util.Scanner;

public class URI_1183 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String operacao = input.next();
		double soma = 0;
		
		for(int i=0;i<12;i++)
			for(int j=0;j<12;j++)
				if(j>i)
					soma += input.nextDouble();
				else
					input.nextDouble();
		
		if(operacao.equals("S"))
			System.out.printf(String.format(java.util.Locale.US, "%.1f\n", soma));
		else
			System.out.printf(String.format(java.util.Locale.US, "%.1f\n", soma/66));
		input.close();
	}

}
