package tecoteconervoso;

import java.util.Arrays;

public class Tela {
	public int largura;
	public int altura;
	public char[][] mapa;
	
	public Tela(int l, int a) {
		largura = l;
		altura = a;
		mapa = new char[altura][largura];
	}
	
	public void limpar() {
		for (int linha = 0; linha < 5; linha++) {
			Arrays.fill(mapa[linha], ' ');
		}
	}
}
