package test10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test01_JLabel_Mouse_Event extends JFrame implements MouseListener {
	JFrame f;
	JPanel p;
	JLabel l;
	public Test01_JLabel_Mouse_Event() {
		f = new JFrame();
		f.setTitle("마우스 올리기 내리기");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		
		l = new JLabel("사랑해");
		l.addMouseListener(this);
		
		p.add(l);
		
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Test01_JLabel_Mouse_Event();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l) {
			l.setText("Love Java");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l) {
			l.setText("사랑해");
		}
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
