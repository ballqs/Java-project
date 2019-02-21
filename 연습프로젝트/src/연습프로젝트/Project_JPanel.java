package 연습프로젝트;

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
		//상하좌우 10씩 띄우기

		pNull = new JPanel[11];
		lNull = new JLabel(" ");
		for(int i=0; i<pNull.length; i++) {
			pNull[i] = new JPanel();
			pNull[i].add(lNull);
		}
		
		
		
		//p1_1에 들어갈 컴포넌트------------------
		p1_1 = new JPanel();
		p1_1.setLayout(new GridLayout(3,2));
		l1 = new JLabel("이   름:");
		l2 = new JLabel("  키  :");
		l3 = new JLabel("체  중:");
		l4 = new JLabel("(cm)");
		l5 = new JLabel("(kg)");
		tf1 = new JTextField(7);
		tf2 = new JTextField(7);
		tf3 = new JTextField(7);
		
		p1_1.add(l1);p1_1.add(tf1);p1_1.add(lNull);
		p1_1.add(l2);p1_1.add(tf2);p1_1.add(l4);
		p1_1.add(l3);p1_1.add(tf3);p1_1.add(l5);
		//-----------------------------------
		
		//p1_2에 들어갈 컴포넌트------------------
		p1_2 = new JPanel();
		p1_2.setLayout(new FlowLayout());
		p1_2.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1),"성   별"));
		rb1 = new JRadioButton("남자");
		rb2 = new JRadioButton("여자");
		bg = new ButtonGroup();
		bg.add(rb1);bg.add(rb2);
		
		p1_2.add(rb1);p1_2.add(rb2);
		//-----------------------------------
		
		//p1_3에 들어갈 컴포넌트-------------------
		p1_3 = new JPanel();
		p1_3.setLayout(new FlowLayout());
		p1_3.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1),"습   관"));
		cb1 = new JCheckBox("음주");
		cb2 = new JCheckBox("흡연");
		cb3 = new JCheckBox("운동");
		
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
		
		//p2_1에 들어갈 컴포넌트--------------------------------------
		p2_1 = new JPanel();
		p2_1.setLayout(new FlowLayout(FlowLayout.TRAILING));
		p2_1.setPreferredSize(new Dimension(200, 20));
		CheckButton = new JButton("신체 상태 측정");
		//독립된 이벤트 리스너에 적용할 시 자기 자신을 넘겨줄 필요가 있다!
		CheckButton.addActionListener(new Project_Event(Project_JPanel.this));
//		CheckButton.addActionListener(new Project_Event(ll3,cb1,CheckButton));
		CheckButton.setPreferredSize(new Dimension(120, 20));
		p2_1.add(CheckButton);
		//------------------------------------------------------
		
		
		
		//p2_2에 들어갈 컴포넌트--------------------------------------
		p2_2 = new JPanel();
		p2_2.setLayout(new BoxLayout(p2_2, BoxLayout.Y_AXIS));
		p2_2_0 = new JPanel();
		p2_2_0.setLayout(new FlowLayout(FlowLayout.LEFT));
		p2_2_0.setPreferredSize(new Dimension(200, 10));
		ll1 = new JLabel("BMI 결과");
		p2_2_0.add(ll1);
		p2_2_1 = new JPanel();
		ll2 = new JLabel("진단 결과 나오는 곳");
		
		
		
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
		
		
		
		//p2_3에 들어갈 컴포넌트--------------------------------------
		p2_3 = new JPanel();
		p2_3.setPreferredSize(new Dimension(100, 70));
		p2_3.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1),"소  견"));
		ll3 = new JLabel("술 그만마시라..");
		ll4 = new JLabel("담배 몸에 안좋다..");
		ll5 = new JLabel("운동 부족인데..");
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
