package test11;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex09JPanel extends JPanel implements ActionListener{
	private JPanel p1,p2;
	private String btnList[] = {"가위","바위","보"};
	private JButton bt[];
	private JLabel l1,l2,l3,l4,l5;
	private int random;
	public Component Ex09JPanel1() {
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.setOpaque(true);
		p1.setBackground(Color.gray);
		bt = new JButton[3];
		for(int i=0; i<bt.length; i++) {
			bt[i] = new JButton(btnList[i]);
			bt[i].addActionListener(this);
			p1.add(bt[i]);
		}
		return p1;
	}
	public Component Ex09JPanel2() {
		p2 = new JPanel();
		p2.setOpaque(true);
		p2.setBackground(Color.yellow);
		l1 = new JLabel();
		l2 = new JLabel("me");
		l3 = new JLabel();
		l4 = new JLabel("com");
		l5 = new JLabel();
		p2.add(l1);p2.add(l2);p2.add(l3);p2.add(l4);p2.add(l5);
		return p2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		random = (int)(Math.random()*3);
		if(e.getSource()==bt[0]) {
			if(random == 0) {
				l1.setText(bt[0].getText());
				l3.setText(bt[random].getText());
				l5.setText("Same !!!");
			}else if(random == 1) {
				l1.setText(bt[0].getText());
				l3.setText(bt[random].getText());
				l5.setText("Computer !!!");
			}else if(random == 2) {
				l1.setText(bt[0].getText());
				l3.setText(bt[random].getText());
				l5.setText("me !!!");
			}
		}
		if(e.getSource()==bt[1]) {
			if(random == 0) {
				l1.setText(bt[1].getText());
				l3.setText(bt[random].getText());
				l5.setText("me !!!");
			}else if(random == 1) {
				l1.setText(bt[1].getText());
				l3.setText(bt[random].getText());
				l5.setText("Same !!!");
			}else if(random == 2) {
				l1.setText(bt[1].getText());
				l3.setText(bt[random].getText());
				l5.setText("Computer !!!");
			}
		}
		if(e.getSource()==bt[2]) {
			if(random == 0) {
				l1.setText(bt[2].getText());
				l3.setText(bt[random].getText());
				l5.setText("Computer !!!");
			}else if(random == 1) {
				l1.setText(bt[2].getText());
				l3.setText(bt[random].getText());
				l5.setText("me !!!");
			}else if(random == 2) {
				l1.setText(bt[2].getText());
				l3.setText(bt[random].getText());
				l5.setText("Same !!!");
			}
		}
	}
}
