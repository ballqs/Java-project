package test11;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex10JPanel extends JPanel implements MouseListener{
	private JPanel p1;
	private JLabel[] l;
	private int x,y,num=0;
	public Component Ex10JPanel() {
		p1 = new JPanel();
		p1.setLayout(null);
		l = new JLabel[10];
		for(int i=0; i<l.length; i++) {
			x = (int)(Math.random()*300+20);
			y = (int)(Math.random()*200+20);
			l[i] = new JLabel(Integer.toString(i));
			l[i].setFont(new Font("Arial",Font.PLAIN,20));
			l[i].addMouseListener(this);
			l[i].setOpaque(true);
			l[i].setForeground(Color.PINK);
			l[i].setSize(15,20);
			l[i].setLocation(x, y);
			p1.add(l[i]);
		}
		return p1;
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
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource()==l[num]) {
			if(e.getClickCount()==1) {
				l[num].setVisible(false);
				num++;
			}
		}
	}

}
