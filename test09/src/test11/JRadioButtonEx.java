package test11;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonEx extends JFrame{
	private JFrame f;
	private JPanel p;
	private JRadioButton rb[];
	private ButtonGroup bg;
	private String fruits[] = {"사과","배","체리"};
	
	public JRadioButtonEx() {
		f = new JFrame();
		f.setTitle("라디오 버튼 묶기");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		rb = new JRadioButton[3];
		bg = new ButtonGroup();
		for(int i=0; i<3; i++) {
			rb[i] = new JRadioButton(fruits[i]);
			bg.add(rb[i]);
		}
		for(int i=0; i<3; i++) {
			p.add(rb[i]);
		}
		f.add(p);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new JRadioButtonEx();
	}

}
