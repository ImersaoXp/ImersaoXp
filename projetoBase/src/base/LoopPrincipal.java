package base;

import java.awt.image.BufferedImage;
import java.util.Map;

import javax.swing.JFrame;

public class LoopPrincipal {
	
	private final JogoModoTexto _jogo;
	private Map<Character, BufferedImage> _mapa;
	private JogoCanvas _canvas;

	public LoopPrincipal(JogoModoTexto jogo, Map<Character, BufferedImage> cacheBitmaps) {
		_jogo = jogo; 
		_mapa = cacheBitmaps;
	}

	public void start()  {
		iniciaCapturaDeTeclas();
		
		while (true) {
			esperaUmPouquinho();
			_jogo.step();
			exibeTelaGrafica();
			imprimeTelaNoConsole();
		}
	}
	
	private void exibeTelaGrafica() {
		_canvas.atualizaTela(_jogo.tela());
	}

	private void iniciaCapturaDeTeclas() {
		JFrame frame = new JFrame();
		frame.setSize(448, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_canvas = new JogoCanvas(_mapa);
		_canvas.setFocusable(true);
		
		frame.add(_canvas);
		frame.setVisible(true);
	}
	
	private void imprimeTelaNoConsole() {
		String[] tela = _jogo.tela();

		quebraLinhas();
		
		for (String linhaAtual : tela) 
			System.out.println(linhaAtual);
	}
	
	private void quebraLinhas() {
		System.out.println("\n \n \n \n");
	}

	private void esperaUmPouquinho() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
