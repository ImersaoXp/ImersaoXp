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
	@Test public void fuel() {
		TecoTecoNervoso jogo = new TecoTecoNervoso();
		jogo.tela();
		String[] tela2 = new String[] {
				"   F ",
				"     ",
				"     ",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(tela2, jogo.tela());
		String[] tela3 = new String[] {
				"     ",
				"   F ",
				"     ",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(tela3, jogo.tela());
	}
	
}
