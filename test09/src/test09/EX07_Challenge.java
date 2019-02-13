package test09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX07_Challenge extends JFrame implements ActionListener{
	JFrame jf;
	JPanel p1,p2,p3;
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnce,btncal,btnplus,btnminu,btnmul,btndiv;
	JTextField tf1,tf2;
	JLabel l1,l2;
	EX07_Challenge(){
		jf = new JFrame();
		jf.setTitle("계산기 프레임");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new BorderLayout());
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		l1 = new JLabel("수식입력");
		tf1 = new JTextField(20);
		
		p1.setBackground(Color.gray);
		p1.setLayout(new FlowLayout());
		p1.add(l1);p1.add(tf1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(this);
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		btn5 = new JButton("5");
		btn5.addActionListener(this);
		btn6 = new JButton("6");
		btn6.addActionListener(this);
		btn7 = new JButton("7");
		btn7.addActionListener(this);
		btn8 = new JButton("8");
		btn8.addActionListener(this);
		btn9 = new JButton("9");
		btn9.addActionListener(this);
		btnce = new JButton("CE");
		btnce.addActionListener(this);
		btncal = new JButton("계산");
		btnplus = new JButton("+");
		btnminu = new JButton("-");
		btnmul = new JButton("*");
		btndiv = new JButton("/");
		
		p2.setLayout(new GridLayout(4,4,5,5));
		p2.add(btn0);p2.add(btn1);p2.add(btn2);p2.add(btn3);
		p2.add(btn4);p2.add(btn5);p2.add(btn6);p2.add(btn7);
		p2.add(btn8);p2.add(btn9);p2.add(btnce);p2.add(btncal);
		p2.add(btnplus);p2.add(btnminu);p2.add(btnmul);p2.add(btndiv);
		
		l2 = new JLabel("계산 결과");
		tf2 = new JTextField(20);
		
		p3.setBackground(Color.green);
		p3.setLayout(new FlowLayout());
		p3.add(l2);p3.add(tf2);
		
		jf.add(p1,BorderLayout.NORTH);
		jf.add(p2,BorderLayout.CENTER);
		jf.add(p3,BorderLayout.SOUTH);
		jf.setSize(400,300);
		jf.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn0) {
			tf1.setText(tf1.getText()+btn0.getText());
		}
		if(e.getSource()==btn1) {
			tf1.setText(tf1.getText()+btn1.getText());
		}
		if(e.getSource()==btn2) {
			tf1.setText(tf1.getText()+btn2.getText());
		}
		if(e.getSource()==btn3) {
			tf1.setText(tf1.getText()+btn3.getText());
		}
		if(e.getSource()==btn4) {
			tf1.setText(tf1.getText()+btn4.getText());
		}
		if(e.getSource()==btn5) {
			tf1.setText(tf1.getText()+btn5.getText());
		}
		if(e.getSource()==btn6) {
			tf1.setText(tf1.getText()+btn6.getText());
		}
		if(e.getSource()==btn7) {
			tf1.setText(tf1.getText()+btn7.getText());
		}
		if(e.getSource()==btn8) {
			tf1.setText(tf1.getText()+btn8.getText());
		}
		if(e.getSource()==btn9) {
			tf1.setText(tf1.getText()+btn9.getText());
		}
		if(e.getSource()==btnce) {
			tf1.setText("");
		}
	}
	public static void main(String[] args) {
		new EX07_Challenge();
	}

}
