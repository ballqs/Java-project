import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame implements Runnable{
	JLabel l1;
	JLabel l2;
	JLabel l3;
	int delay;
	public FlickeringLabelEx(int delay) {
		this.delay = delay;
		setTitle("¿¹Á¦3");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		l1 = new JLabel("±ôºý");
		l2 = new JLabel("¾È±ôºý");
		l3 = new JLabel("¿©±âµµ ±ôºý");
		l1.setFont(new Font("Gothic",Font.ITALIC,20));
		l2.setFont(new Font("Gothic",Font.ITALIC,20));
		l3.setFont(new Font("Gothic",Font.ITALIC,20));
		l1.setOpaque(true);
		l3.setOpaque(true);
		c.add(l1);c.add(l2);c.add(l3);
		
		Thread th = new Thread(this);
		
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) {
		new FlickeringLabelEx(500);
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			try {
				
				if(n == 0) {
					l1.setBackground(Color.yellow);
					l3.setBackground(Color.YELLOW);
				}else if(n == 1) {
					l1.setBackground(Color.green);
					l3.setBackground(Color.green);
				}
				if(n == 0) {
					n = 1;
				}else {
					n = 0;
				}
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}

}
