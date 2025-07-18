package begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Beecrowd_1848 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("---", 0);
		mapa.put("--*", 1);
		mapa.put("-*-", 2);
		mapa.put("-**", 3);
		mapa.put("*--", 4);
		mapa.put("*-*", 5);
		mapa.put("**-", 6);
		mapa.put("***", 7);

		int contagemGrito = 0;
		int valorAtual = 0;
		while (contagemGrito < 3) {
			String linha = br.readLine();
			if (linha.length() != 3) {
				sb.append(valorAtual).append('\n');
				valorAtual = 0;
				contagemGrito++;
				continue;
			}
			valorAtual += mapa.get(linha);
		}
		System.out.print(sb.toString());
	}
}
