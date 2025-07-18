package begginer;

import java.util.Scanner;

public class Beecrowd_1151 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int vet[] = new int[N];
		if(N == 1)
			vet[0] = 0;
		else if(N>=2) {
			vet[0] = 0;
			vet[1] = 1;
			System.out.print(vet[0] + " ");
			System.out.print(vet[1] + " ");
			for(int i=2;i<N;i++) {
				vet[i] = vet[i-2] + vet[i-1];
				if(i!=N-1)
					System.out.print(vet[i] + " ");
				else
					System.out.println(vet[i]);
			}
		}
		
		input.close();
	}

}
