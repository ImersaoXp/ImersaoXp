package tecoteconervoso;

public class TecoTecoNervoso {
	private Aviao aviao;
	private Tela tela;
	private Inimigo inimigo;
	private Tiro tiro;

	public TecoTecoNervoso() {

		inicializarJogo();
	}

	public void inicializarJogo() {
		tela = new Tela(5, 5);
		aviao = new Aviao(tela.largura);
		inimigo = new Inimigo();
		tiro = new Tiro();
		tela.limpar();
		aviao.posicaoX = 2;
	}

	public String[] tela() {
		tela.limpar();
		
		desenha(aviao);
		inimigo.desenha(tela.mapa);
		tiro.desenha(tela.mapa);
		return tela.renderizaLinhas();
	}

	private void desenha(Elemento elemento) {
		tela.mapa[elemento.linha()][elemento.coluna()] = elemento.character();
		
	}

	public void direita() {
		aviao.direita();

	}

	public void esquerda() {
		aviao.esquerda();

	}

	public void atira() {
		if (!tiro.aparecendo())
			tiro = new Tiro(aviao.posicaoX, aviao.posicaoY - 1);
	}

}
