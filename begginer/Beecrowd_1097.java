package begginer;

import java.text.DecimalFormat;

public class Beecrowd_1097 {

	public static void main(String[] args) {
		double i = 0;
		String resposta = "";
		DecimalFormat formato = new DecimalFormat("#.#");
		while(i<=2) {
			for(double aux=1;aux<=3;aux++)
				resposta += "I=" + formato.format(i) + " J=" + formato.format(aux+i) + "\n";
			i+=0.2;
		}
		System.out.print(resposta);
	}
}
