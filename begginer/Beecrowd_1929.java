package begginer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd_1929 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> lados = new LinkedList<Integer>();
		
		lados.add(input.nextInt());
		lados.add(input.nextInt());
		lados.add(input.nextInt());
		lados.add(input.nextInt());		
		Collections.sort(lados);

		if(lados.get(0) + lados.get(1) > lados.get(2))
			System.out.println("S");
		else if(lados.get(1) + lados.get(2) > lados.get(3))
			System.out.println("S");
		else
			System.out.println("N");
		
		input.close();
	}

}
