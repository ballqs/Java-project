package test10;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyMoustClickEvent extends JFrame {
	JFrame f;
	JPanel p;
	public MyMoustClickEvent() {
		f = new JFrame();
		f.setTitle("랜덤 배경 색상");
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.addMouseListener(new Event());
		p.setOpaque(true);
		
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new MyMoustClickEvent();
	}


}
class Event implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount()==1) {
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			JPanel p = (JPanel) e.getSource();
			p.setBackground(new Color(r,g,b));
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}