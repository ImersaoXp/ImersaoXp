package tecoteconervoso;

public class Aviao {
	public int posicaoX = 2;
	
	public void direita() {
		posicaoX++;		
	}

	public void esquerda() {
		posicaoX--;		
	}
	
	public void atira(){
		
	}
	
	public void desenha(char[][] tela) {
		tela[4][posicaoX] = '^';
	}
}
