import java.util.Arrays;

public class Teste {

	public static char[][] mapa = new char[10][80]; 
	static int posAviao = 30;
	static int sinalDirecaoAviao = 1;
	

	public static void movimentaAviao() throws InterruptedException {

		if (posAviao == 20 || posAviao == 60) {
			sinalDirecaoAviao = -sinalDirecaoAviao;
		}

		posAviao += sinalDirecaoAviao;

		mapa[9][posAviao] = '^';
	}

	
	
	public static String replicaChar(String str, int numero) {
		String saida = "";
		for (int i = 0; i < numero; i++) {
			saida += str;
		}
		return saida;
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <= 9; i++) {
			Arrays.fill(mapa[i], ' ');
		}
		while (true) {
			movimentaAviao();
			System.out.println();
			System.out.println();
			for (int i = 0; i <= 9; i++) {
				System.out.println(mapa[i]);
			}
			Thread.sleep(300);
		}
	}
}
