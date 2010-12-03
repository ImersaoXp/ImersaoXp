package tecoteconervoso;

public class Inimigo {
	public static final int ESPERA_TELAS = 10;
	private int qtdTelas;
	private int y = 0;
	public boolean inimigoNaTela = false;
	
	public void desenha(char[][] mapa) {			
		desenhaInimigo();
		explodeInimigo(mapa);
		
	}

	private void explodeInimigo(char[][] mapa) {
		if (inimigoNaTela) {
			if (mapa[y][4] != ' ') {
				mapa[y][4] = '*';
				inimigoNaTela = false;
			}
			else
				mapa[y][4] = '%';
			y++;
			if (y>4) inimigoNaTela = false;
		}
	}

	private void desenhaInimigo() {
		qtdTelas++;	
		if (qtdTelas % 10 == 0){
			y = 0;
			inimigoNaTela = true;
	    }
	}
}
