package test10;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test02_JPanel_BackgroundColor extends JFrame implements MouseListener,MouseMotionListener{
	private JFrame f;
	private JPanel p;
	public Test02_JPanel_BackgroundColor() {
		f = new JFrame();
		f.setTitle("드래그동안 색상 변경");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.addMouseMotionListener(this);
		p.addMouseListener(this);
		p.setOpaque(true);
		
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Test02_JPanel_BackgroundColor();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==p) {
			p.setBackground(Color.YELLOW);
		}
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		if(e.getSource()==p) {
			p.setBackground(Color.GREEN);
		}
		
	}

}
