package basicos;

public class URI_1156 {

	public static void main(String[] args) {
		double S = 1;
		int aux=1;
		for(int i=3;i<=39;i+=2) {
			S += i/Math.pow(2,aux);
			aux++;
		}
		System.out.printf("%.2f\n",S);

	}

}
