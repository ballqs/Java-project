package test09;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EX02_BorderLayout extends JFrame{
	
	EX02_BorderLayout(){
		setTitle("BorderLayout");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout(5,7));
		p.add(new JButton("NORTH"),BorderLayout.NORTH);
		p.add(new JButton("WEST"),BorderLayout.WEST);
		p.add(new JButton("EAST"),BorderLayout.EAST);
		p.add(new JButton("SOUTH"),BorderLayout.SOUTH);
		p.add(new JButton("CENTER"),BorderLayout.CENTER);
		add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EX02_BorderLayout();
	}

}
