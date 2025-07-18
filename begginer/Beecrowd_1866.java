package begginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beecrowd_1866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append((num & 1) == 0 ? 0 : 1).append('\n');
		}

		System.out.print(sb.toString());
	}
}
