package test11;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex07JPanel extends JPanel implements ChangeListener{
	private JPanel p1,p2;
	private JSlider s;
	private JLabel l;
	public Component Ex07JPanel1() {
		p1 = new JPanel();
		s = new JSlider(1,100,50);
		s.setMajorTickSpacing(20);
		s.setMinorTickSpacing(5);
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setValue(50);
		s.addChangeListener(this);
		p1.add(s);
		return p1;
	}
	public Component Ex07JPanel2() {
		p2 = new JPanel();
		l = new JLabel("I Love Java");
		l.setFont(new Font("Arial",Font.PLAIN,s.getValue()));
		p2.add(l);
		return p2;
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		l.setFont(new Font("Arial",Font.PLAIN,s.getValue()));
	}
}
