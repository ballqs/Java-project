package test11;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButton_EventEx extends JFrame implements ItemListener{
	private JFrame f;
	private JPanel p1,p2;
	private String text[] = {"사과","바나나","체리"};
	private JLabel l;
	private ImageIcon ii[] = {new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/cherry.jpg")};
	private JRadioButton rb[];
	private ButtonGroup bg;
	public JRadioButton_EventEx() {
		f = new JFrame();
		f.setTitle("라디오버튼 Item Event 예제");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		
		l = new JLabel();
		rb = new JRadioButton[3];
		bg = new ButtonGroup();
		for(int i=0; i<ii.length; i++) {
			ii[i] = new ImageIcon(ii[i].getImage().
					getScaledInstance(150, 150, Image.SCALE_DEFAULT));
			//이미지를 리사이즈 한다음에 변수에 집어넣는다.
		}
		for(int i=0; i<rb.length; i++) {
			rb[i] = new JRadioButton(text[i]);
			bg.add(rb[i]);
			rb[i].addItemListener(this);
		}
		rb[2].setSelected(true);
		
		for(int i=0; i<rb.length; i++) {
			p1.add(rb[i]);
		}
		
		p2.add(l);
		
		f.add(p1,BorderLayout.NORTH);
		f.add(p2,BorderLayout.CENTER);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new JRadioButton_EventEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.DESELECTED) {
			return;
		}
		if(rb[0].isSelected()) {
			l.setIcon(ii[0]);
		}else if(rb[1].isSelected()) {
			l.setIcon(ii[1]);
		}else if(rb[2].isSelected()) {
			l.setIcon(ii[2]);
		}
		
	}

}
