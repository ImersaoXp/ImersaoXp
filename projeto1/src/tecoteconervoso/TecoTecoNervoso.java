package tecoteconervoso;

public class TecoTecoNervoso {

	int aviaoPosicaoX = 0;
	
	public String[] tela() {
		if (aviaoPosicaoX == 0) {
			return new String[] {"     ",
			"     ",
			"     ",
			"     ",
			"  ^  ",};
		}
		return new String[] {"     ",
				"     ",
				"     ",
				"     ",
				"   ^ ",};
	}

	public void direita() {
		aviaoPosicaoX += 1;
	}

}
