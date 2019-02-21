package 프로젝트;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Project_JFrame_Payment extends JFrame{
	public Project_JFrame_Payment() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dim.width/2)-(getWidth()/2), (dim.height/2)-(getHeight()/2));
		setTitle("결제창");
		setSize(100,100);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(new JLabel("결제되었습니다."));
		setVisible(true);
	}
}
