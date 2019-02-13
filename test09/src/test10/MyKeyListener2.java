package test10;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyKeyListener2 extends JFrame implements KeyListener{
	private JFrame f;
	private JPanel p;
	private JLabel l;
	public MyKeyListener2(){
		f = new JFrame();
		f.setTitle("���ȭ�� �ٲٱ�");
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.addKeyListener(this);
		p.setOpaque(true);
		p.setFocusable(true);
		p.requestFocus();
		l = new JLabel("�ƹ��͵� Ŭ���� �ȵǾ����ϴ�.");
		l.setOpaque(true);
		p.add(l);
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new MyKeyListener2();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_F1) {//�Էµ� ���� Ű �� �˾Ƴ���
			p.setBackground(Color.YELLOW);
			l.setText("F1�� Ŭ���Ǿ� ���ȭ������� YELLOW�� �ٲߴϴ�.");
			l.setForeground(Color.BLACK);
			l.setBackground(Color.YELLOW);
		}else if(e.getKeyChar() == '%') {//������ Ű�� �ش��ϴ� ���� �ڵ� ����(�����ڵ�) ������ Ű�� ����Ű�� ���� ����!!
			p.setBackground(Color.BLACK);
			l.setText("%�� Ŭ���Ǿ� ���ȭ������� BLACK�� �ٲߴϴ�.");
			l.setForeground(Color.WHITE);
			l.setBackground(Color.BLACK);
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
