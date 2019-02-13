package test09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class EX08_GUI_Challenge_Frame extends JFrame{
	EX08_GUI_Challenge_Frame(){
		setTitle("여러 개의 패널을 가진 프레임");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		JButton btn1 = new JButton("열기");
		JButton btn2 = new JButton("닫기");
		JButton btn3 = new JButton("나가기");
		
		p1.setBackground(Color.gray);
		p1.setLayout(new FlowLayout());
		p1.add(btn1);p1.add(btn2);p1.add(btn3);
		
		JLabel[] l = new JLabel[10];
		p2.setLayout(null);
		p2.setBackground(Color.WHITE);
		for(int i=0; i<10; i++) {
			l[i] = new JLabel("*");
			l[i].setSize(10, 10);
			l[i].setForeground(Color.RED);
			int x = (int)(Math.random()*300)+20;
			int y = (int)(Math.random()*150)+20;
			l[i].setLocation(x,y);
			p2.add(l[i]);
		}
		
		JButton input = new JButton("word Input");
		JTextField tf1 = new JTextField(20);
		
		p3.setBackground(Color.yellow);
		p3.setLayout(new FlowLayout());
		p3.add(input);p3.add(tf1);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		setVisible(true);
	}
}

public class EX08_GUI_Challenge {

	public static void main(String[] args) {
		new EX08_GUI_Challenge_Frame();
	}

}
