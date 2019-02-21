package 프로젝트;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Project_JFrame_Login extends JFrame{
	public Project_JFrame_Login(){
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dim.width/2)-(getWidth()/2), (dim.height/2)-(getHeight()/2));
		
		setTitle("로그인 창");
		setSize(400, 300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Project_JPanel_Login_Form(Project_JFrame_Login.this));
		pack();
		setResizable(false);
		setVisible(true);
	}
}
