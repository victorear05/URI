package begginer;

import java.util.Scanner;

public class Beecrowd_1067 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int i = 1;
		while(i<=X) {
			if(i%2!=0)
				System.out.println(i);
			i+=2;
		}
		input.close(); 

	}

}
