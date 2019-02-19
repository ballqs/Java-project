package test11;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ex08JFrame extends JFrame{
	public Ex08JFrame() {
		setTitle("8¹ø ¹®Á¦!");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Ex08JPanel p = new Ex08JPanel();
		add(p.Ex08JPanel1(),BorderLayout.NORTH);
		add(p.Ex08JPanel2(),BorderLayout.CENTER);
		setVisible(true);
	}
}
