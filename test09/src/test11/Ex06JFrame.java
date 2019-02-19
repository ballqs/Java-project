package test11;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ex06JFrame extends JFrame{
	public Ex06JFrame(){
		setTitle("6¹ø ¹®Á¦");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Ex06JPanel p = new Ex06JPanel();
		add(p.Ex06JPanel1(),BorderLayout.NORTH);
		add(p.Ex06JPanel2(),BorderLayout.CENTER);
		setVisible(true);
	}
}
