package tecoteconervoso;

public class Tiro {
	private int posicaoTiroX = -1;
	private int posicaoTiroY = -1;

	public Tiro(){
		
	}
	
	public Tiro(int posicaoTiroX, int posicaoTiroY) {
		this.posicaoTiroX = posicaoTiroX;
		this.posicaoTiroY = posicaoTiroY;
	}

	public void desenha(char[][] mapa) {			
		if(aparecendo())
		{
			mapa[posicaoTiroY][posicaoTiroX] = '!';
			posicaoTiroY--;
			if (posicaoTiroY < 0)
				posicaoTiroX = -1;
		}
		
	}
	
	public boolean aparecendo() {
		return posicaoTiroX != - 1;
	}

}
