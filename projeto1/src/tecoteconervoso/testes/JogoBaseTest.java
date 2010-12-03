package tecoteconervoso.testes;

import org.junit.Assert;

import tecoteconervoso.TecoTecoNervoso;

public class JogoBaseTest {

	protected TecoTecoNervoso jogo = new TecoTecoNervoso();

	protected void assertTela(String[] telaEsperada) {
		String[] telaObservada = jogo.tela();
		for (int i = 0; i < telaEsperada.length; i++)
			Assert.assertEquals("Tela divergiu na linha " + i, telaEsperada[i], telaObservada[i]);
	}

	protected String[] esperaTelas(int numeroDeTelas) {
		for(int i = 1; i < numeroDeTelas; i++)
			jogo.tela();
		return jogo.tela();
	}

	protected void atira() {
		jogo.atira();
	}

	protected void tela() {
		jogo.tela();
	}

	protected void esquerda() {
		jogo.esquerda();
	}

	protected void direita() {
		jogo.direita();
	}

}