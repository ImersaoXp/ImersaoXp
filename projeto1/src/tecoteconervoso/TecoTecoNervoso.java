package tecoteconervoso;


public class TecoTecoNervoso {
	private Aviao aviao;
	private Tela tela;
	private int posicaoTiro = -1;
	
	public TecoTecoNervoso() {
		super();
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
		
		if(posicaoTiro != - 1){
			tela.mapa[3][posicaoTiro] = '!';
		}
		
		String[] saida = new String[5];
		for (int i = 0; i < 5; i++) {
			saida[i] = new String(tela.mapa[i]);
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
		tela.mapa[2][posicaoTiro] = '!';		
	}
}
