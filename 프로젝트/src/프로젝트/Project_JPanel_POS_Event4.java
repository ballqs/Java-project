package 프로젝트;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Project_JPanel_POS_Event4 implements MouseListener{
	Project_JPanel_POS jpanel_pos;
	Project_Payment pay;
	public Project_JPanel_POS_Event4(Project_JPanel_POS jpanel_pos, Project_Payment pay) {
		this.jpanel_pos = jpanel_pos;
		this.pay = pay;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==jpanel_pos.shotAdd[0]) {
			jpanel_pos.order_menu4.setText("/"+jpanel_pos.shotAdd[0].getText());
			pay.setOption4(jpanel_pos.shotAdd[0].getText());
		}else if(e.getSource()==jpanel_pos.shotAdd[1]) {
			jpanel_pos.order_menu4.setText("/"+jpanel_pos.shotAdd[1].getText());
			pay.setOption4(jpanel_pos.shotAdd[1].getText());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
