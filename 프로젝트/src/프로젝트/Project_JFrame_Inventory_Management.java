package 프로젝트;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class Project_JFrame_Inventory_Management extends JFrame{
	GridBagLayout gbl;
	GridBagConstraints gbc;
	public Project_JFrame_Inventory_Management() {
		setTitle("재고 관리");
		setSize(900,500);
		gbl = new GridBagLayout();
		setLayout(gbl);
		gbc = new GridBagConstraints(); //☆GridBagLayout에 배치할 컴포넌트 위치 정보 등을 담을 객체 준비

		gbc.fill = GridBagConstraints.NONE;
		    
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		Project_JPanel_Inventory_Management p = new Project_JPanel_Inventory_Management();
		gbAdd(p.Project_JPanel_Inventory_Management1(),0,0,1,1);
		gbAdd(p.Project_JPanel_Inventory_Management2(),1,0,1,1);
		gbAdd(p.Project_JPanel_Inventory_Management3(),0,1,2,1);
		pack();
		setVisible(true);
	}
	private void gbAdd(Component c, int x, int y, int w, int h) {

	      gbc.gridx = x;
	      gbc.gridy = y; 
	      //가장 왼쪽 위 gridx, gridy값은 0 
	      gbc.gridwidth  = w;	//넓이
	      gbc.gridheight = h;	//높이
	      //gridwidth를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 행의 마지막 셀이되고, 
	      //gridheight를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 열의 마지막 셀이됩니다. 
	      //gridwidth를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 행의 다음 셀부터 마지막 셀까지 차지하고, 
	      //gridheight를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 열의 다음 셀부터 마지막 셀까지 차지하도록 합니다.
	      
	      gbl.setConstraints(c, gbc); //컴포넌트를 컴포넌트 위치+크기 정보에 따라 GridBagLayout에 배치
	 
	      add(c);
	   }

}
