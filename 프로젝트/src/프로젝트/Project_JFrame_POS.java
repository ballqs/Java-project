package 프로젝트;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Project_JFrame_POS extends JFrame{
	public Project_JFrame_POS() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dim.width/2)-(getWidth()/2), (dim.height/2)-(getHeight()/2));
		setTitle("POS 기기");
		setSize(800,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Project_JPanel_POS p = new Project_JPanel_POS();
		add(p.Project_JPanel_POS1());
		add(p.Project_JPanel_POS2());
		setResizable(false);
		pack();
		setVisible(true);
	}
}
