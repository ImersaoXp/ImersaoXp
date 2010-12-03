package tecoteconervoso.testes;

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
	@Test public void inimigoExplodeEmContatoComTiro() {
		esperaTelas(9);
		jogo.direita();
		jogo.direita();
		jogo.atira();
		
		assertTela(new String[] {
				"    %",
				"     ",
				"     ",
				"    !",
				"    ^",
		});
		
		tela();
		
		assertTela(new String[] {
				"     ",
				"    *",
				"     ",
				"     ",
				"    ^",
		});
	}
}
