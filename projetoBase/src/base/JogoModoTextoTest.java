package base;

import static org.junit.Assert.*;


public abstract class JogoModoTextoTest {

	protected final JogoModoTexto _jogo = criaJogo();
	
	protected abstract JogoModoTexto criaJogo();
	
	protected void esquerda(){
		_jogo.esquerda();
	}
	
	protected void direita(){
		_jogo.direita();
	}
	
	protected void sobe(){
		_jogo.sobe();
	}
	
	protected void desce(){
		_jogo.desce();
	}
	
	protected void espaco(){
		_jogo.espaco();
	}
	
	protected String[] tela(){
		_jogo.step();
	
		return _jogo.tela();
	}
	
	protected void telaEsperada(String[] telaEsperada) {
		String[] telaAtual = tela();
		
		for (int linha = 0; linha < telaAtual.length; linha++)
			assertLinhaIgnorandoEspaco(telaEsperada[linha].toLowerCase(), telaAtual[linha].toLowerCase());	
	}

	private void assertLinhaIgnorandoEspaco(String linhaEsperada, String linhaAtual) {
		for (int coluna = 0; coluna < linhaEsperada.length(); coluna++) {
			if(linhaEsperada.charAt(coluna) != ' ') 
				if (linhaEsperada.charAt(coluna) != linhaAtual.charAt(coluna))
					assertEquals(linhaEsperada, linhaAtual);
		}
	}

}