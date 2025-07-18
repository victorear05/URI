package begginer;

import java.util.Scanner;

public class Beecrowd_2162 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean padrao = true;
		int N = input.nextInt();
		if(N>2) {
			int H[] = new int[N];
			H[0] = input.nextInt();
			H[1] = input.nextInt();
			for(int i=2;i<N;i++) {
				H[i] = input.nextInt();
				if(H[i]>=H[i-1] && H[i-1]>=H[i-2]) 
					padrao = false;
				else if(H[i]<=H[i-1] && H[i-1]<=H[i-2]) 
					padrao = false;
			}
		}
		else if(N == 2) {
			N = input.nextInt();
			int aux = input.nextInt();
			if(N == aux)
				padrao = false;
		}
		else
			input.nextInt();
		if(padrao)
			System.out.println("1");
		else
			System.out.println("0");
		
		input.close();
	}

}
