package test11;

import javax.swing.JFrame;

public class Ex10JFrame extends JFrame{
	public Ex10JFrame() {
		setTitle("10¹ø ¹®Á¦!!!");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ex10JPanel p = new Ex10JPanel();
		add(p.Ex10JPanel());
		setVisible(true);
	}

}
