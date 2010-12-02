package tecoteconervoso;

import java.util.Arrays;

public class TecoTecoNervoso {
	private char[][] tela = new char[5][5];
	private int posicaoAviao;
	private int posicaoTiro = -1;
	private int posicaoTiroY = 2;
	
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
		
		if(posicaoTiro != - 1){
			tela[3][posicaoTiro] = '!';
		}
		
		String[] saida = new String[5];
		for (int i = 0; i < 5; i++) {
			saida[i] = new String(tela[i]);
		}
		return saida;
	}

	public void direita() {
		if(posicaoAviao < 4)
			posicaoAviao++;		
	}

	public void esquerda() {
		if(posicaoAviao > 0)
		posicaoAviao--;		
	}

	public void atira() {
		posicaoTiro = posicaoAviao;
		tela[2][posicaoTiro] = '!';		
	}
}
