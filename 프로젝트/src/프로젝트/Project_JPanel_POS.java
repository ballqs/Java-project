package ������Ʈ;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


//�� ������ư�� �̺�Ʈ�����ʿ� ��ư�� �����ʸ� ���� ���� ó���ϰ� �� ó���� ���� ������ Label�� �־ �����ϴ� ��������!

public class Project_JPanel_POS extends JPanel implements MouseListener{
	JPanel p1,p2,p2_1_GirdLayout,p2_1_FlowLayout1,p2_1_FlowLayout2,p2_1_FlowLayout3,p2_2_FlowLayout,p2_3_FlowLayout;
	GridBagLayout gbl;
	GridBagConstraints gbc;
	String drinkList[] = {"����������","�Ƹ޸�ī��","Ŀ�Ƕ�","�ٴҶ��","�׸�Ƽ��","īǪġ��","��ü��","ī���ī","������ġ��","���⽺����","��������","������","��Ƽ","����Ƽ","�׸�Ƽ"};
	JButton drink[],view_sales,inventory_management,deselect,payment;
	JRadioButton temperature[],shotAdd[],drinksize[];
	ButtonGroup temperatureBG,shotAddBG,drinksizeBG;
	JLabel bundle[],order_menu1,order_menu2,order_menu3,order_menu4;
	Project_Payment pay = new Project_Payment();
	Project_JFrame_ViewSales v = new Project_JFrame_ViewSales();
	Project_JFrame_Inventory_Management im = new Project_JFrame_Inventory_Management();
	Project_JPanel_POS(){
		v.setVisible(false);
		im.setVisible(false);
	}
	public Component Project_JPanel_POS1(){
		
		
		p1 = new JPanel();
		
		gbl = new GridBagLayout();
	    p1.setLayout(gbl);
	    p1.setPreferredSize(new Dimension(400,400));
	    p1.setOpaque(true);
	    p1.setBackground(Color.gray);
	    
	    gbc = new GridBagConstraints(); //��GridBagLayout�� ��ġ�� ������Ʈ ��ġ ���� ���� ���� ��ü �غ�

	    gbc.fill = GridBagConstraints.NONE;
	    
	    gbc.weightx = 1.0;
	    gbc.weighty = 1.0;
	    
		drink = new JButton[drinkList.length];
		for(int i=0; i<drink.length; i++) {
			drink[i] = new JButton(drinkList[i]);
			drink[i].setPreferredSize(new Dimension(100,70));
			drink[i].setFont(new Font("�޸�����",Font.BOLD,11));
			drink[i].addMouseListener(new Project_JPanel_POS_Event(Project_JPanel_POS.this,pay));
		}
		gbAdd(drink[0],0,0,1,1);
		gbAdd(drink[1],1,0,1,1);
		gbAdd(drink[2],2,0,1,1);
		gbAdd(drink[3],0,1,1,1);
		gbAdd(drink[4],1,1,1,1);
		gbAdd(drink[5],2,1,1,1);
		gbAdd(drink[6],0,2,1,1);
		gbAdd(drink[7],1,2,1,1);
		gbAdd(drink[8],2,2,1,1);
		gbAdd(drink[9],0,3,1,1);
		gbAdd(drink[10],1,3,1,1);
		gbAdd(drink[11],2,3,1,1);
		gbAdd(drink[12],0,4,1,1);
		gbAdd(drink[13],1,4,1,1);
		gbAdd(drink[14],2,4,1,1);
		
		return p1;
	}
	
	public Component Project_JPanel_POS2(){
		p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.setPreferredSize(new Dimension(300,400));
		
		
		p2_1_GirdLayout = new JPanel();
		p2_1_GirdLayout.setLayout(new GridLayout(3,1,0,5));
		p2_1_GirdLayout.setPreferredSize(new Dimension(300,50));
		p2_1_GirdLayout.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1)));
		
		p2_1_FlowLayout1 = new JPanel();
		p2_1_FlowLayout1.setLayout(new FlowLayout());
		
		p2_1_FlowLayout2 = new JPanel();
		p2_1_FlowLayout2.setLayout(new FlowLayout());
		
		p2_1_FlowLayout3 = new JPanel();
		p2_1_FlowLayout3.setLayout(new FlowLayout());
		
		temperature = new JRadioButton[2];
		shotAdd = new JRadioButton[2];
		drinksize = new JRadioButton[3];
		
		temperature[0] = new JRadioButton("ICE");
		temperature[0].setFont(new Font("Arial",Font.BOLD,11));
		temperature[0].addMouseListener(new Project_JPanel_POS_Event2(Project_JPanel_POS.this,pay));
		temperature[1] = new JRadioButton("HOT");
		temperature[1].setFont(new Font("Arial",Font.BOLD,11));
		temperature[1].addMouseListener(new Project_JPanel_POS_Event2(Project_JPanel_POS.this,pay));
		temperatureBG = new ButtonGroup();
		
		temperatureBG.add(temperature[0]);
		temperatureBG.add(temperature[1]);
		
		shotAdd[0] = new JRadioButton("Yes");
		shotAdd[0].setFont(new Font("Arial",Font.BOLD,11));
		shotAdd[0].addMouseListener(new Project_JPanel_POS_Event4(Project_JPanel_POS.this,pay));
		shotAdd[1] = new JRadioButton("No");
		shotAdd[1].setSelected(true);
		shotAdd[1].setFont(new Font("Arial",Font.BOLD,11));
		shotAdd[1].addMouseListener(new Project_JPanel_POS_Event4(Project_JPanel_POS.this,pay));
		shotAddBG = new ButtonGroup();
		
		shotAddBG.add(shotAdd[0]);
		shotAddBG.add(shotAdd[1]);
		
		drinksize[0] = new JRadioButton("SMALL");
		drinksize[0].setFont(new Font("Arial",Font.BOLD,11));
		drinksize[0].addMouseListener(new Project_JPanel_POS_Event3(Project_JPanel_POS.this,pay));
		drinksize[1] = new JRadioButton("TALL");
		drinksize[1].setFont(new Font("Arial",Font.BOLD,11));
		drinksize[1].setSelected(true);
		drinksize[1].addMouseListener(new Project_JPanel_POS_Event3(Project_JPanel_POS.this,pay));
		drinksize[2] = new JRadioButton("LARGE");
		drinksize[2].setFont(new Font("Arial",Font.BOLD,11));
		drinksize[2].addMouseListener(new Project_JPanel_POS_Event3(Project_JPanel_POS.this,pay));
		drinksizeBG = new ButtonGroup();
		
		drinksizeBG.add(drinksize[0]);
		drinksizeBG.add(drinksize[1]);
		drinksizeBG.add(drinksize[2]);
		
		bundle = new JLabel[3];
		bundle[0] = new JLabel("HOT/ICE");
		bundle[0].setFont(new Font("���",Font.BOLD,13));
		bundle[1] = new JLabel("���� ������");
		bundle[1].setFont(new Font("���",Font.BOLD,13));
		bundle[2] = new JLabel("�� �߰�");
		bundle[2].setFont(new Font("���",Font.BOLD,13));
		
		p2_1_FlowLayout1.add(bundle[0]);p2_1_FlowLayout1.add(temperature[0]);p2_1_FlowLayout1.add(temperature[1]);
		p2_1_FlowLayout2.add(bundle[1]);p2_1_FlowLayout2.add(drinksize[0]);p2_1_FlowLayout2.add(drinksize[1]);p2_1_FlowLayout2.add(drinksize[2]);
		p2_1_FlowLayout3.add(bundle[2]);p2_1_FlowLayout3.add(shotAdd[0]);p2_1_FlowLayout3.add(shotAdd[1]);
		
		p2_1_GirdLayout.add(p2_1_FlowLayout1);p2_1_GirdLayout.add(p2_1_FlowLayout2);p2_1_GirdLayout.add(p2_1_FlowLayout3);
		
		
		p2_2_FlowLayout = new JPanel();
		p2_2_FlowLayout.setLayout(new FlowLayout());
		p2_2_FlowLayout.setPreferredSize(new Dimension(300,100));
		p2_2_FlowLayout.setBorder(new EmptyBorder(50, 10, 10, 10));
		
		order_menu1 = new JLabel();
		order_menu2 = new JLabel();
		order_menu3 = new JLabel();
		order_menu4 = new JLabel();
		p2_2_FlowLayout.add(order_menu1);
		p2_2_FlowLayout.add(order_menu2);
		p2_2_FlowLayout.add(order_menu3);
		p2_2_FlowLayout.add(order_menu4);
		
		p2_3_FlowLayout = new JPanel();
		p2_3_FlowLayout.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		p2_3_FlowLayout.setPreferredSize(new Dimension(300,120));
		
		view_sales = new JButton("�Ǹ� ����");
		view_sales.setPreferredSize(new Dimension(120,50));
		view_sales.addMouseListener(this);
		inventory_management = new JButton("��� ����");
		inventory_management.setPreferredSize(new Dimension(120,50));
		inventory_management.addMouseListener(this);
		deselect = new JButton("���� ���");
		deselect.setPreferredSize(new Dimension(120,50));
		deselect.addMouseListener(this);
		payment = new JButton("����");
		payment.setPreferredSize(new Dimension(120,50));
		payment.addMouseListener(this);
		
		
		p2_3_FlowLayout.add(view_sales);
		p2_3_FlowLayout.add(inventory_management);
		p2_3_FlowLayout.add(deselect);
		p2_3_FlowLayout.add(payment);
		
		p2.add(p2_1_GirdLayout);
		p2.add(p2_2_FlowLayout);
		p2.add(p2_3_FlowLayout);
		
		return p2;
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
	 
	      p1.add(c);

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
		if(e.getSource()==payment) {
			new Project_JFrame_Payment();
			v.view.m.insertRow(v.view.b.length, new Object[]{pay.getOption1(),pay.getOption2(),pay.getOption3(),pay.getOption4()});
//			view.m.insertRow(view.b.length, new Object[]{pay.getOption1(),pay.getOption2(),pay.getOption3(),pay.getOption4()});
//			view_frame.view.m.insertRow(view_frame.view.b.length, new Object[]{pay.getOption1(),pay.getOption2(),pay.getOption3(),pay.getOption4()});
		}
		if(e.getSource()==view_sales) {
			//view_frame.setVisible(true);
			//(JFrame)jpanel_pos.getTopLevelAncestor();
			v.setVisible(true);
		}
		if(e.getSource()==deselect) {
			order_menu1.setText("");
			order_menu2.setText("");
			order_menu3.setText("");
			order_menu4.setText("");
		}
		if(e.getSource()==inventory_management) {
			im.setVisible(true);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
}
