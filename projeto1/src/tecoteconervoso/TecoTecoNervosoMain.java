package tecoteconervoso;

import base.CapturadorDeTecla;


public class TecoTecoNervosoMain {

	private static final int BOTAO_TIRO = 83;
	private static final int BOTAO_ESQUERDA = 37;
	private static final int BOTAO_DIREITA = 39;

	public static void main(String[] args) throws InterruptedException {
		
		TecoTecoNervoso tn = new TecoTecoNervoso();
		CapturadorDeTecla capturador = new CapturadorDeTecla();
		String[] tela;
		
		while(true)
		{		
			tela = tn.tela();
			
			int keyCodeTemp = capturador.getKeyCode();
			if(keyCodeTemp == BOTAO_DIREITA){
				tn.direita();					
			}else if (keyCodeTemp == BOTAO_ESQUERDA){
				tn.esquerda();
			}else if (keyCodeTemp == BOTAO_TIRO){
				tn.atira();
			}				

			
			for (int linha = 0; linha < 5; linha++) {
				System.out.println(tela[linha]);				
			}
			Thread.sleep(200);
		}		
	}
}
