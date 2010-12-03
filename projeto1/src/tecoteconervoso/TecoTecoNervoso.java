package tecoteconervoso;


public class TecoTecoNervoso {
	private Aviao aviao;
	private Tela tela;
	private int posicaoTiro = -1;
	
	public TecoTecoNervoso() {

		inicializarJogo();
	}

	
	public void inicializarJogo() {		
		tela = new Tela(5, 5);
		aviao = new Aviao();
		
		tela.limpar();
		aviao.posicaoX = 2;				
	}


	public String[] tela() {
		tela.limpar();
		aviao.desenha(tela.mapa);
		desenhaTiro();
		return tela.renderizaLinhas();
	}


	private void desenhaTiro() {
		if(temTiro())
			tela.mapa[3][posicaoTiro] = '!';
	}


	private boolean temTiro() {
		return posicaoTiro != - 1;
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
		posicaoTiro = aviao.posicaoX;
	}
}
