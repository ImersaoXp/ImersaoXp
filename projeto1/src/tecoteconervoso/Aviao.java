package tecoteconervoso;

public class Aviao {
	private static final int LINHA_DO_AVIAO = 4;
	public int posicaoX = 2;
	public int posicaoY = LINHA_DO_AVIAO;
	public Tela telaAtual;
	
	public void desenha(Tela tela) {
		tela.mapa[LINHA_DO_AVIAO][posicaoX] = '^';
		telaAtual = tela;
	}
	
	public void direita(char[][] mapa) {
		if(posicaoX < telaAtual.largura-1)
			posicaoX++;		
	}

	public void esquerda() {
		if(posicaoX > 0)
			posicaoX--;	
	}	
}
