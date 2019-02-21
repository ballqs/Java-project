package ������Ʈ;

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
	    
	    gbc = new GridBagConstraints(); //��GridBagLayout�� ��ġ�� ������Ʈ ��ġ ���� ���� ���� ��ü �غ�

	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    
	    gbc.weightx = 1.0;
	    gbc.weighty = 1.0;
	    
	    Explanation = new JLabel("�α���");
	    id_label = new JLabel("     ID:     ");
	    pw_label = new JLabel("     PW:     ");
	    
	    labelNull = new JLabel[6];
	    for(int i=0; i<labelNull.length; i++) {
	    	labelNull[i] = new JLabel("������");
	    }
	    
	    id_TextField = new JTextField(10);
	    pw_TextField = new JTextField(10);
	    pw_TextField.addKeyListener(new Project_JPanel_Login_Form_Event(Project_JPanel_Login_Form.this,JFrame_Login));
	    
	    Login_Button = new JButton("�α���");
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
	      //���� ���� �� gridx, gridy���� 0 
	      gbc.gridwidth  = w;	//����
	      gbc.gridheight = h;	//����
	      //gridwidth�� GridBagConstraints.REMAINDER ������ �����ϸ� ���� ���� ������ ���̵ǰ�, 
	      //gridheight�� GridBagConstraints.REMAINDER ������ �����ϸ� ���� ���� ������ ���̵˴ϴ�. 
	      //gridwidth�� GridBagConstraints. RELATIVE ������ �����ϸ� ���� ���� ���� ������ ������ ������ �����ϰ�, 
	      //gridheight�� GridBagConstraints. RELATIVE ������ �����ϸ� ���� ���� ���� ������ ������ ������ �����ϵ��� �մϴ�.
	      
	      gbl.setConstraints(c, gbc); //������Ʈ�� ������Ʈ ��ġ+ũ�� ������ ���� GridBagLayout�� ��ġ
	 
	      add(c);

	   }
}
