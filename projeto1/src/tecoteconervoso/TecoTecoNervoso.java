package tecoteconervoso;


public class TecoTecoNervoso {
	private Aviao aviao;
	private Tela tela;
	private Inimigo inimigo;
	private int posicaoTiroX = -1;
	private int posicaoTiroY = -1;
	
	public TecoTecoNervoso() {

		inicializarJogo();
	}

	
	public void inicializarJogo() {		
		tela = new Tela(5, 5);
		aviao = new Aviao();
		inimigo = new Inimigo();
		
		tela.limpar();
		aviao.posicaoX = 2;				
	}


	public String[] tela() {
		tela.limpar();
		aviao.desenha(tela.mapa);
		inimigo.desenha(tela.mapa);
		desenhaTiro();
		return tela.renderizaLinhas();
	}


	private void desenhaTiro() {
		if(temTiro())
		{
			tela.mapa[posicaoTiroY][posicaoTiroX] = '!';
			posicaoTiroY--;
			if (posicaoTiroY < 0)
				posicaoTiroX = -1;
		}
	}


	private boolean temTiro() {
		return posicaoTiroX != - 1;
	}

	public void direita() {
		if(aviao.posicaoX < tela.largura-1)
			aviao.direita();	
	}

	public void esquerda() {
		if(aviao.posicaoX > 0)
			aviao.esquerda();	
	}

	public void atira() {
		posicaoTiroX = aviao.posicaoX;
		posicaoTiroY = aviao.posicaoY - 1;
	}
}
