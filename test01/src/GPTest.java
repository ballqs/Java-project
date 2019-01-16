

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class GP extends JPanel implements ActionListener{
	JButton button;
	Color color = new Color(0,0,0);
	public GP(){
		setLayout(new BorderLayout());
		button = new JButton("���� ����");
		button.addActionListener(this);
		add(button,BorderLayout.SOUTH);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("�ȳ��ϼ���!", 10, 10);//�ؽ�Ʈ,x����ġ,y����ġ // �ؽ�Ʈ��ġ ����
		g.drawLine(10, 20, 200, 20);//���� �ߴ´�. (x1,y1) (x2,y2)�������� ���� �ߴ´�. // ��
		g.drawRect(10, 30, 300, 300);//x����ġ,y����ġ,����ũ��,����ũ�� // �׸�ũ�� �׸��� ��ɾ�
		g.setColor(color);
		g.fillRect(0, 30, 210, 220);//x����ġ,y����ġ,����ũ��,����ũ�� //��ĥ�� �׸�ũ��
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		color = new Color((int)(Math.random()*255.0),(int)(Math.random()*255.0),
				(int)(Math.random()*255.0));
		repaint();//���� �ٲٰ��� ���� ĥ�Ұ�
	}
}
public class GPTest extends JFrame{
	public GPTest(){
		setTitle("GPTest");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GP gp = new GP();
		setVisible(true);
		add(gp);
	}

	public static void main(String[] args) {
		new GPTest();
	}

}
