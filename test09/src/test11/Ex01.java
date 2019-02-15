package test11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 extends JFrame implements ItemListener{
	private JFrame f;
	private JPanel p;
	private JCheckBox cb1,cb2;
	private JButton b;
	public Ex01() {
		f = new JFrame();
		f.setTitle("CheckBox");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		
		cb1 = new JCheckBox("버튼 비할성화");
		cb1.addItemListener(this);
		cb2 = new JCheckBox("버튼 감추기");
		cb2.addItemListener(this);
		
		b = new JButton("test button");
		
		p.setLayout(new FlowLayout());
		
		p.add(cb1);p.add(cb2);p.add(b);
		
		f.add(p);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(e.getItem()==cb1) {
				b.setEnabled(false);
			}else if(e.getItem()==cb2) {
				b.setVisible(false);
			}
		}else {
			if(e.getItem()==cb1) {
				b.setEnabled(true);
			}else if(e.getItem()==cb2) {
				b.setVisible(true);
			}
		}
		
	}

}
