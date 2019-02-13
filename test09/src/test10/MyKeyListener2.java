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
		f.setTitle("배경화면 바꾸기");
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.addKeyListener(this);
		p.setOpaque(true);
		p.setFocusable(true);
		p.requestFocus();
		l = new JLabel("아무것도 클릭이 안되었습니다.");
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
		if(e.getKeyCode() == KeyEvent.VK_F1) {//입력된 가상 키 값 알아내기
			p.setBackground(Color.YELLOW);
			l.setText("F1이 클릭되어 배경화면색깔을 YELLOW로 바꿉니다.");
			l.setForeground(Color.BLACK);
			l.setBackground(Color.YELLOW);
		}else if(e.getKeyChar() == '%') {//눌러진 키에 해당하는 문자 코드 리턴(유니코드) 눌러진 키가 문자키일 때만 반응!!
			p.setBackground(Color.BLACK);
			l.setText("%이 클릭되어 배경화면색깔을 BLACK로 바꿉니다.");
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
