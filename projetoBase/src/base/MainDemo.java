package base;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

public class MainDemo {
	
	public static void main(String[] args) throws IOException {
		Map<Character, BufferedImage> cacheBitmaps = new HashMap<Character, BufferedImage>();
		cacheBitmaps.put('1', ImageIO.read(MainDemo.class.getResourceAsStream("i1.jpg")));
		cacheBitmaps.put('2', ImageIO.read(MainDemo.class.getResourceAsStream("i2.jpg")));
		cacheBitmaps.put('3', ImageIO.read(MainDemo.class.getResourceAsStream("i3.jpg")));
		LoopPrincipal loop = new LoopPrincipal(new JogoDemo(), cacheBitmaps);
		
		loop.start();
	}

}