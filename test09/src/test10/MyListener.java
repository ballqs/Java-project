package test10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//2�ܰ� ������ �����
//�������̽� < - > Ŭ������ ��, ���� ��
//Ŭ������ �ƴ� �������̽��� ��� ���� ���� implements�� �Ѵ�.
public class MyListener implements ActionListener{

	@Override//�θ� �ִ� �޼ҵ带 �ڽ��� ������ �Ѵ�.
	//������ �ʼ������� �θ� �ִ� ���� �ݵ�� �ڽ�Ŭ�������� ������ ����� �ϴµ� �� ������ �������̽�(implements)�� ����� �޾ұ� ����
	public void actionPerformed(ActionEvent e) {//�������� ���� �޼ҵ�� ������Ű������ �޼ҵ� �߰�!
		JButton btn = (JButton)e.getSource();//�̺�Ʈ�� �߻��� ��ü�� ����???
		if(btn.getText().equals("Action")) {
			btn.setText("�׼�");
		}else {
			btn.setText("Action");
		}
	}

}
