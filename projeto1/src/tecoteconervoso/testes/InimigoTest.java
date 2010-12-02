package tecoteconervoso.testes;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import tecoteconervoso.TecoTecoNervoso;

public class InimigoTest {
	TecoTecoNervoso jogo = new TecoTecoNervoso();

	private String[] telaComInimigo() {
		for(int i = 1; i < 10; i++) {
			jogo.tela();
		}
		return jogo.tela();
	}
	
	@Ignore
	@SuppressWarnings("deprecation")
	@Test public void inimigoApareceSuperiorDireito() {
		String[] telaObtida = telaComInimigo();
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
		telaComInimigo();
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
		telaComInimigo();
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
}
