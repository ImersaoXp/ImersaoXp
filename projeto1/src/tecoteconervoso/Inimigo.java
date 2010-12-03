package tecoteconervoso;

public class Inimigo implements Elemento {
	public static final int ESPERA_TELAS = 10;
	private int qtdTelas;
	private int y = 0;
	public boolean inimigoNaTela = false;
	

	void passo() {
		qtdTelas++;	
		if (qtdTelas % 10 == 0){
			y = 0;
			inimigoNaTela = true;
			return;
	    }

		y++;
		if (y>4) inimigoNaTela = false;

	}

	@Override public int linha() { return y; }
	@Override public int coluna() { return 4;	}
	@Override public char character() { return '%'; }

	@Override
	public boolean estaNaTela() {
		return inimigoNaTela;
	}

}
