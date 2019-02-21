package 프로젝트;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Project_JFrame_ViewSales extends JFrame{
	Project_JPanel_ViewSales view = new  Project_JPanel_ViewSales(Project_JFrame_ViewSales.this);
	public Project_JFrame_ViewSales(){
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dim.width/2)-(getWidth()/2), (dim.height/2)-(getHeight()/2));
		setTitle("판매된 목록");
		setSize(500,500);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(view);
		setVisible(true);
	}
}
