package tecoteconervoso.testes;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import tecoteconervoso.TecoTecoNervoso;


public class AviaoTiroTest {
	@SuppressWarnings("deprecation")
	@Test public void aviaoAtiraParado() {
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
	}
	
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void TiroAndaDuasVezes() {
		TecoTecoNervoso jogo = new TecoTecoNervoso();
		jogo.tela();
		jogo.atira();
		jogo.tela();
		jogo.tela();
		String[] telaEsperada = new String[] {
				"     ",
				"  !  ",
				"     ",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());
	}
	
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void TiroAndaSeisVezes() {
		TecoTecoNervoso jogo = new TecoTecoNervoso();
		jogo.tela();
		jogo.atira();
		jogo.tela();
		jogo.tela();
		jogo.tela();
		jogo.tela();
		jogo.tela();
		jogo.tela();
		String[] telaEsperada = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());
	}
	
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void aviaoAtiraEAnda() {
		TecoTecoNervoso jogo = new TecoTecoNervoso();
		jogo.tela();
		jogo.direita();
		jogo.atira();		
		jogo.direita();
		String[] telaEsperada = new String[] {
				"     ",
				"     ",
				"     ",
				"   ! ",
				"    ^",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());
		
		jogo.tela();
		jogo.tela();
		telaEsperada = new String[] {
				"     ",
				"  !  ",
				"     ",
				"     ",
				"    ^",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());

		jogo.tela();
		jogo.esquerda();
		jogo.esquerda();
		jogo.esquerda();
		jogo.esquerda();
		jogo.esquerda();
		telaEsperada = new String[] {
				"  !  ",
				"     ",
				"     ",
				"     ",
				"^    ",
		};
		Assert.assertEquals(telaEsperada, jogo.tela());		
	}

}
