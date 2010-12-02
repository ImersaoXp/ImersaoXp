package tecoteconervoso;

import base.CapturadorDeTecla;


public class TecoTecoNervosoMain {

	public static void main(String[] args) throws InterruptedException {
		
		TecoTecoNervoso tn = new TecoTecoNervoso();
		CapturadorDeTecla capturador = new CapturadorDeTecla();
		String[] tela;
		
		while(true) 
		{
			System.out.println(capturador.getKeyCode());
			tela = tn.tela();
			for (int linha = 0; linha < 5; linha++) {
				if(capturador.getKeyCode() == 39){
					tn.direita();					
				}else if (capturador.getKeyCode() == 37){
					tn.esquerda();
				}
				capturador.setKeyCode(0);
				System.out.println(tela[linha]);
				
			}
			Thread.sleep(100);
		}
		
	}

}
