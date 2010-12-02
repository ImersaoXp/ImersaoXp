public class Teste {

	public static char[][] mapa = new char[10][80]; 
	

	public static void movimentaAviao() throws InterruptedException {
		int pos = 30;
		int sinal = +1;
		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("  " + System.currentTimeMillis());

			if (pos == 60) {
				sinal = -sinal;
			}

			pos += sinal;

			String str = Teste.replicaChar(" ", pos);

			System.out.println(str + "  ^  ");

			Thread.sleep(300);

		}
	}

	
	
	public static String replicaChar(String str, int numero) {
		String saida = "";
		for (int i = 0; i < numero; i++) {
			saida += str;
		}
		return saida;
	}

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			movimentaAviao();
			System.out.println();
			System.out.println();
			//System.out.println("   " + System.currentTimeMillis());
			Thread.sleep(300);
		}
	}
}
