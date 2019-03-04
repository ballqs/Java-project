import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ThreadInterrupt extends JPanel implements Runnable{
	JLabel l1;
	JButton btn1;
	public ThreadInterrupt() {
		setLayout(new FlowLayout());
		l1 = new JLabel();
		Thread th = new Thread(this);
		btn1 = new JButton("Kill Timer");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1) {
					th.interrupt();
					btn1.setEnabled(false);
				}
			}
		});
		add(l1);
		add(btn1);
		th.start();
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			l1.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
}


public class ThreadInterruptEx extends JFrame{
	public ThreadInterruptEx() {
		setTitle("¿¹Á¦5");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new ThreadInterrupt());
		setVisible(true);
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}
