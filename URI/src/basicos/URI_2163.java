package basicos;

import java.util.Scanner;

public class URI_2163 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(), M = input.nextInt();
		int X=0, Y=0;
		int varredura[][] = new int[N][M];
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				varredura[i][j] = input.nextInt();
		
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				if(varredura[i][j] == 42)
					if(i+1 < N && i-1 >=0 && j+1<M && j-1>=0) 
						if(varredura[i-1][j-1] == 7 && varredura[i-1][j] == 7 && varredura[i-1][j+1] == 7 && varredura[i][j-1] == 7 && 
						varredura[i][j+1] == 7 && varredura[i+1][j-1] == 7 && varredura[i+1][j] == 7 && varredura[i+1][j+1] == 7) {
							X=i+1;
							Y=j+1;
							break;
						}
		
		System.out.println(X + " " + Y);
		input.close();
	}

}
