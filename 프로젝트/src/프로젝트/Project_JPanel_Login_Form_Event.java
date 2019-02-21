package 프로젝트;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//public class Project_JPanel_Login_Form_Event implements ActionListener,KeyListener{
public class Project_JPanel_Login_Form_Event implements MouseListener,KeyListener{
	Project_JPanel_Login_Form Panel_Login;
	Project_JFrame_Login JFrame_Login;
	public Project_JPanel_Login_Form_Event(Project_JPanel_Login_Form Panel_Login , Project_JFrame_Login JFrame_Login) {
		this.Panel_Login = Panel_Login;
		this.JFrame_Login = JFrame_Login;
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==Panel_Login.Login_Button) {
//			if(Panel_Login.id_TextField.getText().equals("ballqs") && Panel_Login.pw_TextField.getText().equals("1234")) {
//				JFrame_Login.setVisible(false);
//				new Project_JFrame_POS();
//			}else {
//				new Project_JFrame_Failure();
//			}
//		}
//	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			if(Panel_Login.id_TextField.getText().equals("ballqs") && Panel_Login.pw_TextField.getText().equals("1234")) {
				JFrame_Login.setVisible(false);
				new Project_JFrame_POS();
			}else {
				new Project_JFrame_Failure();
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==Panel_Login.Login_Button) {
			if(Panel_Login.id_TextField.getText().equals("ballqs") && Panel_Login.pw_TextField.getText().equals("1234")) {
				JFrame_Login.setVisible(false);
				new Project_JFrame_POS();
			}else {
				new Project_JFrame_Failure();
			}
		}
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
}
