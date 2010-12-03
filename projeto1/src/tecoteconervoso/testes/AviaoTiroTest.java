package tecoteconervoso.testes;

import org.junit.Ignore;
import org.junit.Test;


public class AviaoTiroTest extends JogoBaseTest {
	
	@Test public void aviaoAtiraParado() {
		tela();
		atira();
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"  !  ",
				"  ^  ",
		});
	}

	@Ignore
	@Test public void TiroAndaDuasVezes() {
		tela();
		atira();
		tela();
		tela();
		assertTela(new String[] {
				"     ",
				"  !  ",
				"     ",
				"     ",
				"  ^  ",
		});
	}
	
	@Ignore
	@Test public void TiroAndaSeisVezes() {
		tela();
		atira();
		esperaTelas(6);
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"  ^  ",
		});
	}
	
	@Ignore
	@Test public void aviaoAtiraEAndaDireita() {
		tela();
		direita();
		atira();		
		direita();
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"   ! ",
				"    ^",
		});
		
		tela();
		tela();
		assertTela(new String[] {
				"     ",
				"  !  ",
				"     ",
				"     ",
				"    ^",
		});

		tela();
		esquerda();
		esquerda();
		esquerda();
		esquerda();
		esquerda();
		assertTela(new String[] {
				"  !  ",
				"     ",
				"     ",
				"     ",
				"^    ",
		});		
	}

}
