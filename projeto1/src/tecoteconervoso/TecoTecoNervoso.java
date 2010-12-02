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
		limparTela();
		posicaoAviao = 2;				
	}


	public void limparTela() {
		for (int x = 0; x < 5; x++) {
			Arrays.fill(tela[x], ' ');
		}
	}

	public String[] tela() {
		limparTela();
		tela[4][posicaoAviao] = '^';
		String[] saida = new String[5];
		for (int i = 0; i < 5; i++) {
			saida[i] = new String(tela[i]);
		}
		return saida;
	}

	public void direita() {
		posicaoAviao++;				
	}

	public void esquerda() {
		posicaoAviao--;
		
	}

	public void atira() {		
		tela[3][2] = '!';		
	}
}
