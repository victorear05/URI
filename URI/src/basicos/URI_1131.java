package basicos;

import java.util.Scanner;

public class URI_1131 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int novoGrenal = 1, cont = 0, Inter = 0, Gremio = 0;
		
		while(novoGrenal != 2) {
			int auxI = input.nextInt(), auxG = input.nextInt();
			if(auxI > auxG)
				Inter++;
			else if(auxG>auxI)
				Gremio++;
			
			cont ++;
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = input.nextInt();
		}
		int Empates = cont - (Inter + Gremio);
		String vencedor;
		if(Inter>Gremio)
			vencedor = "Inter";
		else
			vencedor = "Gremio";
		String resposta = cont + " grenais\nInter:" + Inter + "\nGremio:" + Gremio + "\nEmpates:" + Empates + "\n" + vencedor + " venceu mais";
		System.out.println(resposta);
		input.close();
	}

}
