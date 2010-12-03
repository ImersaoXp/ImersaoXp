package tecoteconervoso;

public class Tiro {
	private int posicaoTiroX = -1;
	private int posicaoTiroY = -1;
	
	public void desenha(char[][] mapa) {			
		if(temTiro())
		{
			mapa[posicaoTiroY][posicaoTiroX] = '!';
			posicaoTiroY--;
			if (posicaoTiroY < 0)
				posicaoTiroX = -1;
		}
		
	}
	
	private boolean temTiro() {
		return posicaoTiroX != - 1;
	}

	public void atira(Aviao aviao) {
		if(!temTiro()){
			posicaoTiroX = aviao.posicaoX;
			posicaoTiroY = aviao.posicaoY - 1;
		}
	}
}
