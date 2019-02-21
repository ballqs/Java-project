package ������Ʈ;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class Project_JFrame_Inventory_Management extends JFrame{
	GridBagLayout gbl;
	GridBagConstraints gbc;
	public Project_JFrame_Inventory_Management() {
		setTitle("��� ����");
		setSize(700,500);
		gbl = new GridBagLayout();
		setLayout(gbl);
		gbc = new GridBagConstraints(); //��GridBagLayout�� ��ġ�� ������Ʈ ��ġ ���� ���� ���� ��ü �غ�

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
	      //���� ���� �� gridx, gridy���� 0 
	      gbc.gridwidth  = w;	//����
	      gbc.gridheight = h;	//����
	      //gridwidth�� GridBagConstraints.REMAINDER ������ �����ϸ� ���� ���� ������ ���̵ǰ�, 
	      //gridheight�� GridBagConstraints.REMAINDER ������ �����ϸ� ���� ���� ������ ���̵˴ϴ�. 
	      //gridwidth�� GridBagConstraints. RELATIVE ������ �����ϸ� ���� ���� ���� ������ ������ ������ �����ϰ�, 
	      //gridheight�� GridBagConstraints. RELATIVE ������ �����ϸ� ���� ���� ���� ������ ������ ������ �����ϵ��� �մϴ�.
	      
	      gbl.setConstraints(c, gbc); //������Ʈ�� ������Ʈ ��ġ+ũ�� ������ ���� GridBagLayout�� ��ġ
	 
	      add(c);
	   }

}
