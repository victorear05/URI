package begginer;

import java.util.Scanner;

public class Beecrowd_1962 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++) {
			int ano = input.nextInt();
			ano = 2015 - ano;
			if(ano > 0)
				System.out.println(ano + " D.C.");
			else 
				System.out.println( (Math.abs(ano)+1) + " A.C.");
		}
		input.close();
	}

}
