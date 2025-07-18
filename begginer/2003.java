package basicos;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class URI_2003 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("H:mm");
		LocalTime encontro = LocalTime.parse("8:00",format);
		
		while(input.hasNext()) {
			String strHora = input.next();
			LocalTime hora = LocalTime.parse(strHora, format);
			LocalTime atraso = hora.plusMinutes(60);
			
			if(atraso.isBefore(encontro) || atraso.equals(encontro))
				System.out.println("Atraso maximo: 0");
			else {
				Duration duracao = Duration.between(encontro, atraso);
				long duracao_min = duracao.toMinutes();
				System.out.println("Atraso maximo: " + duracao_min);
			}
			
		}
		
		input.close();
	}

}
