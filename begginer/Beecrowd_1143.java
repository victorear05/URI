package begginer;

import java.util.Scanner;

public class Beecrowd_1143 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=1;i<=N;i++) 
			System.out.println(i + " " + i*i + " " + i*i*i);	
		
		input.close();
	}
}
