package begginer;

import java.util.Scanner;

public class Beecrowd_1174 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double vetor[] = new double[100];
		String resposta = "";
		for(int i = 0;i<100;i++) {
			vetor[i] = input.nextDouble();
			if(vetor[i]<=10)
				resposta += "A[" + i + "] = " + vetor[i] + "\n";
		}
		System.out.print(resposta);
		input.close();																	
	}

}
