

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CapturadorDeTecla {

	public CapturadorDeTecla() {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Capturador");
		
		button.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
			}
		});
		
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new CapturadorDeTecla();
	}
	
}