package tecoteconervoso.testes;

import org.junit.Assert;
import org.junit.Test;

import tecoteconervoso.TecoTecoNervoso;

public class TecoTecoNervosoTest {
	
	private TecoTecoNervoso jogo = new TecoTecoNervoso();
	
	@SuppressWarnings("deprecation")
	@Test public void telaInicial() {
		String[] telaInicial = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(telaInicial, jogo.tela());
	}

	@SuppressWarnings("deprecation")
	@Test public void aviaoRespeitaLimiteDireito() {
		jogo.direita();
		jogo.direita();
		jogo.direita();
		String[] telaEsperada = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"    ^",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());
	}
	
	@SuppressWarnings("deprecation")
	@Test public void aviaoRespeitaLimiteEsquerdo() {
		jogo.esquerda();
		jogo.esquerda();
		jogo.esquerda();
		String[] telaEsperada = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"^    ",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());
	}
	
}
