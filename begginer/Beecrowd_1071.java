package begginer;

import java.util.Scanner;

public class Beecrowd_1071 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X, Y, soma = 0;
		X = input.nextInt();
		Y = input.nextInt();
		
		for(int i=X-1;i>Y;i--) 
			if(i%2 != 0)
				soma += i;
				
		System.out.println(soma);
		
		input.close();
	}

}
