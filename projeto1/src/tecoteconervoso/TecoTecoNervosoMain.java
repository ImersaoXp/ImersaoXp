package tecoteconervoso;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import base.CapturadorDeTecla;
import base.JogoCanvas;
import base.MainDemo;


public class TecoTecoNervosoMain {

	private static final int TECLA_S = 83;
	private static final int SETA_ESQUERDA = 37;
	private static final int SETA_DIREITA = 39;

	private static Map<Character, BufferedImage> cacheBitmaps = new HashMap<Character, BufferedImage>();

	private static JogoCanvas canvas;

	
	
	public static void main(String[] args) throws Exception {
		cacheBitmaps.put('^', ImageIO.read(MainDemo.class.getResourceAsStream("Aviao.JPG")));
		cacheBitmaps.put(' ', ImageIO.read(MainDemo.class.getResourceAsStream("Mar.JPG")));
		cacheBitmaps.put('!', ImageIO.read(MainDemo.class.getResourceAsStream("Missel.jpg")));
		cacheBitmaps.put('%', ImageIO.read(MainDemo.class.getResourceAsStream("ET.bmp")));
		cacheBitmaps.put('*', ImageIO.read(MainDemo.class.getResourceAsStream("Explosion.jpg")));
		
		TecoTecoNervoso tn = new TecoTecoNervoso();
		CapturadorDeTecla capturador = new CapturadorDeTecla();
		iniciaCanvas();
		
		String[] tela;
		while(true) {		
			capturaBotao(tn, capturador);
			tela = tn.tela();
			printaTela(tela);
			exibeTelaGrafica(tela);
			esperaUmPouquinho();
		}		
	}
	
	private static void exibeTelaGrafica(String[] tela) {
		canvas.atualizaTela(tela);
	}


	private static void iniciaCanvas() {
		JFrame frame = new JFrame();
		//frame.setSize(448, 478);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas = new JogoCanvas(cacheBitmaps);
		canvas.setFocusable(true);
		
		frame.add(canvas);
		frame.setVisible(true);
	}

	
	private static void esperaUmPouquinho() throws InterruptedException {
		Thread.sleep(500);
	}

	private static void capturaBotao(TecoTecoNervoso tn, CapturadorDeTecla capturador) {
		int tecla = capturador.getKeyCode();

		if (tecla == SETA_DIREITA) tn.direita();					
		if (tecla == SETA_ESQUERDA) tn.esquerda();
		if (tecla == TECLA_S) tn.atira();
	}

	private static void printaTela(String[] tela) {
		for (int linha = 0; linha < tela.length; linha++)
			System.out.println(tela[linha]);				
	}
}
