package basicos;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class URI_1042 {

	public static void main(String[] args) {
		List<Integer> vet = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		vet.add(input.nextInt());
		vet.add(input.nextInt());
		vet.add(input.nextInt());
		String original = vet.get(0).toString() + "\n";
		original += vet.get(1).toString() + "\n";
		original += vet.get(2).toString() + "\n";
		vet.sort(null);
		for(int a : vet)
			System.out.println(a);
		System.out.print("\n" + original);
		input.close();
	}

}
