package begginer;

import java.util.Scanner;

public class Beecrowd_2143 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T != 0) {
			for(int i=0;i<T;i++) {
				int N = input.nextInt();
				if(N%2 != 0)
					System.out.println(((N-1)*2)+1);
				else
					System.out.println(((N-2)*2)+2);
			}
			T = input.nextInt();
		}	
		input.close();
	}

}
