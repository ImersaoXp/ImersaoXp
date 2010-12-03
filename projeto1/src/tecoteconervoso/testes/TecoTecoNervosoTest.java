package tecoteconervoso.testes;

import org.junit.Assert;
import org.junit.Test;

import tecoteconervoso.TecoTecoNervoso;

public class TecoTecoNervosoTest {
	
	private TecoTecoNervoso jogo = new TecoTecoNervoso();
	
	@Test public void telaInicial() {
		assertTela(new String[] {
			"     ",
			"     ",
			"     ",
			"     ",
			"  ^  ",
		});
	}
	
	
	private void assertTela(String[] telaEsperada) {
		String[] telaObservada = jogo.tela();
		for (int i = 0; i < telaEsperada.length; i++)
			Assert.assertEquals("Tela divergiu na linha " + i, telaEsperada[i], telaObservada[i]);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test public void aviaoAndaDireita() {
		jogo.direita();
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"   ^ ",
		});
	}
	
	@SuppressWarnings("deprecation")
	@Test public void aviaoAndaEsquerda() {
		jogo.esquerda();
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				" ^   ",
		});
	}
	
	@SuppressWarnings("deprecation")
	@Test public void aviaoRespeitaLimiteDireito() {
		jogo.direita();
		jogo.direita();
		jogo.direita();

		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"    ^",
		});
	}
	
	@SuppressWarnings("deprecation")
	@Test public void aviaoRespeitaLimiteEsquerdo() {
		jogo.esquerda();
		jogo.esquerda();
		jogo.esquerda();
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"^    ",
		});
	}
	
}
