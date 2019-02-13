package test10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//2단계 리스너 만들기
//인터페이스 < - > 클래스와 비교, 같은 급
//클래스가 아닌 인터페이스를 상속 받을 때는 implements로 한다.
public class MyListener implements ActionListener{

	@Override//부모에 있는 메소드를 자식이 재정의 한다.
	//무조건 필수적으로 부모에 있는 것을 반드시 자식클래스에서 재정의 해줘야 하는데 그 이유는 인터페이스(implements)로 상속을 받았기 때문
	public void actionPerformed(ActionEvent e) {//구현되지 않은 메소드라서 구현시키기위해 메소드 추가!
		JButton btn = (JButton)e.getSource();//이벤트가 발생한 객체가 무엇???
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		}else {
			btn.setText("Action");
		}
	}

}
