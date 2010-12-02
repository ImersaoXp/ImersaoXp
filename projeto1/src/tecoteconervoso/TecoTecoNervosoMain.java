package tecoteconervoso;

import base.CapturadorDeTecla;


public class TecoTecoNervosoMain {

	public static void main(String[] args) throws InterruptedException {
		
		TecoTecoNervoso tn = new TecoTecoNervoso();
		CapturadorDeTecla capturador = new CapturadorDeTecla();
		String[] tela;
		
		while(true) 
		{		
			tela = tn.tela();
			
			int keyCodeTemp = capturador.getKeyCode();
			if(keyCodeTemp == 39){
				tn.direita();					
			}else if (keyCodeTemp == 37){
				tn.esquerda();
			}else if (keyCodeTemp == 83){
				tn.atira();
			}				

			
			for (int linha = 0; linha < 5; linha++) {
				System.out.println(tela[linha]);				
			}
			Thread.sleep(200);
		}
		
	}

}
