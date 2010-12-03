package tecoteconervoso;

import java.util.Arrays;

public class TecoTecoNervoso {
	private char[][] tela = new char[5][5];
	private Aviao aviao;
	private int posicaoTiro = -1;
	private int posicaoTiroY = 2;
	
	public TecoTecoNervoso() {
		super();
		inicializarJogo();
	}

	
	public void inicializarJogo() {		
		aviao = new Aviao();
		limparTela();
		aviao.posicaoX = 2;				
	}


	public void limparTela() {
		for (int x = 0; x < 5; x++) {
			Arrays.fill(tela[x], ' ');
		}
	}

	public String[] tela() {
		limparTela();
		aviao.desenha(tela);
		
		
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
		if(aviao.posicaoX < 4)
			aviao.direita();	
	}

	public void esquerda() {
		if(aviao.posicaoX > 0)
			aviao.esquerda();	
	}

	public void atira() {
		posicaoTiro = aviao.posicaoX;
		tela[2][posicaoTiro] = '!';		
	}
}
