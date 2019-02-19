package test11;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ex09JPFrame extends JFrame{
	public Ex09JPFrame() {
		setTitle("9¹ø ¹®Á¦");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Ex09JPanel p = new Ex09JPanel();
		add(p.Ex09JPanel1(),BorderLayout.NORTH);
		add(p.Ex09JPanel2(),BorderLayout.CENTER);
		setVisible(true);
	}

}
