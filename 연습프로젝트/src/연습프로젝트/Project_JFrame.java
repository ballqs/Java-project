package 연습프로젝트;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Project_JFrame extends JFrame{
	public Project_JFrame(){
		setTitle("신체 질량 지수 측정(BMI)");
		setSize(600, 430);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Project_JPanel p = new Project_JPanel();
		add(p.Project_JPanel1());
		add(p.Project_JPanel2());
		setResizable(false);
		setVisible(true);
	}
}
