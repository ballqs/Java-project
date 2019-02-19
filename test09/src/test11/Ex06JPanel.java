package test11;

import java.awt.Component;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex06JPanel extends JPanel implements KeyListener,ChangeListener{
	JPanel p1,p2;
	TextArea ta;
	JSlider s;
	public Component Ex06JPanel1(){
		p1 = new JPanel();
		ta = new TextArea(8,50);
		ta.addKeyListener(this);
		p1.add(ta);
		return p1;
	}
	public Component Ex06JPanel2(){
		p2 = new JPanel();
		s = new JSlider();
		s.setMinimum(0);
		s.setMaximum(100);
		s.setMajorTickSpacing(20);
		s.setMinorTickSpacing(5);
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setValue(0);
		s.addChangeListener(this);
		p2.add(s);
		return p2;
	}
	@Override
	public void keyPressed(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		int num = ta.getText().length();
		if(num>=0 && num<100) {
			s.setValue(num);
			//TextArea의 입력 포지션을 정하는 명령어!!
			ta.setCaretPosition(num);
		}else {
			String str = ta.getText();
			str = str.substring(0,99);
			ta.setText(str);
		}
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		String str = ta.getText().substring(0,s.getValue());
		ta.setText(str);
	}
}
