package test11;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex08JPanel extends JPanel implements MouseListener{
	private JPanel p1,p2;
	private JRadioButton rb[];
	private String text[] = {"left","right"};
	private ButtonGroup bg;
	private JLabel l;
	private Vector<ImageIcon> v;
	private int num = 0;
	private ImageIcon ii[] = {new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/cherry.jpg")};
	public Component Ex08JPanel1() {
		p1 = new JPanel();
		rb = new JRadioButton[2];
		bg = new ButtonGroup();
		for(int i=0; i<rb.length; i++) {
			rb[i] = new JRadioButton(text[i]);
			bg.add(rb[i]);
			p1.add(rb[i]);
		}
		return p1;
		
	}
	public Component Ex08JPanel2() {
		p2 = new JPanel();
		v = new Vector<ImageIcon>();
		l = new JLabel();
		for(int i = 0; i < ii.length; i++) {
			ii[i] = new ImageIcon(ii[i].getImage().
					getScaledInstance(150, 150, Image.SCALE_DEFAULT));
			v.add(ii[i]);
		}
		//Vector의 내부의 일부 값을 가져오기 위한 명령어
		//배열같은 느낌으로
		l.setIcon(v.get(num));
		//정렬 하는 명령어!!
		l.setHorizontalAlignment(JLabel.RIGHT);
		l.addMouseListener(this);
		p2.add(l);
		return p2;
		
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
		if(e.getClickCount()==1) {
			if(rb[0].isSelected()) {
				--num;
				if(num<0) {
					num=2;
				}
				l.setIcon(v.get(num));
			}else if(rb[1].isSelected()) {
				++num;
				if(num>2) {
					num=0;
				}
				l.setIcon(v.get(num));
			}
		}
	}
}
