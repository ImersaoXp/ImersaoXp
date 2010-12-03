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
		aviao = new Aviao(tela);
		inimigo = new Inimigo();
		tiro = new Tiro();
		tela.limpar();
		aviao.posicaoX = 2;
	}

	public String[] tela() {
		tela.limpar();
		aviao.desenha();
		inimigo.desenha(tela.mapa);
		tiro.desenha(tela.mapa);
		return tela.renderizaLinhas();
	}

	public void direita() {
		aviao.direita(tela.mapa);

	}

	public void esquerda() {
		aviao.esquerda();

	}

	public void atira() {
		if (!tiro.aparecendo())
			tiro = aviao.atira();

	}

}
