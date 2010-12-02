package tecoteconervoso;

import java.util.Arrays;

public class TecoTecoNervoso {
	private char[][] tela = new char[5][5];
	private int posicaoAviao;
	
	public TecoTecoNervoso() {
		super();
		inicializarJogo();
	}


	public void inicializarJogo() {		
		for (int x = 0; x < 5; x++) {
			Arrays.fill(tela[x], ' ');
		}
		posicaoAviao = 2;
		tela[4][posicaoAviao] = '^';
		
	}

	

	public String[] tela() {		
		String[] saida = new String[5];
		for (int i = 0; i < 5; i++) {
			saida[i] = new String(tela[i]);
		}
		return saida;
	}

	public void direita() {
		// TODO Auto-generated method stub
		
	}

	public void esquerda() {
		// TODO Auto-generated method stub
		
	}



	public void atira() {
		// TODO Auto-generated method stub
		
	}
}
