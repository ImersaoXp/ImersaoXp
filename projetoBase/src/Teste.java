import java.util.Arrays;


public class Teste {

	
	
	public static void atualizaHUD(char[][] mapa){
		
		int x = (int)(Math.random() * 20) + 60;
		int y = (int)(Math.random() * 10) - 4;
		
		if(Math.random() < 0.3){
			mapa[x][y] = 'F';
			mapa[x][y + 1] = 'U';
			mapa[x][y + 2] = 'E';
			mapa[x][y + 3] = 'L';
		}
		
		for (int i = 0; i < 10; i++){
			mapa[i][79] = '|';
			mapa[i][0] = '|';
		}
		
		
	}
}
