package basicos;

import java.util.Scanner;

public class URI_1973 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		long N = entrada.nextInt();
		long atacadas = 0;
		long totalDepois = 0;
		long Estrelas[] = new long[(int) N];
		boolean Estrelass[] = new boolean[(int) N];
		
		for(long i=0;i<N;i++) {
			Estrelas[(int) i] = entrada.nextLong();
			Estrelass[(int) i] = false;
		}
			
		long aux = 0;
		while(aux>=0 && aux<N) {
			if(Estrelas[(int) aux]%2 == 0) {	
				if(Estrelas[(int) aux] > 0)
					Estrelas[(int) aux]--;
				Estrelass[(int) aux] = true;
				aux--;
			}
			else {
				if(Estrelas[(int) aux] > 0)
					Estrelas[(int) aux]--;
				Estrelass[(int) aux] = true;
				aux++;
			}
		}
		
		for(long i=0;i<N;i++) {
			if(Estrelass[(int) i] == true)
				atacadas++;
			totalDepois += Estrelas[(int) i];
		}
		
		String resposta = atacadas + " " + totalDepois;
		System.out.println(resposta);
		entrada.close();
	}
	
}
