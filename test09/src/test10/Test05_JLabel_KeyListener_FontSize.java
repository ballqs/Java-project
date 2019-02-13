package test10;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test05_JLabel_KeyListener_FontSize extends JFrame implements KeyListener{
	private JFrame f;
	private JPanel p;
	private JLabel l;
	private int size = 10;
	public Test05_JLabel_KeyListener_FontSize() {
		f = new JFrame();
		f.setTitle("폰트 크기 조절");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 300);
		
		p = new JPanel();
		
		l = new JLabel("Love Java");
		l.addKeyListener(this);
		l.setFont(new Font("Arial",Font.PLAIN,size));
		
		p.add(l);
		f.add(p);
		f.setVisible(true);
		l.setFocusable(true);
		l.requestFocus();
	}
	public static void main(String[] args) {
		new Test05_JLabel_KeyListener_FontSize();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()=='+') {
			size = size + 5;
			l.setFont(new Font("Arial",Font.PLAIN,size));
		}
		if(e.getKeyChar()=='-') {
			size = size - 5;
			l.setFont(new Font("Arial",Font.PLAIN,size));
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
