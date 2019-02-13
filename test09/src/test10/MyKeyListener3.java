package test10;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyKeyListener3 extends JFrame implements KeyListener{
	private JFrame f;
	private JPanel p;
	private JLabel l;
	private int x=50,y=50;
	private final int a=20;
	public MyKeyListener3() {
		f = new JFrame();
		f.setTitle("키보드 입력에 의해 라벨 움직이기");
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		p.setLayout(null);
		p.addKeyListener(this);
		l = new JLabel("Hello");
		l.setSize(50,10);
		l.setLocation(x, y);
		p.add(l);
		f.add(p);
		p.setFocusable(true);
		p.requestFocus();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new MyKeyListener3();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			if(y>4) {
				y = y - a;
				l.setLocation(x, y);
			}else {
				y = 10;
				l.setLocation(x, y);
			}
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			if(y<411) {
				y = y + a;
				l.setLocation(x, y);
			}else {
				y = 405;
				l.setLocation(x, y);
			}
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			if(x<411) {
				x = x + a;
				l.setLocation(x, y);
			}else {
				x = 405;
				l.setLocation(x, y);
			}
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			if(x>4) {
				x = x - a;
				l.setLocation(x, y);
			}else {
				x = 10;
				l.setLocation(x, y);
			}
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
