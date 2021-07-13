package basicos;

import java.util.Scanner;

public class URI_1847 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		if(B<A && C>=B)
			System.out.println(":)");	
		else if(B>A && C<=B)
			System.out.println(":(");
		else if(C>B && B>A && C-B < B-A)
			System.out.println(":(");
		else if(C>B && B>A && C-B >= B-A)	
			System.out.println(":)");	
		else if(A>B && B>C && A-B > B-C)
			System.out.println(":)");
		else if(A>B && B>C && A-B <= B-C)
			System.out.println(":(");
		else if(B==A && B>C)
			System.out.println(":(");
		else if(B==A && C>B)
			System.out.println(":)");
		else 
			System.out.println(":(");
		
		input.close();
	}

}
