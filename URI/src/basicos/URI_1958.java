package basicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1958 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double z = input.nextDouble();
		DecimalFormat format = new DecimalFormat("0.0000E00");
		String strZ = format.format(z);
		String resposta = "";
		if(strZ.charAt(0) == '-')
			if(strZ.charAt(8) == '-')
				resposta = strZ;
			else
				resposta = strZ.substring(0, 8) + '+' + strZ.substring(8);
		else
			if(strZ.charAt(7) == '-')
				resposta = "+" + strZ.substring(0);
			else
				resposta = "+" + strZ.substring(0,7) + '+' + strZ.substring(7);
			
		System.out.println(resposta.replace(",", "."));
				
		input.close();
	}

}
