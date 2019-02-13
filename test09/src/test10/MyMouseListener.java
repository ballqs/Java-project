package test10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyMouseListener extends JFrame implements MouseListener,MouseMotionListener{
	JPanel p;
	JLabel l;
	MyMouseListener(){
		setTitle("마우스 리스너 예제");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		p.setLayout(null);
		l = new JLabel("Hello");
		l.setSize(50, 50);
		l.setLocation(30, 30);
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
		
		p.add(l);
		
		add(p);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyMouseListener();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//사용자가 컴포넌트를 클릭한 경우 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스 커서가 컴포넌트로 들어가면 호출
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스 커서가 컴포넌트에서 나가면 호출
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//마우스가 컴포넌트위에서 눌려지면 호출
		int x = e.getX();
		int y = e.getY();
		l.setLocation(x,y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//마우스가 컴포넌트위에서 떼어지면 호출
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//마우스 드래그하면 호출
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스가 클릭되지 않고 이동하는 경우에 호출
		int x = e.getX();
		int y = e.getY();
		l.setLocation(x,y);
		
	}

}
