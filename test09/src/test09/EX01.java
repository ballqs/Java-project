package test09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX01{
	public static void main(String[] args) {
		new EX01_program();
	}

}

class EX01_program extends JFrame{
	JFrame jf = new JFrame();
	JLabel l1;
	JButton btn1;
	Container c;
	EX01_program(){
		jf.setTitle("���α׷�");
		jf.setSize(300,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new BorderLayout());
		l1 = new JLabel("�ȳ��ϼ���");
		btn1 = new JButton("��ư�Դϴ�.");
		c.add(l1,BorderLayout.NORTH);c.add(btn1,BorderLayout.SOUTH);
		jf.add(c);
		jf.setVisible(true);
	}
}