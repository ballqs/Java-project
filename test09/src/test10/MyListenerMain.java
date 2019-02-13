package test10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyListenerMain extends JFrame implements ActionListener{
	public MyListenerMain() {
		setTitle("예제10 - 1");
		setSize(200,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JButton btn = new JButton("Action");
		//1. 컴포넌트 생성
		//2. 이벤트처리 리스너 객체 사용
		//3. 2단계에서 만든 리스너를 컴포넌트에 연결
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
