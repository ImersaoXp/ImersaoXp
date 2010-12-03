package tecoteconervoso;

import base.CapturadorDeTecla;


public class TecoTecoNervosoMain {

	private static final int TECLA_S = 83;
	private static final int SETA_ESQUERDA = 37;
	private static final int SETA_DIREITA = 39;

	public static void main(String[] args) throws InterruptedException {
		
		TecoTecoNervoso tn = new TecoTecoNervoso();
		CapturadorDeTecla capturador = new CapturadorDeTecla();
		
		while(true) {		
			capturaBotao(tn, capturador);				
			printaTela(tn.tela());
			esperaUmPouquinho();
		}		
	}

	private static void esperaUmPouquinho() throws InterruptedException {
		Thread.sleep(200);
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
