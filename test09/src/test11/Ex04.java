package test11;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex04 extends JFrame implements ActionListener{
	private JFrame f;
	private JPanel p1,p2;
	private JLabel l[];
	private String str[]={"금액","오만원","만원","천원","500원","100원","50원","10원","1원"};
	private JTextField tf[];
	private JCheckBox cb[];
	private JButton b;
	private int count=0;
	private int money[] = {50000,10000,1000,500,100,50,10,1};
	private int num;
	private GridBagLayout gbl;
	private GridBagConstraints gbc;
	public Ex04(){
		f = new JFrame();
		f.setTitle("돈 분해기");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p2 = new JPanel();
		gbl = new GridBagLayout();
		p2.setLayout(gbl);
		
		gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
	    
	    gbc.weightx = 1.0;
	    gbc.weighty = 1.0;
		
		l = new JLabel[str.length];
		tf = new JTextField[str.length];
		cb = new JCheckBox[str.length-2];
		
		for(int i=0; i<l.length; i++) {
			if(i==0) {
				l[i] = new JLabel(str[i]);
				tf[i] = new JTextField(15);
				p1.add(l[i]);p1.add(tf[i]);
			}else {
				l[i] = new JLabel(str[i]);
				tf[i] = new JTextField(10);
				tf[i].setEditable(false);
				gbAdd(l[i], 0, i-1, 1, 1);
				gbAdd(tf[i], 1, i-1, 1, 1);
			}
		}
		for(int i=0; i<cb.length; i++) {
			cb[i] = new JCheckBox();
			gbAdd(cb[i], 2, i, 1, 1);
		}

		
		
		
		b = new JButton("계산");
		b.addActionListener(this);
		p1.add(b);
		
		f.add(p1,BorderLayout.NORTH);f.add(p2,BorderLayout.CENTER);
		
		f.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Ex04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		num = Integer.parseInt(tf[0].getText());
		count = 0;
		if(e.getSource()==b) {
			for(int i=0;i<money.length;i++) {
				if(i==money.length-1) {//1의 자리 계산시
					count = num/money[i];
					tf[i+1].setText(Integer.toString(count));
					break;
				}
				if(!cb[i].isSelected()) {//체크 박스가 해제되어있으면 그 i의 수의 차례는 넘긴다.
					tf[i+1].setText("0");
					continue;
				}
				
				count = num/money[i];
				tf[i+1].setText(Integer.toString(count));
				num = num % money[i];
			}
		}
		
		
	}
	private void gbAdd(Component c, int x, int y, int w, int h) {

	      gbc.gridx = x;
	      gbc.gridy = y; 
	      //가장 왼쪽 위 gridx, gridy값은 0 
	      gbc.gridwidth  = w;	//넓이
	      gbc.gridheight = h;	//높이
	      
	      gbl.setConstraints(c, gbc); //컴포넌트를 컴포넌트 위치+크기 정보에 따라 GridBagLayout에 배치
	 
	      p2.add(c);

	   }

}
