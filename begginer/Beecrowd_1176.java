package begginer;

import java.util.Scanner;

public class Beecrowd_1176 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String resposta = "";
		for(int i=0;i<N;i++) {
			int caso = input.nextInt();
			resposta += "Fib(" + caso + ") = " + calculaFibonacci(caso) + '\n';	
		}
		System.out.print(resposta);
		input.close();
	}

	static long calculaFibonacci(int caso) {
		double fib = (1/Math.sqrt(5)) * ( (Math.pow( ( (1+Math.sqrt(5) )/2 ),caso)) - (Math.pow( ( (1-Math.sqrt(5) )/2 ),caso)) );
		return (long)fib;
	}

}
