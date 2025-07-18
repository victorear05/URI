package begginer;

import java.util.Scanner;

public class Beecrowd_1865 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String s;
		for (int i = 1; i <= n; i++) {
			s = input.next();
			input.nextInt();
			if (s.equals("Thor")) {
				System.out.println("Y");
			} else{
				System.out.println("N");
			}
		}

	}
}
