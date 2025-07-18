package begginer;

import java.util.Scanner;

public class Beecrowd_1172 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X[] = new int[10];
		for(int i=0;i<10;i++) {
			int Z = input.nextInt(); 
			if(Z <= 0)
				X[i] = 1;
			else
				X[i] = Z;
		}
		for(int i=0;i<10;i++)
			System.out.println("X[" + i + "] = " + X[i]);
				
		input.close();
	}

}
