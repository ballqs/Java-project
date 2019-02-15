package test11;

import javax.swing.JFrame;

public class Ex05_JFrame extends JFrame{
	public Ex05_JFrame() {
		setTitle("슬라이더");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Ex05_JPanel());
		setVisible(true);
	}
}
