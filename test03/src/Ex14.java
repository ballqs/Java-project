import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex14 extends JFrame{
	Ex14(){
		setTitle("Ÿ��Ʋ");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel l = new JLabel("����");
		JButton b = new JButton("��ư");
		b.setSize(50, 50);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b) {
					l.setText("�ٲ��!!");
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
