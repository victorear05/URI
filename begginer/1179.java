package basicos;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class URI_1179 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List <Integer> par = new LinkedList<Integer>();		
		List <Integer> impar = new LinkedList<Integer>();		
		for(int i=0;i<15;i++) {
			int N = input.nextInt();
			if(N%2==0)
				par.add(N);
			else
				impar.add(N);
			if(par.size()==5) {
				int Z = 0;
				for(int j : par) {
					System.out.println("par[" + Z +"] = " + j);
				Z++;
				}
				par.clear();
			}
			if(impar.size()==5){
				int Z = 0;
				for(int j : impar) {
					System.out.println("impar[" + Z +"] = " + j);
				Z++;
				}
				impar.clear();
			}
		}
		int Z = 0;
		if(impar.isEmpty()==false)
			for(int i : impar) {
				System.out.println("impar[" + Z +"] = " + i);
			Z++;
			}
		Z = 0;
		if(par.isEmpty()==false)
			for(int i : par) {
				System.out.println("par[" + Z +"] = " + i);
			Z++;
			}
		input.close();
	}

}
