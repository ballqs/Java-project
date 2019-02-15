package test11;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex05_JPanel extends JPanel implements ChangeListener{
	JSlider sd;
	JLabel l;
	public Ex05_JPanel() {
		setLayout(new FlowLayout());
		sd = new JSlider();
		sd.setMinimum(100);
		sd.setMaximum(200);
		sd.setMajorTickSpacing(20);
		sd.setPaintLabels(true);
		sd.addChangeListener(this);
		
		l = new JLabel("0");
		l.setOpaque(true);
		l.setBackground(Color.gray);
		
		add(sd);
		add(l);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		l.setText(Integer.toString(sd.getValue()));
	}
}
