package basicos;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class URI_1047 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int horaEntrada = input.nextInt();
		int minutoEntrada = input.nextInt();
		int horaSaida= input.nextInt();
		int minutoSaida = input.nextInt();
		input.close();
		
		LocalTime Entrada = LocalTime.of(horaEntrada, minutoEntrada);
		LocalTime Saida = LocalTime.of(horaSaida, minutoSaida);
		Duration duracao  = Duration.between(Entrada, Saida);
		
		long duracaoHoras = duracao.toHours();
		long duracaoMinutos = duracao.toMinutes() - (duracaoHoras * 60);
		
		if(duracaoHoras <= 0 && duracaoMinutos <= 0) {
			
			duracao = Duration.between(Saida, Entrada);
			duracaoMinutos = duracao.toMinutes();
			duracaoMinutos = 1440 - duracaoMinutos;
			duracaoHoras = duracaoMinutos / 60;
			duracaoMinutos = duracaoMinutos - (60 * duracaoHoras);
		
		}
		
		
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
	}

}
