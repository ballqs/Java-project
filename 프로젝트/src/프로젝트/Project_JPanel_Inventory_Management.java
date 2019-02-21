package 프로젝트;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Calendar;

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

public class Project_JPanel_Inventory_Management extends JPanel{
	JPanel p1,p2,p2_1,p2_2,p3;
	String []material = {"날짜","원두","우유","시럽","딸기","망고","녹차","홍차","초코"};
    String [][]material_count = new String[0][9];
    DefaultTableModel model,m;
	JTable imtable;
	JScrollPane imscroll;
	JButton materialbutton[],impos,imreset,imview_sales;
	JLabel datelabel1,datelabel2,number_explanation;
	Calendar oCalendar;
	JTextField number_of_materials;
	public Component Project_JPanel_Inventory_Management1() {
		p1 = new JPanel();
		p1.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1),"재고 관리"));
		p1.setPreferredSize(new Dimension(350,350));
		p1.setBackground(Color.white);
		
		model = new DefaultTableModel(material_count,material);
		imtable = new JTable(model);
		imscroll = new JScrollPane(imtable);
		imscroll.setPreferredSize(new Dimension(320,320));
		m = (DefaultTableModel)imtable.getModel();
		imtable.updateUI();
		p1.add(imscroll);
		return p1;
	}
	public Component Project_JPanel_Inventory_Management2() {
		p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1),"물품 주문"));
		p2.setPreferredSize(new Dimension(350,350));
		
		oCalendar = Calendar.getInstance();
		
		p2_1 = new JPanel();
		p2_1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2_1.setPreferredSize(new Dimension(330,70));
		datelabel1 = new JLabel("현재 날짜 : ");
		datelabel2 = new JLabel(Integer.toString((oCalendar.get(Calendar.MONTH)+1))+"월 "+Integer.toString(oCalendar.get(Calendar.DAY_OF_MONTH))+"일");
		number_explanation = new JLabel("/ 주문 개수 : ");
		number_of_materials = new JTextField(8);
		p2_1.add(datelabel1);
		p2_1.add(datelabel2);
		p2_1.add(number_explanation);
		p2_1.add(number_of_materials);
		
		
		p2_2 = new JPanel();
		p2_2.setLayout(new GridLayout(2,4,20,50));
		p2_2.setPreferredSize(new Dimension(330,220));
		materialbutton = new JButton[material.length-1];
		for(int i = 0; i < materialbutton.length; i++) {
			materialbutton[i] = new JButton(material[i+1]);
			materialbutton[i].setPreferredSize(new Dimension(80,100));
//			materialbutton[i].addMouseListener(l);
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
		p3.setPreferredSize(new Dimension(700,140));
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
