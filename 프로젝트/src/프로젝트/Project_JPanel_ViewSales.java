package 프로젝트;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Project_JPanel_ViewSales extends JPanel implements MouseListener{
	JPanel p1,p2;
	JTable viewtable;
	JScrollPane viewscroll;
	String []a = {"커피","온도","사이즈","샷"};
    String [][]b = new String[0][4];
    DefaultTableModel model,m;
    JButton pos,reset;
    Project_JFrame_ViewSales pjv;
	public Project_JPanel_ViewSales(Project_JFrame_ViewSales pjv) {
		this.pjv = pjv;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.setPreferredSize(new Dimension(300,350));
		model = new DefaultTableModel(b,a);
		viewtable = new JTable(model);
		viewscroll = new JScrollPane(viewtable);
		viewscroll.setPreferredSize(new Dimension(450,320));
		p1.add(viewscroll);
		m = (DefaultTableModel)viewtable.getModel();
//		m.insertRow(b.length, new Object[]{"d1","d2","d3","d4"});
		viewtable.updateUI();
		

		p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		pos = new JButton("POS");
		pos.addMouseListener(this);
		reset = new JButton("RESET");
		reset.addMouseListener(this);
		p2.add(pos);
		p2.add(reset);
		
		
		add(p1);
		add(p2);
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
		if(e.getSource()==pos) {
			pjv.setVisible(false);
		}
		if(e.getSource()==reset) {
			m.setNumRows(0);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
