package tecoteconervoso;

public class Inimigo {
	public static final int ESPERA_TELAS = 10;
	private int qtdTelas;
	private int y = 0;
	private boolean inimigoNaTela = false;
	
	public void desenha(char[][] mapa) {
		qtdTelas++;
		
		if (qtdTelas % 10 == 0){
			y = 0;
			inimigoNaTela = true;
	    }
		if (inimigoNaTela) {	
			mapa[y][4] = '%';
			y++;
			if (y>4) inimigoNaTela = false;
		}
		
	}
}
