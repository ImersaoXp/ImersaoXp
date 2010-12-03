package base;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

public class MainDemo {
	
	public static void main(String[] args) throws IOException {
		Map<Character, BufferedImage> cacheBitmaps = new HashMap<Character, BufferedImage>();
		cacheBitmaps.put('^', ImageIO.read(MainDemo.class.getResourceAsStream("Aviao.JPG")));
		cacheBitmaps.put(' ', ImageIO.read(MainDemo.class.getResourceAsStream("Mar.JPG")));
		LoopPrincipal loop = new LoopPrincipal(new JogoDemo(), cacheBitmaps);
		
		loop.start();
	}

}