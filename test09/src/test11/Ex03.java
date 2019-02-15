package test11;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex03 extends JFrame implements ActionListener{
	private JFrame f;
	private JPanel p1,p2;
	private JLabel l[];
	private String str[]={"금액","오만원","만원","천원","500원","100원","50원","10원","1원"};
	private JTextField tf[];
	private JButton b;
	private int count=0;
	private int money[] = {50000,10000,1000,500,100,50,10,1};
	private int num;
	public Ex03(){
		f = new JFrame();
		f.setTitle("돈 분해기");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p2 = new JPanel();
		p2.setLayout(new GridLayout(8,2));
		
		l = new JLabel[str.length];
		tf = new JTextField[str.length];
		
		for(int i=0; i<l.length; i++) {
			if(i==0) {
				l[i] = new JLabel(str[i]);
				tf[i] = new JTextField(15);
				p1.add(l[i]);p1.add(tf[i]);
			}else {
				l[i] = new JLabel(str[i]);
				tf[i] = new JTextField(10);
				tf[i].setEditable(false);
				p2.add(l[i]);p2.add(tf[i]);
			}
		}
		
		b = new JButton("계산");
		b.addActionListener(this);
		p1.add(b);
		
		f.add(p1,BorderLayout.NORTH);f.add(p2,BorderLayout.CENTER);
		
		f.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			num = Integer.parseInt(tf[0].getText());
			cal(num,money);
		}
		
	}
	public void cal(int num1,int num2[]) {
		for(int i=0; i<num2.length; i++) {
			count = 0;
			while(num1>=num2[i]) {
				num1 = num1 - num2[i];
				count++;
			}
			tf[i+1].setText(Integer.toString(count));
		}
	}

}
