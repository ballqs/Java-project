package test11;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelEx extends JFrame{
	JFrame f;
	JPanel p;
	ImageIcon ii1;
	JLabel l;
	LabelEx(){
		f = new JFrame();
		f.setTitle("¿ÃπÃ¡ˆ");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		
		ii1 = new ImageIcon("images/155.png");
		l = new JLabel(ii1);
		
		p.add(l);
		
		f.add(p);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
	}

}
