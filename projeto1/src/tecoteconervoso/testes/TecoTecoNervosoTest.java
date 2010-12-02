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


	
}
