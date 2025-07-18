package basicos;

import java.util.Scanner;

public class URI_1144 {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int N = input.nextInt();
		int aux1 = 1,aux2 = 1,aux3 = 1;
		System.out.println(aux1 + " " + aux2 + " " + aux3);
		for(int i=1;i<N*2;i++) {
			if(i%2!=0) {
				aux2++;
				aux3++;
			}
			else {
				aux1++;
				aux2 += i;
				aux3 = aux1 * aux2;
			}
			System.out.println(aux1 + " " + aux2 + " " + aux3);
		}
		input.close();
	}

}
