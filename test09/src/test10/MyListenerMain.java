package test10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyListenerMain extends JFrame implements ActionListener{
	public MyListenerMain() {
		setTitle("����10 - 1");
		setSize(200,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JButton btn = new JButton("Action");
		//1. ������Ʈ ����
		//2. �̺�Ʈó�� ������ ��ü ���
		//3. 2�ܰ迡�� ���� �����ʸ� ������Ʈ�� ����
		btn.addActionListener(new MyListener());

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		p.add(btn);
		add(p);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyListenerMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
