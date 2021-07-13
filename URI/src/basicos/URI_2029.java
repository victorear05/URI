package basicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_2029 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			double V = input.nextDouble(), D = input.nextDouble();
			double area = 3.14 * Math.pow((D/2),2);
			double altura = V/area;
			DecimalFormat dF = new DecimalFormat("0.00");
			dF.setMaximumFractionDigits(2);
			String strAltura = dF.format(altura);
			String strArea = dF.format(area);
			System.out.println("ALTURA = " + strAltura.replace(",","."));
			System.out.println("AREA = " + strArea.replace(",","."));		   
		}		
		input.close();
	}

}
