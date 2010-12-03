package tecoteconervoso;

public class Aviao {
	private static final int LINHA_DO_AVIAO = 4;
	public int posicaoX = 2;
	
	public void direita() {
		posicaoX++;		
	}

	public void esquerda() {
		posicaoX--;		
	}
	
	public void desenha(char[][] tela) {
		tela[LINHA_DO_AVIAO][posicaoX] = '^';
	}
}
