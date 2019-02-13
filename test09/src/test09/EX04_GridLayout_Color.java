package test09;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EX04_GridLayout_Color extends JFrame{
	EX04_GridLayout_Color(){
		setTitle("GridLayout");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,10));
		for(int i=0; i<10; i++) {
			int a,b,c;
			a = (int)(Math.random()*255+1);
			b = (int)(Math.random()*255+1);
			c = (int)(Math.random()*255+1);
			JButton btn = new JButton(Integer.toString(i));
			btn.setBackground(new Color(a, b, c));
			p.add(btn);
		}
		add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EX04_GridLayout_Color();
	}

}
