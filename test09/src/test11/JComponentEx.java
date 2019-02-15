package test11;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComponentEx extends JFrame implements ActionListener{
	private JFrame f;
	private JPanel p;
	private JButton b1,b2,b3;
	public JComponentEx(){
		f = new JFrame();
		f.setTitle("JComponent의 공통 메소드 예제");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		
		b1 = new JButton("Magenta/Yellow Button");
		b2 = new JButton(" Disabled Button ");
		b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial",Font.ITALIC,20));
		b1.addActionListener(this);
		b2.setEnabled(false);
		b3.addActionListener(this);
		
		p.add(b1);p.add(b2);p.add(b3);
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b3) {
			f.setTitle(b3.getX()+","+b3.getY());
			b2.setEnabled(true);
		}
		if(e.getSource()==b1) {
			b2.setEnabled(false);
		}
	}

}
