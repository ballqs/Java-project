package test09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class NorthPanel extends JPanel{
	NorthPanel(){
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("Open");
		JButton btn2 = new JButton("Read");
		JButton btn3 = new JButton("Close");
		add(btn1);add(btn2);add(btn3);
		setBackground(Color.gray);
	}
}
class CenterPanel extends JPanel{
	CenterPanel(){
		setLayout(null);
		JLabel l1 = new JLabel("Java");
		JLabel l2 = new JLabel("Hello");
		JLabel l3 = new JLabel("Love");
		l1.setLocation(50,50);
		l1.setSize(40,40);
		l2.setLocation(300,50);
		l2.setSize(40,40);
		l3.setLocation(100,300);
		l3.setSize(40,40);
		add(l1);
		add(l2);
		add(l3);
		
	}
}

class EX00_OpenChallenge_2 extends JFrame{
	EX00_OpenChallenge_2(){
		setTitle("Open Challenge 9");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		NorthPanel np = new NorthPanel();
		CenterPanel cp = new CenterPanel();
		add(np,BorderLayout.NORTH);
		add(cp,BorderLayout.CENTER);
		setVisible(true);
	}
}

public class EX00_OpenChallenge{
	public static void main(String[] args) {
		new EX00_OpenChallenge_2();
	}

}
