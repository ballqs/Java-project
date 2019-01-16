

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.DateFormatter;

class SignalLamp2{
	private int sign =0;
	private String loc;
	public String getLoc() {
		return loc;
	}
	public void setLoc(String l) {
		this.loc = l;
	}
	public void setSign(int s) {
		this.sign = s;
	}
	public int proSign(){
		return sign = sign % 3;
	}
}
class SignalForm2 extends JFrame implements ActionListener,MouseListener{
	SignalLamp2 s2 = new SignalLamp2();
	JFrame f1 = new JFrame();
	JPanel p;
	JLabel l1,l2,l3;
	JButton b,b2;
	JFormattedTextField datefield;
	JComboBox ssList;
	String[] ss = {"부산","서울","제주"};
	
	public SignalForm2(){
		f1.setSize(100, 200);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));//세로로 나열하겠다.
		l1 = new JLabel("Color");
		l1.setAlignmentX(l1.CENTER_ALIGNMENT);//위치 가운데로 설정!
		l1.setOpaque(true);//이게 있어야 배경색깔을 넣을수 있다.
		
		
		l2 = new JLabel("mouse get");
		l2.setAlignmentX(l2.CENTER_ALIGNMENT);
		l2.setOpaque(true);
		l2.addMouseListener(this);
		
		
		l3 = new JLabel("지역");
		l3.setOpaque(true);
		l3.setAlignmentX(l3.CENTER_ALIGNMENT);
		
		
		ssList = new JComboBox(ss);
		ssList.setAlignmentX(ssList.CENTER_ALIGNMENT);
		ssList.setSelectedIndex(0);//초기값 설정
		ssList.addActionListener(this);
		
		
		datefield = new JFormattedTextField(new DateFormatter());
		datefield.setValue(new Date());//utl로 import 시킨다. 현재 날짜를 가져온다.
		
		
		b = new JButton("시작");
		b.setAlignmentX(b.CENTER_ALIGNMENT);
		b.addActionListener(this);
		b2 = new JButton("중지");
		b2.setAlignmentX(b2.CENTER_ALIGNMENT);
		b2.addActionListener(this);
		
		p.add(l1);
		p.add(b);p.add(b2);
		p.add(ssList);
		p.add(l3);
		p.add(datefield);
		p.add(l2);
		f1.add(p);
		f1.pack();
		f1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
			if(s2.proSign()==0){
				l1.setText("빨강");
				l1.setBackground(Color.RED);//글자 배경색상 바꾸는 명령어
				l1.setForeground(Color.WHITE);//글자색 바꾸는 명령어
				s2.setSign(1);//si를 1로 바꿔서 밑단계로 가게 만든다.
			}else if(s2.proSign()==1){
				l1.setText("노랑");
				l1.setBackground(Color.YELLOW);
				l1.setForeground(Color.BLACK);
				s2.setSign(2);
			}else if(s2.proSign()==2){
				l1.setText("연두");
				l1.setBackground(Color.GREEN);
				l1.setForeground(Color.BLACK);
				s2.setSign(0);
			}
		}else if(e.getSource()==b2){
			if(s2.proSign()==0 || s2.proSign()==1 || s2.proSign()==2){
				l1.setText("Color");
				l1.setBackground(null);
				l1.setForeground(Color.BLACK);
				s2.setSign(0);
			}
		}
		
		if(e.getSource()==ssList){
			if(ssList.getSelectedIndex()==0){
				l3.setBackground(Color.ORANGE);
				l3.setText(ss[0]);
			}else if(ssList.getSelectedIndex()==1){
				l3.setBackground(Color.LIGHT_GRAY);
				l3.setText(ss[1]);
			}else if(ssList.getSelectedIndex()==2){
				l3.setBackground(Color.PINK);
				l3.setText(ss[2]);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {//동작
		if(e.getSource()==l2){
			l1.setBackground(Color.ORANGE);
			l1.setForeground(Color.GREEN);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {//빠져나갈때 쓰는
		if(e.getSource()==l2){
			l1.setBackground(Color.black);
		}
	}
}
public class SignalLampTest2 {

	public static void main(String[] args) {
		new SignalForm2();

	}

}
