package test09;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EX05_GridLayout_Color2 extends JFrame{
	EX05_GridLayout_Color2(){
		setTitle("GridLayout");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4,4));
		for(int i=0; i<16; i++) {
			int a,b,c;
			a = (int)(Math.random()*256);
			b = (int)(Math.random()*256);
			c = (int)(Math.random()*256);
			JLabel l = new JLabel(Integer.toString(i));
			l.setBackground(new Color(a,b,c));
			l.setSize(100,100);
			l.setOpaque(true);
			p.add(l);
		}
		add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EX05_GridLayout_Color2();
	}

}
