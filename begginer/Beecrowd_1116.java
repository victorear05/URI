package begginer;

import java.util.Scanner;

public class Beecrowd_1116 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++) {
			double X = input.nextInt();
			double Y = input.nextInt();
			if(Y == 0)
				System.out.println("divisao impossivel");
			else
				System.out.printf("%.1f\n",X/Y);
			
		}
		input.close();
	}

}
