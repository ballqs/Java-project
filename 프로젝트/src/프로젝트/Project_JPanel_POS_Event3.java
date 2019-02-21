package 프로젝트;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Project_JPanel_POS_Event3 implements MouseListener{
	Project_JPanel_POS jpanel_pos;
	Project_Payment pay;
	public Project_JPanel_POS_Event3(Project_JPanel_POS jpanel_pos, Project_Payment pay) {
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
		if(e.getSource()==jpanel_pos.drinksize[0]) {
			jpanel_pos.order_menu3.setText("/"+jpanel_pos.drinksize[0].getText());
			pay.setOption3(jpanel_pos.drinksize[0].getText());
		}else if(e.getSource()==jpanel_pos.drinksize[1]) {
			jpanel_pos.order_menu3.setText("/"+jpanel_pos.drinksize[1].getText());
			pay.setOption3(jpanel_pos.drinksize[1].getText());
		}else if(e.getSource()==jpanel_pos.drinksize[2]) {
			jpanel_pos.order_menu3.setText("/"+jpanel_pos.drinksize[2].getText());
			pay.setOption3(jpanel_pos.drinksize[2].getText());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
