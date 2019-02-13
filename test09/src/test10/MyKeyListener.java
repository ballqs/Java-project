package test10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyKeyListener extends JFrame implements KeyListener{
	JFrame f;
	JPanel p;
	JLabel keyMessage[];
	MyKeyListener(){
		f = new JFrame();
		f.setTitle("KeyListener");
		f.setSize(300,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setLayout(new FlowLayout());
		p.addKeyListener(this);
		
		keyMessage = new JLabel[3];
		keyMessage [0] = new JLabel("getKeyCode()");
		keyMessage [1] = new JLabel("getKeyChar()");
		keyMessage [2] = new JLabel("getKeyText()");
		
		for(int i=0; i<keyMessage.length; i++) {
			p.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		p.setFocusable(true);
		p.requestFocus();
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new MyKeyListener();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		int keyChar = e.getKeyChar();
		
		keyMessage[0].setText(Integer.toString(keyChar));
		keyMessage[1].setText(Character.toString((char) keyChar));
		keyMessage[2].setText(e.getKeyText(keyCode));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
