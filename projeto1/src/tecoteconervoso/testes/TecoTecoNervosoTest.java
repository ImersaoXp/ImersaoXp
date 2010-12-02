package tecoteconervoso.testes;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import tecoteconervoso.TecoTecoNervoso;

public class TecoTecoNervosoTest {
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void telaInicial() {
		TecoTecoNervoso jogo = new TecoTecoNervoso();
		String[] telaInicial = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(telaInicial, jogo.tela());
	}

	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void aviao1ParaDireita() {
		TecoTecoNervoso jogo = new TecoTecoNervoso();
		jogo.tela();
		jogo.direita();
		String[] telaDireita1 = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"   ^ ",
		};
		Assert.assertEquals(telaDireita1, jogo.tela());
	}
	
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void aviaoNaDireitaDaTela() {
		TecoTecoNervoso jogo = new TecoTecoNervoso();
		jogo.tela();
		jogo.direita();
		jogo.direita();
		jogo.esquerda();
		jogo.direita();
		String[] telaDireita1 = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"    ^",
		};
		Assert.assertEquals(telaDireita1, jogo.tela());
	}
	
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void aviaoNaEsquerdaDaTela() {
		TecoTecoNervoso jogo = new TecoTecoNervoso();
		jogo.tela();
		jogo.esquerda();
		jogo.esquerda();
		jogo.direita();
		jogo.esquerda();
		String[] telaDireita1 = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"^    ",
		};
		Assert.assertEquals(telaDireita1, jogo.tela());
	}
}
