package ����������Ʈ;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Project_JPanel extends JPanel{
	private JPanel p1,p2,p1_0,p1_1,p1_2,p1_3,p1_4,p1_5,pNull[];
	private JLabel l0,l00,l000,l1,l2,l3,l4,l5,lNull;
	private JTextField tf1,tf2,tf3;
	private JRadioButton rb1,rb2;
	private ButtonGroup bg;
	private JCheckBox cb1,cb2,cb3;
	private JButton CheckButton;
	public Component Project_JPanel1() {
		p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		
		pNull = new JPanel[10];
		lNull = new JLabel(" ");
		for(int i=0; i<pNull.length; i++) {
			pNull[i] = new JPanel();
			pNull[i].add(lNull);
		}
		
		
		
		//p1_0�� �� ������Ʈ------------------
		p1_0 = new JPanel();
		p1_0.setLayout(new GridLayout(0,1));
		l0 = new JLabel("Body Max Index");
		l0.setHorizontalTextPosition(JLabel.LEFT);
		p1_0.add(l0);
		//-----------------------------------
		
		
		//p1_1�� �� ������Ʈ------------------
		p1_1 = new JPanel();
		p1_1.setLayout(new GridLayout(3,2));
		l1 = new JLabel("��   ��:");
		l2 = new JLabel("  Ű  :");
		l3 = new JLabel("ü  ��:");
		l4 = new JLabel("(cm)");
		l5 = new JLabel("(kg)");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		
		p1_1.add(l1);p1_1.add(tf1);p1_1.add(l4);
		p1_1.add(l2);p1_1.add(tf2);p1_1.add(l5);
		p1_1.add(l3);p1_1.add(tf3);
		//-----------------------------------
		
		//p1_2�� �� ������Ʈ------------------
		p1_2 = new JPanel();
		p1_2.setLayout(new GridLayout(0,1));
		l00 = new JLabel("��   ��");
		l00.setHorizontalTextPosition(JLabel.LEFT);
		p1_2.add(l00);
		//-----------------------------------
		
		
		//p1_3�� �� ������Ʈ------------------
		p1_3 = new JPanel();
		p1_3.setLayout(new FlowLayout());
		rb1 = new JRadioButton("����");
		rb2 = new JRadioButton("����");
		bg = new ButtonGroup();
		bg.add(rb1);bg.add(rb2);
		
		p1_3.add(rb1);p1_3.add(rb2);
		//-----------------------------------
		
		
		//p1_4�� �� ������Ʈ------------------
		p1_4 = new JPanel();
		p1_4.setLayout(new GridLayout(0,1));
		l000 = new JLabel("��   ��");
		l000.setHorizontalTextPosition(JLabel.LEFT);
		p1_4.add(l000);
		//-----------------------------------
		
		
		//p1_5�� �� ������Ʈ-------------------
		p1_5 = new JPanel();
		p1_5.setLayout(new FlowLayout());
		cb1 = new JCheckBox("����");
		cb2 = new JCheckBox("��");
		cb3 = new JCheckBox("�");
		
		p1_5.add(cb1);p1_5.add(cb2);p1_5.add(cb3);
		//-----------------------------------

		p1.add(pNull[0]);
		
		p1.add(p1_0);
		
		p1.add(pNull[1]);
		p1.add(pNull[2]);
		
		p1.add(p1_1);
		
		p1.add(pNull[3]);
		p1.add(pNull[4]);
		
		p1.add(p1_2);
		
		p1.add(pNull[5]);
		
		
		p1.add(p1_3);

		p1.add(pNull[6]);
		p1.add(pNull[7]);
		
		p1.add(p1_4);
		
		p1.add(pNull[8]);
		
		p1.add(p1_5);
		return p1;
	}
	public Component Project_JPanel2() {
		p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		CheckButton = new JButton("��ü ���� ����");
		CheckButton.setPreferredSize(new Dimension(150, 20));
		p2.add(CheckButton,BorderLayout.NORTH);
		return p2;
	}
}
