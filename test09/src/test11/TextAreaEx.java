package test11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame implements ActionListener{
	private JFrame f;
	private JPanel p;
	private JLabel l;
	private JTextField tf;
	private JTextArea ta;
	public TextAreaEx() {
		f = new JFrame();
		f.setTitle("텍스트영역 만들기 예제");
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setLayout(new FlowLayout());
		
		l = new JLabel("입력 후 <Enter> 키를 입력하세요");
		
		tf = new JTextField(20);
		
		ta = new JTextArea(7,20);
		ta.setEditable(false);
		
		tf.addActionListener(this);
		
		p.add(l);p.add(tf);p.add(ta);
		f.add(p);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.append(tf.getText() + "\n");
		tf.setText("");
	}

}
