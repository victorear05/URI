package basicos;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class URI_1061 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LocalDateTime entrada, saida;
		@SuppressWarnings("unused")
		String aux, strEntrada, strSaida;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		int dia;
		
		aux = input.next();
		dia = input.nextInt();
		if(dia < 10)
			strEntrada = "0" + dia + "/04/2021 ";
		else 
			strEntrada = dia+"/04/2021 ";
		strEntrada += input.next();
		strEntrada += input.next();
		strEntrada += input.next();
		strEntrada += input.next();
		strEntrada += input.next();
		
		entrada = LocalDateTime.parse(strEntrada, formato);
		
		aux = input.next();
		dia = input.nextInt();
		if(dia < 10)
			strSaida = "0" + dia + "/04/2021 ";
		else 
			strSaida = dia+"/04/2021 ";
		strSaida += input.next();
		strSaida += input.next();
		strSaida += input.next();
		strSaida += input.next();
		strSaida += input.next();
		
		saida = LocalDateTime.parse(strSaida, formato);	
		
		Duration duracao = Duration.between(entrada, saida);
		long duracao_d = duracao.toDays();
		long duracao_h = duracao.toHours() - duracao_d * 24;
		long duracao_m = duracao.toMinutes() - (duracao_d * 1440 + duracao_h * 60) ;
		long duracao_s = duracao.toSeconds() - (duracao_d * 86400 + duracao_h * 3600 + duracao_m * 60);
		
		System.out.print(duracao_d + " dia(s)\n"
				+ duracao_h + " hora(s)\n"
				+ duracao_m + " minuto(s)\n"
				+ duracao_s + " segundo(s)\n");
		
		input.close();
	}

}
