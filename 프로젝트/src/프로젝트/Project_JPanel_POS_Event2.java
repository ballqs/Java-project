package 프로젝트;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Project_JPanel_POS_Event2 implements MouseListener{
	Project_JPanel_POS jpanel_pos;
	Project_Payment pay;
	public Project_JPanel_POS_Event2(Project_JPanel_POS jpanel_pos , Project_Payment pay) {
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
		if(e.getSource()==jpanel_pos.temperature[0]) {
			jpanel_pos.order_menu2.setText("/"+jpanel_pos.temperature[0].getText());
			pay.setOption2(jpanel_pos.temperature[0].getText());
		}else if(e.getSource()==jpanel_pos.temperature[1]) {
			jpanel_pos.order_menu2.setText("/"+jpanel_pos.temperature[1].getText());
			pay.setOption2(jpanel_pos.temperature[1].getText());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
