package begginer;

import java.util.Scanner;

public class Beecrowd_2540 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			double N = input.nextInt();
			int qtd1 = 0;
			
			for(int i=0;i<N;i++)
				if(input.nextInt() == 1)
					qtd1++;
			double imp = (2*N)/3;
			
			if(qtd1>=imp)
				System.out.println("impeachment");
			else
				System.out.println("acusacao arquivada");
		}
		input.close();
	}

}
