package tecoteconervoso.testes;

import org.junit.Test;


public class TecoTecoNervosoTest extends JogoBaseTest {
	
	@Test public void telaInicial() {
		assertTela(new String[] {
			"     ",
			"     ",
			"     ",
			"     ",
			"  ^  ",
		});
	}
	
	
	@Test public void aviaoAndaDireita() {
		jogo.tela();
		jogo.direita();
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"   ^ ",
		});
	}
	
	@Test public void aviaoAndaEsquerda() {
		jogo.esquerda();
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				" ^   ",
		});
	}
	
	@Test public void aviaoRespeitaLimiteDireito() {
		jogo.tela();
		jogo.direita();
		jogo.direita();
		jogo.direita();

		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"    ^",
		});
	}
	
	@Test public void aviaoRespeitaLimiteEsquerdo() {
		jogo.esquerda();
		jogo.esquerda();
		jogo.esquerda();
		assertTela(new String[] {
				"     ",
				"     ",
				"     ",
				"     ",
				"^    ",
		});
	}
}
