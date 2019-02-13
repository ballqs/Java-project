package test10;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Chapter10_OpenChallenge extends JFrame implements KeyListener{
	JFrame f;
	JPanel p;
	JLabel num1,num2,num3,setting;
	public Chapter10_OpenChallenge() {
		f = new JFrame();
		f.setTitle("Open Challenge 10");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 400);
		
		p = new JPanel();
		p.setLayout(null);
		p.addKeyListener(this);
		
		num1 = new JLabel("0");
		num2 = new JLabel("0");
		num3 = new JLabel("0");
		setting = new JLabel("시작합니다.");
		num1.setSize(50, 30);
		num2.setSize(50, 30);
		num3.setSize(50, 30);
		setting.setSize(200, 15);
		
		num1.setLocation(90, 120);
		num2.setLocation(190, 120);
		num3.setLocation(290, 120);
		setting.setLocation(190, 300);
		
		num1.setFont(new Font("Arial",Font.PLAIN,29));
		num2.setFont(new Font("Arial",Font.PLAIN,29));
		num3.setFont(new Font("Arial",Font.PLAIN,29));
		
		p.add(num1);p.add(num2);p.add(num3);p.add(setting);
		f.add(p);
		f.setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
		
	}
	public static void main(String[] args) {
		new Chapter10_OpenChallenge();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			int a = (int)(Math.random()*5);
			int b = (int)(Math.random()*5);
			int c = (int)(Math.random()*5);
			num1.setText(Integer.toString(a));
			num2.setText(Integer.toString(b));
			num3.setText(Integer.toString(c));
			if(num1.getText().equals(num2.getText()) && num1.getText().equals(num3.getText())) {
				setting.setText("축하합니다!!");
			}else {
				setting.setText("아쉽군요");
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
