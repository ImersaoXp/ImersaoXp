package tecoteconervoso.testes;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class InimigoTest extends JogoBaseTest {

	@Test public void inimigoApareceSuperiorDireito() {
		esperaTelas(9);
		assertTela(new String[] {
				"    %",
				"     ",
				"     ",
				"     ",
				"  ^  ",
		});
	}
	
	@Test public void inimigoDesceEmLinhaReta() {
		esperaTelas(11);
		assertTela(new String[] {
				"     ",
				"     ",
				"    %",
				"     ",
				"  ^  ",
		});
	}
	

	@Test public void inimigoExplodeEmContatoComAviao() {
		esperaTelas(10);
		direita();
		direita();
		esperaTelas(3);
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"    *",
		});
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
