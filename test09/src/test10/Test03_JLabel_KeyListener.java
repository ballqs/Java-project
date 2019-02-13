package test10;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test03_JLabel_KeyListener extends JFrame implements KeyListener{
	private JFrame f;
	private JPanel p;
	private JLabel l; 
	public Test03_JLabel_KeyListener() {
		f = new JFrame();
		f.setTitle("Left 키로 문자열 교체");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 300);
		
		p = new JPanel();
		p.addKeyListener(this);
		
		l = new JLabel("Love Java");
		
		p.add(l);
		f.add(p);
		f.setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	public static void main(String[] args) {
		new Test03_JLabel_KeyListener();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			StringBuffer text = new StringBuffer(l.getText());
			l.setText(text.reverse().toString());
		}
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
