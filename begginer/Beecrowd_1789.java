package begginer;

import java.util.Scanner;

public class Beecrowd_1789 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext() == true) {
			int L = input.nextInt();
			int maisRapida = input.nextInt();
			for(int i=1;i<L;i++) {
				int aux = input.nextInt();
				if(aux>maisRapida)
					maisRapida = aux;
			}
			if(maisRapida >= 20)
				System.out.println(3);
			else if(maisRapida>=10)
				System.out.println(2);
			else
				System.out.println(1);
		}
		
		input.close();
	}

}
