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
		setTitle("���콺 ������ ����");
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
		//����ڰ� ������Ʈ�� Ŭ���� ��� ȣ��
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//���콺 Ŀ���� ������Ʈ�� ���� ȣ��
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//���콺 Ŀ���� ������Ʈ���� ������ ȣ��
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//���콺�� ������Ʈ������ �������� ȣ��
		int x = e.getX();
		int y = e.getY();
		l.setLocation(x,y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//���콺�� ������Ʈ������ �������� ȣ��
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//���콺 �巡���ϸ� ȣ��
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//���콺�� Ŭ������ �ʰ� �̵��ϴ� ��쿡 ȣ��
		int x = e.getX();
		int y = e.getY();
		l.setLocation(x,y);
		
	}

}
