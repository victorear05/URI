package begginer;

import java.util.*;

public class Beecrowd_2493 {

	public static void main(String[] args) {
		
		int T;
		List<String> Resultado = new LinkedList<String>();
		List<String> Erraram = new LinkedList<String>();
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			T = input.nextInt();
			int X;
			int Y;
			int Z;
			
			for(int i=0;i<T;i++) {
				X = input.nextInt();
				String aux = input.next();
				String tokens[] = aux.split("=");
				Y = Integer.parseInt(tokens[0]);
				Z = Integer.parseInt(tokens[1]);
				if(X + Y == Z)
					Resultado.add("+");
				else if(X * Y == Z)
					Resultado.add("*");
				else if(X - Y == Z)
					Resultado.add("-");
				else
					Resultado.add("I");
			}
				
			for(int i=0;i<T;i++) {
				String Nome = input.next();
				int questao = input.nextInt();
				String sinal = input.next();
				if(sinal.equals(Resultado.get(questao - 1)) == false)
					Erraram.add(Nome);
			}
			
			if(Erraram.size() == T)
				System.out.println("None Shall Pass!");
			else if(Erraram.size() == 0)
				System.out.println("You Shall All Pass!");
			else {
				Collections.sort(Erraram);
				for(int i=0;i<Erraram.size();i++)
					if(i == Erraram.size() - 1)
						System.out.print(Erraram.get(i));
					else
						System.out.print(Erraram.get(i) + " ");
				System.out.print("\n");
			}
			
			Resultado.clear();
			Erraram.clear();
		}
		input.close();
	}

}
