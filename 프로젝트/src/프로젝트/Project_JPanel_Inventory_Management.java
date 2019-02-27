package 프로젝트;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Project_JPanel_Inventory_Management extends JPanel implements MouseListener{
	JPanel p1,p2,p2_1,p2_2,p3;
	String []material = {"날짜","원두","우유","시럽","딸기","망고","녹차","홍차","초코"};
    String [][]material_count = new String[0][9];
    DefaultTableModel model,m;
	JTable imtable;
	JScrollPane imscroll;
	JButton materialbutton[],impos,imreset,imview_sales,buttondate;
	JLabel datelabel1,datelabel2,number_explanation,img_label;
	ImageIcon inventory;
	Calendar oCalendar;
	JTextField number_of_materials;
	public Component Project_JPanel_Inventory_Management1() {
		p1 = new JPanel();
		p1.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1),"재고 관리"));
		p1.setPreferredSize(new Dimension(450,350));
		p1.setBackground(Color.white);
		
		model = new DefaultTableModel(material_count,material);
		imtable = new JTable(model);
		imscroll = new JScrollPane(imtable);
		imscroll.setPreferredSize(new Dimension(440,320));
		m = (DefaultTableModel)imtable.getModel();
		imtable.updateUI();
		p1.add(imscroll);
		return p1;
	}
	public Component Project_JPanel_Inventory_Management2() {
		p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1),"물품 주문"));
		p2.setPreferredSize(new Dimension(450,350));
		
		oCalendar = Calendar.getInstance();
		
		p2_1 = new JPanel();
		p2_1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2_1.setPreferredSize(new Dimension(430,70));
		datelabel1 = new JLabel("현재 날짜 : ");
		datelabel2 = new JLabel(Integer.toString((oCalendar.get(Calendar.MONTH)+1))+"월"+Integer.toString(oCalendar.get(Calendar.DAY_OF_MONTH))+"일");
		number_explanation = new JLabel("/ 주문 개수 : ");
		number_of_materials = new JTextField(8);
		p2_1.add(datelabel1);
		p2_1.add(datelabel2);
		p2_1.add(number_explanation);
		p2_1.add(number_of_materials);
		
		
		p2_2 = new JPanel();
		p2_2.setLayout(new GridLayout(2,5,20,20));
		p2_2.setPreferredSize(new Dimension(430,220));
		buttondate = new JButton("날짜");
		buttondate.addMouseListener(this);
		buttondate.setPreferredSize(new Dimension(80,50));
		buttondate.setBorder(new RoundedBorder(20));
		buttondate.setBounds(10,40,50,20);
		p2_2.add(buttondate);
		materialbutton = new JButton[material.length-1];
		for(int i = 0; i < materialbutton.length-4; i++) {
			materialbutton[i] = new JButton(material[i+1]);
			materialbutton[i].setPreferredSize(new Dimension(80,50));
			materialbutton[i].addMouseListener(this);
			materialbutton[i].setBorder(new RoundedBorder(20));
			materialbutton[i].setBounds(10,40,50,20);
			p2_2.add(materialbutton[i]);
		}
		inventory = new ImageIcon("img/Inventory.jpg");
		inventory = new ImageIcon(inventory.getImage().
				getScaledInstance(80,50, Image.SCALE_DEFAULT));
		img_label = new JLabel(inventory);
		img_label.setPreferredSize(new Dimension(100,50));
		p2_2.add(img_label);
		for(int i = 4; i < materialbutton.length; i++) {
			materialbutton[i] = new JButton(material[i+1]);
			materialbutton[i].setPreferredSize(new Dimension(80,50));
			materialbutton[i].addMouseListener(this);
			materialbutton[i].setBorder(new RoundedBorder(20));
			materialbutton[i].setBounds(10,40,50,20);
			p2_2.add(materialbutton[i]);
		}
		
		p2.setBackground(Color.WHITE);
		p2_1.setBackground(Color.lightGray);
		p2_2.setBackground(Color.WHITE);
		
		p2.add(p2_1);
		p2.add(p2_2);
		
		return p2;
	}
	public Component Project_JPanel_Inventory_Management3() {
		p3 = new JPanel();
		p3.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1)));
		p3.setPreferredSize(new Dimension(900,140));
		p3.setLayout(new FlowLayout(FlowLayout.CENTER,50,10));
		impos = new JButton("POS");
		impos.setPreferredSize(new Dimension(100,80));
		imview_sales = new JButton("판매 보기");
		imview_sales.setPreferredSize(new Dimension(100,80));
		imreset = new JButton("초기화");
		imreset.setPreferredSize(new Dimension(100,80));
		
		
		p3.setBackground(Color.WHITE);
		
		p3.add(impos);
		p3.add(imview_sales);
		p3.add(imreset);
		return p3;
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
		if(e.getSource()==buttondate) {
			for(int i=0; i<imtable.getRowCount()+1; i++) {
				if(imtable.getRowCount()==0) {
					//getRowCount값이 0일때 즉 어떤 값도 들어있지 않을때
					m.insertRow(material_count.length, new Object[] {datelabel2.getText()});//생성한다
					break;
				}
				
				if(m.getValueAt(i, 0).equals(datelabel2.getText())) {
					break;
				}else if(!m.getValueAt(i, 0).equals(datelabel2.getText()) && i == m.getRowCount()-1){
					m.insertRow(material_count.length, new Object[] {datelabel2.getText()});
					break;
				}
			}
			
		}
		if(e.getSource()==materialbutton[0]) {
//			m.setValueAt(number_of_materials.getText(),imtable.getRowCount()-1,0);
			m.setValueAt(number_of_materials.getText(),imtable.getRowCount()-1,1);
			//setValueAt는 갱신하는 명령어(넣을 문자,로우칸,콜럼칸);
			//넣을 문자를 비교하게 만들어서 그 자리에 넣어야한다.
//			imtable.repaint();
//			imtable.setModel(model);
		}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
class RoundedBorder implements Border {
    int radius;
    RoundedBorder(int radius) {
        this.radius = radius;
    }
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }
    public boolean isBorderOpaque() {
        return true;
    }
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x,y,width-1,height-1,radius,radius);
    }
}
