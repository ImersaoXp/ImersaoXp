package base;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CapturadorDeTecla {

	int keyCode;	
	
	public void setKeyCode(int keyCode) {
		this.keyCode = keyCode;
	}

	public int getKeyCode() {		
		int keyCodeTemp = keyCode;
		setKeyCode(0);
		return keyCodeTemp;
		
	}

	public CapturadorDeTecla() {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Capturador");
		
		button.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				keyCode = e.getKeyCode();
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