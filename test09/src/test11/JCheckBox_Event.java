package test11;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JCheckBox_Event extends JFrame implements ItemListener{
	private JFrame f;
	private JPanel p1,p2,p3;
	private JLabel l1,l2;
	private JCheckBox cb[];
	private String fruits[] = {"사과","배","체리"};
	private int num = 0;
	public JCheckBox_Event() {
		f = new JFrame();
		f.setTitle("체크박스와 이벤트");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		l1 = new JLabel("사과 100원,배 500원,체리 20000원");
		p1.add(l1);
		
		cb = new JCheckBox[3];
				
		for(int i=0; i<3; i++) {
			cb[i] = new JCheckBox(fruits[i]);
			cb[i].addItemListener(this);
			cb[i].setBorderPainted(true);
			p2.add(cb[i]);
		}
		
		l2 = new JLabel("현재 "+num+"원 입니다.");
		p3.add(l2);
		
		f.add(p1);f.add(p2);f.add(p3);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new JCheckBox_Event();
	}

	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem()==cb[0]) {
				num += 100;
			}else if(e.getItem()==cb[1]) {
				num += 500;
			}else if(e.getItem()==cb[2]){
				num += 20000;
			}
		}else {
			if(e.getItem()==cb[0]) {
				num -= 100;
			}else if(e.getItem()==cb[1]) {
				num -= 500;
			}else if(e.getItem()==cb[2]){
				num -= 20000;
			}
		}
		l2.setText("현재 "+num+"원 입니다.");
			
		
	}

}
