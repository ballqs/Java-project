package test11;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ex07JFrame extends JFrame{
	public Ex07JFrame() {
		setTitle("7¹ø ¹®Á¦");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		Ex07JPanel p = new Ex07JPanel();
		
		add(p.Ex07JPanel1(),BorderLayout.NORTH);
		add(p.Ex07JPanel2(),BorderLayout.CENTER);
		setVisible(true);
	}
}
