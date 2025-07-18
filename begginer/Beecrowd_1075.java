package begginer;

import java.util.Scanner;

public class Beecrowd_1075 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N=input.nextInt();
		if(N>2) {
			int i = 2;
			while(i<=10000) {
				System.out.println(i);
				i+=N;
			}
		}
		input.close();
	}

}
