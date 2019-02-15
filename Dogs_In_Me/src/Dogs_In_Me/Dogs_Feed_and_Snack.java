package Dogs_In_Me;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dogs_Feed_and_Snack extends JFrame implements ActionListener{
	GridBagLayout gbl;
	GridBagConstraints gbc;
	
	JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
	ImageIcon ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9,ii10;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	
	
	public Dogs_Feed_and_Snack() {
		
		ImageIcon ii1 = new ImageIcon("FaS/오리젠_시니어_독.jpg");
		ImageIcon ii2 = new ImageIcon("FaS/오리젠_식스_피쉬 독.jpg");
		ImageIcon ii3 = new ImageIcon("FaS/오리젠_오리지날_독.jpg");
		ImageIcon ii4 = new ImageIcon("FaS/오리젠_퍼피.jpg");
		ImageIcon ii5 = new ImageIcon("FaS/오리젠_퍼피_라지.jpg");
		ImageIcon ii6 = new ImageIcon("FaS/네이처스버라이어티 인스팅트 LID 오리고기 독키블.jpg");
		ImageIcon ii7 = new ImageIcon("FaS/네이처스버라이어티 인스팅트 RBK 생식본능 치킨 독키블.jpg");
		ImageIcon ii8 = new ImageIcon("FaS/네이처스버라이어티 인스팅트 생식본능(치킨) 독키블.jpg");
		ImageIcon ii9 = new ImageIcon("FaS/네이쳐스버라이어티 인스팅트 lid칠면조.jpg");
		ImageIcon ii10 = new ImageIcon("FaS/네이쳐스버라이어티 인스팅트 토끼고기 독키블.jpg");
		
		bt1 = new JButton(ii1);
		bt1.addActionListener(this);
		bt2 = new JButton(ii2);
		bt2.addActionListener(this);
		bt3 = new JButton(ii3);
		bt3.addActionListener(this);
		bt4 = new JButton(ii4);
		bt4.addActionListener(this);
		bt5 = new JButton(ii5);
		bt5.addActionListener(this);
		bt6 = new JButton(ii6);
		bt6.addActionListener(this);
		bt7 = new JButton(ii7);
		bt7.addActionListener(this);
		bt8 = new JButton(ii8);
		bt8.addActionListener(this);
		bt9 = new JButton(ii9);
		bt9.addActionListener(this);
		bt10 = new JButton(ii10);
		bt10.addActionListener(this);
		
		l1 = new JLabel("오리젠 시니어 독",JLabel.CENTER);
		l2 = new JLabel("오리젠 식스 피쉬 독",JLabel.CENTER);
		l3 = new JLabel("오리젠 오리지날 독",JLabel.CENTER);
		l4 = new JLabel("오리젠 퍼피",JLabel.CENTER);
		l5 = new JLabel("오리젠 퍼피 라지",JLabel.CENTER);
		l6 = new JLabel("네이처 시리즈 오리고기",JLabel.CENTER);
		l7 = new JLabel("네이처 시리즈 RBK치킨",JLabel.CENTER);
		l8 = new JLabel("네이처 시리즈 치킨",JLabel.CENTER);
		l9 = new JLabel("네이처 시리즈 LID칠면조",JLabel.CENTER);
		l10 = new JLabel("네이처 시리즈 토끼고기",JLabel.CENTER);
		
		bt1.setBorder(null);
		bt2.setBorder(null);
		bt3.setBorder(null);
		bt4.setBorder(null);
		bt5.setBorder(null);
		bt6.setBorder(null);
		bt7.setBorder(null);
		bt8.setBorder(null);
		bt9.setBorder(null);
		bt10.setBorder(null);
		
		gbl = new GridBagLayout();
	    setLayout(gbl);
	    
	    gbc = new GridBagConstraints(); //☆GridBagLayout에 배치할 컴포넌트 위치 정보 등을 담을 객체 준비

	    gbc.fill = GridBagConstraints.BOTH;
	    
	    gbc.weightx = 1.0;
	    gbc.weighty = 1.0;
	    
	    gbAdd(bt1, 0, 0, 1, 1);
	    gbAdd(bt2, 1, 0, 1, 1);
	    gbAdd(bt3, 2, 0, 1, 1);
	    gbAdd(bt4, 3, 0, 1, 1);
	    gbAdd(bt5, 4, 0, 1, 1);
	    gbAdd(l1, 0, 1, 1, 1);
	    gbAdd(l2, 1, 1, 1, 1);
	    gbAdd(l3, 2, 1, 1, 1);
	    gbAdd(l4, 3, 1, 1, 1);
	    gbAdd(l5, 4, 1, 1, 1);
	    gbAdd(bt6, 0, 2, 1, 1);
	    gbAdd(bt7, 1, 2, 1, 1);
	    gbAdd(bt8, 2, 2, 1, 1);
	    gbAdd(bt9, 3, 2, 1, 1);
	    gbAdd(bt10, 4, 2, 1, 1);
	    gbAdd(l6, 0, 3, 1, 1);
	    gbAdd(l7, 1, 3, 1, 1);
	    gbAdd(l8, 2, 3, 1, 1);
	    gbAdd(l9, 3, 3, 1, 1);
	    gbAdd(l10, 4, 3, 1, 1);
	}
	
	 private void gbAdd(Component c, int x, int y, int w, int h) {

	      gbc.gridx = x;
	      gbc.gridy = y; 
	      //가장 왼쪽 위 gridx, gridy값은 0 
	      gbc.gridwidth  = w;	//넓이
	      gbc.gridheight = h;	//높이
	      //gridwidth를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 행의 마지막 셀이되고, 
	      //gridheight를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 열의 마지막 셀이됩니다. 
	      //gridwidth를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 행의 다음 셀부터 마지막 셀까지 차지하고, 
	      //gridheight를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 열의 다음 셀부터 마지막 셀까지 차지하도록 합니다.
	      
	      gbl.setConstraints(c, gbc); //컴포넌트를 컴포넌트 위치+크기 정보에 따라 GridBagLayout에 배치
	 
	      add(c);

	   }

	@Override
	public void actionPerformed(ActionEvent e) {
		Dogs_FaS f = new Dogs_FaS();
		if(e.getSource()==bt1) {
			dispose();
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
		if(e.getSource()==bt2) {
			f.i = 1;
			dispose();
			f.l1.setText(f.l5.getText());
			f.l2.setText(f.l6.getText());
			f.l3.setText(f.l7.getText());
			f.l4.setIcon(f.l8.getIcon());
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
		if(e.getSource()==bt3) {
			f.i = 2;
			dispose();
			f.l1.setText(f.l9.getText());
			f.l2.setText(f.l10.getText());
			f.l3.setText(f.l11.getText());
			f.l4.setIcon(f.l12.getIcon());
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
		if(e.getSource()==bt4) {
			f.i = 3;
			dispose();
			f.l1.setText(f.l13.getText());
			f.l2.setText(f.l14.getText());
			f.l3.setText(f.l15.getText());
			f.l4.setIcon(f.l16.getIcon());
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
		if(e.getSource()==bt5) {
			f.i = 4;
			dispose();
			f.l1.setText(f.l17.getText());
			f.l2.setText(f.l18.getText());
			f.l3.setText(f.l19.getText());
			f.l4.setIcon(f.l20.getIcon());
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
		
		if(e.getSource()==bt6) {
			f.i = 5;
			dispose();
			f.l1.setText(f.l21.getText());
			f.l2.setText(f.l22.getText());
			f.l3.setText(f.l23.getText());
			f.l4.setIcon(f.l24.getIcon());
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
		if(e.getSource()==bt7) {
			f.i = 6;
			dispose();
			f.l1.setText(f.l25.getText());
			f.l2.setText(f.l26.getText());
			f.l3.setText(f.l27.getText());
			f.l4.setIcon(f.l28.getIcon());
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
		if(e.getSource()==bt8) {
			f.i = 7;
			dispose();
			f.l1.setText(f.l29.getText());
			f.l2.setText(f.l30.getText());
			f.l3.setText(f.l31.getText());
			f.l4.setIcon(f.l32.getIcon());
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
		if(e.getSource()==bt9) {
			f.i = 8;
			dispose();
			f.l1.setText(f.l33.getText());
			f.l2.setText(f.l34.getText());
			f.l3.setText(f.l35.getText());
			f.l4.setIcon(f.l36.getIcon());
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
		if(e.getSource()==bt10) {
			f.i = 9;
			dispose();
			f.l1.setText(f.l37.getText());
			f.l2.setText(f.l38.getText());
			f.l3.setText(f.l39.getText());
			f.l4.setIcon(f.l40.getIcon());
			f.setTitle("사료 및 간식");
			f.setSize(370,600);
			f.setVisible(true);
		}
	}
}