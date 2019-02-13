package test10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JFrame;

public class Test06_JLabel_MouseListener_Random extends JFrame implements MouseListener{
	private JFrame f;
	private JPanel p;
	private JLabel l;
	public Test06_JLabel_MouseListener_Random() {
		f = new JFrame();
		f.setTitle("클릭 후 랜덤 출현");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		
		l = new JLabel("C");
		l.addMouseListener(this);
		l.setLocation(100, 100);
		
		p.add(l);
		
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Test06_JLabel_MouseListener_Random();

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l) {
			int num1 = (int)(Math.random()*150)+20;
			int num2 = (int)(Math.random()*200)+20;
			l.setLocation(num1, num2);
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}

}
