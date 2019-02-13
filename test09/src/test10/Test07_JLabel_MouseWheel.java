package test10;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test07_JLabel_MouseWheel extends JFrame implements MouseWheelListener,MouseMotionListener{
	private JFrame f;
	private JPanel p;
	private JLabel l;
	private int size = 15;
	public Test07_JLabel_MouseWheel() {
		f = new JFrame();
		f.setTitle("마우스 휠 이벤트");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
		
		p = new JPanel();
		
		l = new JLabel("Love Java");
		l.addMouseWheelListener(this);
		l.addMouseMotionListener(this);
		l.setFont(new Font("Arial",Font.PLAIN,size));
		
		p.add(l);
		
		f.add(p);
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Test07_JLabel_MouseWheel();
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		int n = e.getWheelRotation();
		if(n<0) {
			size = size+5;
			l.setFont(new Font("Arial",Font.PLAIN,size));
		}else {
			size = size-5;
			l.setFont(new Font("Arial",Font.PLAIN,size));
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		l.setLocation(x,y);
	}
	@Override
	public void mouseMoved(MouseEvent e) {}

}
