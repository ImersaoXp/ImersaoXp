package tecoteconervoso.testes;

import org.junit.Assert;
import org.junit.Test;

import tecoteconervoso.TecoTecoNervoso;

public class TecoTecoNervosoTest {

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

	@SuppressWarnings("deprecation")
	@Test public void telaDireita() {
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
}
