package ������Ʈ;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Project_JFrame_Failure extends JFrame{
	public Project_JFrame_Failure() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dim.width/2)-(getWidth()/2), (dim.height/2)-(getHeight()/2));
		setTitle("Error...");
		setSize(250, 100);
		setLayout(new BorderLayout());
		add(new JLabel("���̵� �� ��й�ȣ�� Ʋ�Ƚ��ϴ�."),BorderLayout.CENTER);
		setVisible(true);
	}
}
