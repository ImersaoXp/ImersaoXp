package tecoteconervoso;

public class Aviao {
	private static final int LINHA_DO_AVIAO = 4;
	public int posicaoX = 2;
	public int posicaoY = LINHA_DO_AVIAO;
	public Tela telaAtual;

	
	
	public Aviao(Tela telaAtual) {
		super();
		this.telaAtual = telaAtual;
	}

	public void desenha() {
		telaAtual.mapa[LINHA_DO_AVIAO][posicaoX] = '^';
	}

	public void direita(char[][] mapa) {
		if (posicaoX < telaAtual.largura - 1)
			posicaoX++;
	}

	public void esquerda() {
		if (posicaoX > 0)
			posicaoX--;
	}

	public Tiro atira() {
		Tiro tiro = new Tiro(this.posicaoX, this.posicaoY - 1);
		return tiro;
	}

}
