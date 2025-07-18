package begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beecrowd_1827 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringBuilder sb = new StringBuilder();
			String linha = br.readLine();
			if (linha == null) {
				break;
			}
			int t = Integer.parseInt(linha);
			int diagonalSecundaria = t-1;
			int metade = t/2;
			int terco = t/3;
			for (int i = 0; i < t; i++) {
				for (int j = 0; j < t; j++) {
					if (i == j && i == metade) {
						sb.append(4);
					} else if ((i>=terco && i<t-terco) && (j>=terco && j<t-terco)) {
						sb.append(1);
					} else if (i == j) {
						sb.append(2);
					} else if (diagonalSecundaria == j) {
						sb.append(3);
					} else {
						sb.append(0);
					}
				}
				diagonalSecundaria--;
				sb.append("\n");
			}
			System.out.println(sb);
		}
	}
}
