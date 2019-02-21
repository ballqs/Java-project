package 연습프로젝트;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Project_Event implements ActionListener {
	Project_JPanel project_panel;
	String str,sex,ss;
	String obesity[] = {"(고도비만)","(중도비만)","(과체중)","(정상)","(저체중)"};
	Color setColor[] = {Color.RED,Color.GREEN,Color.BLUE};
	double weight,height,result,num=0,colornum=0;
//	JLabel l1;
//	JCheckBox cb1;
//	JButton btn;
//	Project_Event(JLabel l1,JCheckBox cb1,JButton btn){
//		this.l1 = l1;
//		this.cb1 = cb1;
//		this.btn = btn;
//	}
	
	Project_Event(Project_JPanel project_panel){
		this.project_panel = project_panel;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		project_panel = new Project_JPanel();
//		JButton CheckButton = (JButton)e.getSource();
//		JLabel ll1 = (JLabel)e.
		if(e.getSource()== project_panel.CheckButton) {
			if(project_panel.cb1.isSelected()) {
				project_panel.ll3.setVisible(true);
			}else if(!project_panel.cb1.isSelected()) {
				project_panel.ll3.setVisible(false);
			}
			if(project_panel.cb2.isSelected()) {
				project_panel.ll4.setVisible(true);
			}else if(!project_panel.cb2.isSelected()) {
				project_panel.ll4.setVisible(false);
			}
			if(project_panel.cb3.isSelected()) {
				project_panel.ll5.setVisible(false);
			}else if(!project_panel.cb3.isSelected()) {
				project_panel.ll5.setVisible(true);
			}
			height = Double.parseDouble(project_panel.tf2.getText());
			weight = Double.parseDouble(project_panel.tf3.getText());
			result = weight /((height/100)*(height/100));
			ss = String.valueOf(result);
			result = Double.parseDouble(ss.substring(0,6));
			
			if(result>=30) {
				num=0;
				colornum=0;
			}else if(result>=25 && result<30) {
				num=1;
				colornum=0;
			}else if(result>=23 && result<25) {
				num=2;
				colornum=0;
			}else if(result>=18.5 && result<23) {
				num=3;
				colornum=1;
			}else if(result<18.5) {
				num=4;
				colornum=2;
			}
			if(project_panel.rb1.isSelected()) {
				sex = "멋진 ";
			}else if(project_panel.rb2.isSelected()) {
				sex = "아름다운 ";
			}
			str = "<html><body>"+sex+project_panel.tf1.getText()+"님의<br> 신체 질량 지수는 <br>"+result+obesity[(int) num]+"입니다!</body></html>";
			project_panel.ll2.setText(str);
			project_panel.p2_2_3.setOpaque(true);
			project_panel.p2_2_3.setBackground(setColor[(int) colornum]);
			
		}
	}

}
