package 프로젝트;

import java.awt.Component;
import java.awt.RadialGradientPaint;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Project_JPanel_POS_Event implements MouseListener{
	Project_JPanel_POS jpanel_pos;
	Project_Payment pay;
	public Project_JPanel_POS_Event(Project_JPanel_POS jpanel_pos , Project_Payment pay) {
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
		for(int i = 0; i<jpanel_pos.drink.length; i++) {
			if(e.getSource()==jpanel_pos.drink[i]) {
				jpanel_pos.order_menu1.setText(jpanel_pos.drink[i].getText());
				pay.setOption1(jpanel_pos.drink[i].getText());
			}
		}
		
		
//		if(drink==null) {
//			drink = "";
//		}
//		if(shot==null) {
//			shot = "";
//		}
//		
//		if(e.getSource() == JPanel_POS.Temperature[0]) 
//			this.shot = JPanel_POS.Temperature[0].getText();
//		else if(e.getSource() == JPanel_POS.Temperature[1])
//			this.shot = JPanel_POS.Temperature[1].getText();
//		
//		for(int i = 0; i<JPanel_POS.drink.length; i++) {
//			if(e.getSource() == JPanel_POS.drink[i]) {
//				this.drink = JPanel_POS.drink[i].getText();
//				if(JPanel_POS.Temperature[0].isSelected())
//					this.shot = JPanel_POS.Temperature[0].getText();
//				else if(JPanel_POS.Temperature[1].isSelected())
//					this.shot = JPanel_POS.Temperature[1].getText();
//				method(JPanel_POS.Temperature[0]);
//				method(JPanel_POS.Temperature[1]);
//			}
//		}
		
//		Component j1 = (Component) e.getSource();
//		
//		String type="";
//		if(j1.getText().equals("ICE"))
//			type = "ICE";
//		else
//			type = "HOT";
		
		
//		JPanel_POS.order_menu.setText(drink+"/"+shot);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
