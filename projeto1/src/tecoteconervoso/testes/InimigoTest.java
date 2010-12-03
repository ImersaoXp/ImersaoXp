package tecoteconervoso.testes;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class InimigoTest extends JogoBaseTest {

	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void inimigoApareceSuperiorDireito() {
		String[] telaObtida = esperaTelas(10);
		String[] telaEsperada = new String[] {
				"    %",
				"     ",
				"     ",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(telaEsperada, telaObtida);
	}
	
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void inimigoDesceEmLinhaReta() {
		esperaTelas(10);
		jogo.tela();
		String[] telaObtida = jogo.tela();
		String[] telaEsperada = new String[] {
				"     ",
				"     ",
				"    %",
				"     ",
				"  ^  ",
		};
		Assert.assertEquals(telaEsperada, telaObtida);
	}
	
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void inimigoExplodeEmContatoComAviao() {
		esperaTelas(10);
		jogo.direita();
		jogo.direita();
		jogo.tela();
		jogo.tela();
		jogo.tela();
		String[] telaObtida = jogo.tela();
		String[] telaEsperada = new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"    *",
		};
		Assert.assertEquals(telaEsperada, telaObtida);
	}
	
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void inimigoExplodeEmContatoComTiro() {
		esperaTelas(10);
		jogo.direita();
		jogo.direita();
		jogo.atira();
		String[] telaObtida = jogo.tela();
		String[] telaEsperada = new String[] {
				"    %",
				"     ",
				"     ",
				"    !",
				"    ^",
		};
		Assert.assertEquals(telaEsperada, telaObtida);
		
		jogo.tela();
		telaObtida = jogo.tela();
		telaEsperada = new String[] {
				"     ",
				"    *",
				"     ",
				"     ",
				"    ^",
		};
		Assert.assertEquals(telaEsperada, telaObtida);
	}
}
