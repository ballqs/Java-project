

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
		button = new JButton("색상 변경");
		button.addActionListener(this);
		add(button,BorderLayout.SOUTH);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("안녕하세요!", 10, 10);//텍스트,x축위치,y축위치 // 텍스트위치 설정
		g.drawLine(10, 20, 200, 20);//선을 긋는다. (x1,y1) (x2,y2)기준으로 선을 긋는다. // 선
		g.drawRect(10, 30, 300, 300);//x축위치,y축위치,가로크기,세로크기 // 네모크기 그리는 명령어
		g.setColor(color);
		g.fillRect(0, 30, 210, 220);//x축위치,y축위치,가로크기,세로크기 //색칠될 네모크기
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		color = new Color((int)(Math.random()*255.0),(int)(Math.random()*255.0),
				(int)(Math.random()*255.0));
		repaint();//색을 바꾸고나서 새로 칠할것
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
