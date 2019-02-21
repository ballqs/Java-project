package 프로젝트;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Project_JPanel_Login_Form extends JPanel{
	GridBagLayout gbl;
	GridBagConstraints gbc;
	JLabel Explanation,id_label,pw_label,labelNull[];
	JTextField id_TextField,pw_TextField;
	JButton Login_Button;
	public Project_JPanel_Login_Form(Project_JFrame_Login JFrame_Login){
		gbl = new GridBagLayout();
	    setLayout(gbl);
	    
	    gbc = new GridBagConstraints(); //☆GridBagLayout에 배치할 컴포넌트 위치 정보 등을 담을 객체 준비

	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    
	    gbc.weightx = 1.0;
	    gbc.weighty = 1.0;
	    
	    Explanation = new JLabel("로그인");
	    id_label = new JLabel("     ID:     ");
	    pw_label = new JLabel("     PW:     ");
	    
	    labelNull = new JLabel[6];
	    for(int i=0; i<labelNull.length; i++) {
	    	labelNull[i] = new JLabel("　　　");
	    }
	    
	    id_TextField = new JTextField(10);
	    pw_TextField = new JTextField(10);
	    pw_TextField.addKeyListener(new Project_JPanel_Login_Form_Event(Project_JPanel_Login_Form.this,JFrame_Login));
	    
	    Login_Button = new JButton("로그인");
//	    Login_Button.addActionListener(new Project_JPanel_Login_Form_Event(Project_JPanel_Login_Form.this,JFrame_Login));
	    Login_Button.addMouseListener(new Project_JPanel_Login_Form_Event(Project_JPanel_Login_Form.this,JFrame_Login));
	    Login_Button.addKeyListener(new Project_JPanel_Login_Form_Event(Project_JPanel_Login_Form.this,JFrame_Login));
	    
	    
	    gbAdd(Explanation,1,0,4,1);
	    gbAdd(id_label,1,2,2,1);
	    gbAdd(pw_label,1,3,2,1);
	    gbAdd(id_TextField,4,2,2,1);
	    gbAdd(pw_TextField,4,3,2,1);
	    gbAdd(Login_Button,2,4,1,1);
	    gbAdd(labelNull[0],0,2,1,1);
	    gbAdd(labelNull[1],0,3,1,1);
	    gbAdd(labelNull[2],0,4,1,1);
	    gbAdd(labelNull[3],1,4,1,1);
	    gbAdd(labelNull[4],3,2,1,1);
	    gbAdd(labelNull[5],3,3,1,1);
	}
	private void gbAdd(Component c, int x, int y, int w, int h) {

	      gbc.gridx = x;
	      gbc.gridy = y; 
	      //가장 왼쪽 위 gridx, gridy값은 0 
	      gbc.gridwidth  = w;	//넓이
	      gbc.gridheight = h;	//높이
	      //gridwidth를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 행의 마지막 셀이되고, 
	      //gridheight를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 열의 마지막 셀이됩니다. 
	      //gridwidth를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 행의 다음 셀부터 마지막 셀까지 차지하고, 
	      //gridheight를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 열의 다음 셀부터 마지막 셀까지 차지하도록 합니다.
	      
	      gbl.setConstraints(c, gbc); //컴포넌트를 컴포넌트 위치+크기 정보에 따라 GridBagLayout에 배치
	 
	      add(c);

	   }
}
