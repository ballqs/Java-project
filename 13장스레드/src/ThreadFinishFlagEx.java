import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class RandomThread extends JPanel implements Runnable{
	boolean flag = false;
	public RandomThread() {
		setLayout(null);
		setSize(300,200);
		Thread th = new Thread(this);
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==1) {
					flag = true;
				}
			}
		});
	
		th.start();
	}
	@Override
	public void run() {
		while(true) {
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*100);
			JLabel l1 = new JLabel("java");
			l1.setSize(50, 20);
			l1.setLocation(x, y);
			add(l1);
			repaint();
			try {
				Thread.sleep(300);
				if(flag == true) {
					removeAll();
					repaint();
					return;
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadFinishFlagEx extends JFrame{
	private RandomThread th;
	public ThreadFinishFlagEx() {
		setTitle("¿¹Á¦6¹ø");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		th = new RandomThread();
		add(th);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}

}
