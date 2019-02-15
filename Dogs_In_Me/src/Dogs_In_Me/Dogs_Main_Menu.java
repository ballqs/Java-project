package Dogs_In_Me;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dogs_Main_Menu extends JFrame implements ActionListener {
	GridBagLayout gbl;
	GridBagConstraints gbc,gbb;
	
	JButton bt1,bt2,bt3,bt4;
	JLabel l0,l1,l2,l3,l4;
	
	ImageIcon ii0,ii1,ii2,ii3;
	
	Dogs_Main_Menu(){
		setTitle("Dogs In Me");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,400);
		
		Container c = getContentPane();
		
		c.setBackground(Color.WHITE);
		
		bt1 = new JButton("종류");
		bt1.addActionListener(this);
		bt2 = new JButton("음식 및 사료");
		bt2.addActionListener(this);
		bt3 = new JButton("저장 및 불러오기");
		bt3.addActionListener(this);
		bt4 = new JButton("종료");
		bt4.addActionListener(this);
		
		ImageIcon ii0 = new ImageIcon("Icon/Main.png");
		l0 = new JLabel(ii0);
		
		l1 = new JLabel("만든이 : 김성호,김태훈,황호진,이승훈");
		
		ImageIcon ii1 = new ImageIcon("Icon/icon.png");
		l2 = new JLabel(ii1);
		
		ImageIcon ii2 = new ImageIcon("Icon/icon2.png");
		l3 = new JLabel(ii2);
		
		ImageIcon ii3 = new ImageIcon("Icon/icon3.jpg");
		l4 = new JLabel(ii3);
		
		gbl = new GridBagLayout();
	    setLayout(gbl);
	    
	    gbc = new GridBagConstraints(); //☆GridBagLayout에 배치할 컴포넌트 위치 정보 등을 담을 객체 준비

	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    
	    gbc.weightx = 1.0;
	    gbc.weighty = 1.0;
	    
	    gbb = new GridBagConstraints(); //☆GridBagLayout에 배치할 컴포넌트 위치 정보 등을 담을 객체 준비

	    gbb.fill = GridBagConstraints.VERTICAL;
	    
	    gbb.weightx = 1.0;
	    gbb.weighty = 1.0;
	    
	    gbAdd(l0, 0, 0, 3, 1);
	    gbAdd(bt1, 1, 1, 1, 1);
	    gbAdd(bt2, 1, 2, 1, 1);
	    gbAdd(bt3, 1, 3, 1, 1);
	    gbAdd(bt4, 1, 4, 1, 1);
	    gbAdd(l1, 1, 5, 1, 1);
	    gbbAdd(l2, 0, 1, 1, 2);
	    gbbAdd(l3, 2, 3, 1, 2);
	    gbbAdd(l4, 0, 6, 4, 1);
		
		pack();
		setVisible(true);
		
		
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
	
	private void gbbAdd(Component c, int x, int y, int w, int h) {

	      gbb.gridx = x;
	      gbb.gridy = y; 
	      //가장 왼쪽 위 gridx, gridy값은 0 
	      gbb.gridwidth  = w;	//넓이
	      gbb.gridheight = h;	//높이
	      //gridwidth를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 행의 마지막 셀이되고, 
	      //gridheight를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 열의 마지막 셀이됩니다. 
	      //gridwidth를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 행의 다음 셀부터 마지막 셀까지 차지하고, 
	      //gridheight를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 열의 다음 셀부터 마지막 셀까지 차지하도록 합니다.
	      
	      gbl.setConstraints(c, gbb); //컴포넌트를 컴포넌트 위치+크기 정보에 따라 GridBagLayout에 배치
	 
	      add(c);

	   }

	public static void main(String[] args) {
		new Dogs_Main_Menu();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt4) {
			System.exit(0);
		}
		if(e.getSource()==bt1) {
			dispose();
			new Dogs_Kinds();
		}
		if(e.getSource()==bt2) {
			dispose();
			Dogs_Feed_and_Snack f = new Dogs_Feed_and_Snack();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setTitle("사료 및 간식");
			f.pack();
			f.setVisible(true);
		}
		if(e.getSource()==bt3) {
			dispose();
			Dogs_Image i = new Dogs_Image();
			i.setVisible(true);
		}
		
	}

}