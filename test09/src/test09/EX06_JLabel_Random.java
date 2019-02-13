package test09;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EX06_JLabel_Random extends JFrame{
	EX06_JLabel_Random(){
		setTitle("Random Labels");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(null);
		for(int i=0; i<20; i++) {
			int a,b,c;
			a = (int)(Math.random()*256);
			b = (int)(Math.random()*256);
			c = (int)(Math.random()*256);
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			JLabel l = new JLabel(Integer.toString(i));
			l.setBackground(new Color(a,b,c));
			l.setLocation(x, y);
			l.setSize(10,10);
			l.setOpaque(true);
			p.add(l);
		}
		add(p);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new EX06_JLabel_Random();
	}

}
