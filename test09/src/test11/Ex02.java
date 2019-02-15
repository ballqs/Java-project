package test11;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex02 extends JFrame implements KeyListener{
	private JFrame f;
	private JPanel p;
	private JTextField tf;
	private JComboBox<String> cb;
	public Ex02(){
		f = new JFrame();
		f.setTitle("문제2");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		
		tf = new JTextField(15);
		tf.addKeyListener(this);
		
		
		cb = new JComboBox<String>();
		
		p.add(tf);p.add(cb);
		
		f.add(p);
		f.setVisible(true);
		
		tf.setFocusable(true);
		tf.requestFocus();
	}
	public static void main(String[] args) {
		new Ex02();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			cb.addItem(tf.getText());
			//콤보 박스의 추가 방식은 addItem이다!
			tf.setText("");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
