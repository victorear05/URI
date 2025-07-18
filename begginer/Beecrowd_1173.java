package begginer;

import java.util.Scanner;

public class Beecrowd_1173 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N[] = new int[10];
		int V = input.nextInt();
		
		for(int i=0;i<10;i++) {
			N[i] = V * (int) Math.pow(2, i);
			System.out.println("N[" + i + "] = " + N[i]);
		}
		input.close();
	}

}
