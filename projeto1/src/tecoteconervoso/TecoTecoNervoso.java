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
		
		inimigo.passo();
		
		desenha(aviao);
		desenha(inimigo);
		tiro.desenha(tela.mapa);
		
		desenhaColisao(aviao, inimigo);
		
		return tela.renderizaLinhas();
	}

	private void desenhaColisao(Elemento elemento1, Elemento elemento2) {
		if (!elemento1.estaNaTela()) return;
		if (!elemento2.estaNaTela()) return;
		
		if(elemento1.linha() != elemento2.linha()) return;
		if(elemento1.coluna() != elemento2.coluna()) return;
		
		tela.mapa[elemento1.linha()][elemento1.coluna()] = '*';
	}

	private void desenha(Elemento elemento) {
		if (!elemento.estaNaTela()) return;
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
