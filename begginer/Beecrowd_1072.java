package begginer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd_1072 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N, aux;
		List<Integer> dentro = new LinkedList<Integer>();
		List<Integer> fora = new LinkedList<Integer>();
		N = input.nextInt();
		for(int i=0;i<N;i++) {
			aux = input.nextInt();
			if(aux < 10 || aux > 20)
				fora.add(aux);
			else
				dentro.add(aux);		
		}
		System.out.println(dentro.size() + " in");
		System.out.println(fora.size() + " out");
		
		input.close();
	}

}
