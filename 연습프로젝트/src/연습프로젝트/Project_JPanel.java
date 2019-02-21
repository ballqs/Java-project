package ����������Ʈ;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Project_JPanel extends JPanel{
	JPanel p1,p1_0,p1_1,p1_2,p1_3,pNull[]
			,p2,p2_1,p2_2,p2_2_0,p2_2_1,p2_2_2,p2_2_3,p2_3;
	JLabel l1,l2,l3,l4,l5,lNull
			,ll1,ll2,ll3,ll4,ll5;
	JTextField tf1,tf2,tf3;
	JRadioButton rb1,rb2;
	ButtonGroup bg;
	JCheckBox cb1,cb2,cb3;
	JButton CheckButton;
	
//	public JButton getCheckButton() {
//		return CheckButton;
//	}
//	
//	public JLabel getLl3() {
//		return ll3;
//	}
//
//	public JCheckBox getCb1() {
//		return cb1;
//	}

	public Component Project_JPanel1() {
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1),"Body Max Index"));
		
		p1_0 = new JPanel();
		p1_0.setLayout(new BoxLayout(p1_0, BoxLayout.Y_AXIS));
		p1_0.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10)); 
		//�����¿� 10�� ����

		pNull = new JPanel[11];
		lNull = new JLabel(" ");
		for(int i=0; i<pNull.length; i++) {
			pNull[i] = new JPanel();
			pNull[i].add(lNull);
		}
		
		
		
		//p1_1�� �� ������Ʈ------------------
		p1_1 = new JPanel();
		p1_1.setLayout(new GridLayout(3,2));
		l1 = new JLabel("��   ��:");
		l2 = new JLabel("  Ű  :");
		l3 = new JLabel("ü  ��:");
		l4 = new JLabel("(cm)");
		l5 = new JLabel("(kg)");
		tf1 = new JTextField(7);
		tf2 = new JTextField(7);
		tf3 = new JTextField(7);
		
		p1_1.add(l1);p1_1.add(tf1);p1_1.add(lNull);
		p1_1.add(l2);p1_1.add(tf2);p1_1.add(l4);
		p1_1.add(l3);p1_1.add(tf3);p1_1.add(l5);
		//-----------------------------------
		
		//p1_2�� �� ������Ʈ------------------
		p1_2 = new JPanel();
		p1_2.setLayout(new FlowLayout());
		p1_2.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1),"��   ��"));
		rb1 = new JRadioButton("����");
		rb2 = new JRadioButton("����");
		bg = new ButtonGroup();
		bg.add(rb1);bg.add(rb2);
		
		p1_2.add(rb1);p1_2.add(rb2);
		//-----------------------------------
		
		//p1_3�� �� ������Ʈ-------------------
		p1_3 = new JPanel();
		p1_3.setLayout(new FlowLayout());
		p1_3.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1),"��   ��"));
		cb1 = new JCheckBox("����");
		cb2 = new JCheckBox("��");
		cb3 = new JCheckBox("�");
		
		p1_3.add(cb1);p1_3.add(cb2);p1_3.add(cb3);
		//-----------------------------------

		p1_0.add(pNull[0]);
		p1_0.add(pNull[1]);
		p1_0.add(pNull[2]);
		
		p1_0.add(p1_1);
		
		p1_0.add(pNull[3]);
		p1_0.add(pNull[4]);
		p1_0.add(pNull[5]);
		
		
		p1_0.add(p1_2);

		p1_0.add(pNull[6]);
		p1_0.add(pNull[7]);
		p1_0.add(pNull[8]);
		
		p1_0.add(p1_3);
		p1_0.add(pNull[9]);
		p1_0.add(pNull[10]);
		
		p1.add(p1_0);
		return p1;
	}
	public Component Project_JPanel2() {
		p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
//		p2.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1)));
		p2.setPreferredSize(new Dimension(200, 350));
		
		//p2_1�� �� ������Ʈ--------------------------------------
		p2_1 = new JPanel();
		p2_1.setLayout(new FlowLayout(FlowLayout.TRAILING));
		p2_1.setPreferredSize(new Dimension(200, 20));
		CheckButton = new JButton("��ü ���� ����");
		//������ �̺�Ʈ �����ʿ� ������ �� �ڱ� �ڽ��� �Ѱ��� �ʿ䰡 �ִ�!
		CheckButton.addActionListener(new Project_Event(Project_JPanel.this));
//		CheckButton.addActionListener(new Project_Event(ll3,cb1,CheckButton));
		CheckButton.setPreferredSize(new Dimension(120, 20));
		p2_1.add(CheckButton);
		//------------------------------------------------------
		
		
		
		//p2_2�� �� ������Ʈ--------------------------------------
		p2_2 = new JPanel();
		p2_2.setLayout(new BoxLayout(p2_2, BoxLayout.Y_AXIS));
		p2_2_0 = new JPanel();
		p2_2_0.setLayout(new FlowLayout(FlowLayout.LEFT));
		p2_2_0.setPreferredSize(new Dimension(200, 10));
		ll1 = new JLabel("BMI ���");
		p2_2_0.add(ll1);
		p2_2_1 = new JPanel();
		ll2 = new JLabel("���� ��� ������ ��");
		
		
		
		p2_2_1.add(ll2);
		p2_2_1.setBorder(new LineBorder(Color.lightGray,1));
		p2_2_1.setPreferredSize(new Dimension(200, 110));
		
		
		p2_2_2 = new JPanel();
		p2_2_2.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10)); 
		
		
		p2_2_3 = new JPanel();
		p2_2_3.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1)));
		p2_2_3.setPreferredSize(new Dimension(100, 40));
		
		
		
		p2_2_1.add(p2_2_2);
		p2_2_2.add(p2_2_3);
		p2_2.add(p2_2_0);
		p2_2.add(p2_2_1);
		//------------------------------------------------------
		
		
		
		//p2_3�� �� ������Ʈ--------------------------------------
		p2_3 = new JPanel();
		p2_3.setPreferredSize(new Dimension(100, 70));
		p2_3.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1),"��  ��"));
		ll3 = new JLabel("�� �׸����ö�..");
		ll4 = new JLabel("��� ���� ������..");
		ll5 = new JLabel("� �����ε�..");
		ll3.setVisible(false);
		ll4.setVisible(false);
		ll5.setVisible(false);
		p2_3.add(ll3);
		p2_3.add(ll4);
		p2_3.add(ll5);
		//------------------------------------------------------
		
		p2.add(p2_1);
		p2.add(p2_2);
		p2.add(p2_3);
		return p2;
	}
}
