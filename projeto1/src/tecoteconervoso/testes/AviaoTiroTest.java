package tecoteconervoso.testes;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import tecoteconervoso.TecoTecoNervoso;


public class AviaoTiroTest {
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void aviaoAtira() {
		TecoTecoNervoso jogo = new TecoTecoNervoso();
		jogo.tela();
		jogo.atira();
		String[] telaEsperada = new String[] {
				"     ",
				"     ",
				"     ",
				"  !  ",
				"  ^  ",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());
		
		jogo.tela();
		jogo.tela();
		telaEsperada = new String[] {
				"     ",
				"  !  ",
				"     ",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());

		jogo.tela();
		jogo.tela();
		telaEsperada = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());
		
	}
}
