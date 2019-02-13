package test10;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test04_JLabel_KeyListener_Location extends JFrame implements KeyListener{
	private JFrame f;
	private JPanel p;
	private JLabel l;
	private String str;
	public Test04_JLabel_KeyListener_Location() {
		f = new JFrame();
		f.setTitle("방향키로 문자열 이동");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,300);
		
		p = new JPanel();
		
		l = new JLabel("Love Java");
		l.addKeyListener(this);
		
		p.add(l);
		f.add(p);
		f.setVisible(true);
		
		l.setFocusable(true);
		l.requestFocus();
	}
	public static void main(String[] args) {
		new Test04_JLabel_KeyListener_Location();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			str = l.getText().substring(1, 9)+l.getText().substring(0, 1);
			l.setText(str);
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			str = l.getText().substring(8, 9)+l.getText().substring(0, 8);
			l.setText(str);
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
