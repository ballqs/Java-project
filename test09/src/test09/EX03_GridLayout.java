package test09;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EX03_GridLayout extends JFrame{
	EX03_GridLayout(){
		setTitle("GridLayout");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,10));
		for(int i=0; i<10; i++) {
			p.add(new JButton(Integer.toString(i)));
		}
		add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EX03_GridLayout();
	}

}
