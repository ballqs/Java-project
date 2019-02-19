import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex14 extends JFrame{
	Ex14(){
		setTitle("타이틀");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel l = new JLabel("문자");
		JButton b = new JButton("버튼");
		b.setSize(50, 50);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b) {
					l.setText("바뀐다!!");
				}
			}});
		add(l);
		add(b);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex14();
	}

}
