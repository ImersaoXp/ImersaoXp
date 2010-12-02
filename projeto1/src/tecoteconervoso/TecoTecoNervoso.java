package tecoteconervoso;

import java.util.Arrays;

public class TecoTecoNervoso {
	private char[][] tela = new char[5][5];
	
	
	
	public void inicializarJogo(){
		Arrays.fill(tela, ' ');
		tela[5][3] = '^';
	}
	
//	private void esquerda
	
	
	public String[] tela() {
		inicializarJogo();
		String[] saida = new String[5];     
		for (int i = 0; i < 5; i++) {
			saida[i] = new String(tela[i]); 
		}
		return saida;
	}
	
}
