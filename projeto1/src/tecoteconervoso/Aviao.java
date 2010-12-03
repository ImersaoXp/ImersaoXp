package tecoteconervoso;

public class Aviao implements Elemento {
	private static final int LINHA_DO_AVIAO = 4;
	public int posicaoX = 2;
	public int posicaoY = LINHA_DO_AVIAO;
	private int _larguraDaTela;

	
	
	public Aviao(int larguraDaTela) {
		_larguraDaTela = larguraDaTela;
	}

	public void direita() {
		if (posicaoX < _larguraDaTela - 1)
			posicaoX++;
	}

	public void esquerda() {
		if (posicaoX > 0)
			posicaoX--;
	}

	@Override public int linha() { return posicaoY; }
	@Override public int coluna() { return posicaoX;	}
	@Override public char character() { return '^';	}

	@Override
	public boolean estaNaTela() {
		return true;
	}

}
