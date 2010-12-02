package tecoteconervoso;


public class TecoTecoNervosoMain {

	public static void main(String[] args) {
		
		TecoTecoNervoso tn = new TecoTecoNervoso();
		String[] tela;
		
		while(true) 
		{
			tela = tn.tela();
			for (int x = 0; x < 5; x++) {
				System.out.println(tela[x]);
			}
		}
		
	}

}
