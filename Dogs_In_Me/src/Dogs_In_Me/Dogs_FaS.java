package Dogs_In_Me;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dogs_FaS extends JFrame implements ActionListener{
	GridBagLayout gbl;
	GridBagConstraints gbc,gbb;
	
	JButton bt1,bt2,bt3;
	JLabel 
	l1,l2,l3,l4,
	l5,l6,l7,l8,
	l9,l10,l11,l12,
	l13,l14,l15,l16,
	l17,l18,l19,l20,
	l21,l22,l23,l24,
	l25,l26,l27,l28,
	l29,l30,l31,l32,
	l33,l34,l35,l36,
	l37,l38,l39,l40,
	l41,l42,l43,l44;
	ImageIcon ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9,ii10,ii11;
	
	int i;
	
	public Dogs_FaS() {
		ImageIcon ii1 = new ImageIcon("FaS/������_�ôϾ�_��.jpg");
		ImageIcon ii2 = new ImageIcon("FaS/������_�Ľ�_�ǽ� ��.jpg");
		ImageIcon ii3 = new ImageIcon("FaS/������_��������_��.jpg");
		ImageIcon ii4 = new ImageIcon("FaS/������_����.jpg");
		ImageIcon ii5 = new ImageIcon("FaS/������_����_����.jpg");
		ImageIcon ii6 = new ImageIcon("FaS/����ó�������̾�Ƽ �ν���Ʈ LID ������� ��Ű��.jpg");
		ImageIcon ii7 = new ImageIcon("FaS/����ó�������̾�Ƽ �ν���Ʈ RBK ���ĺ��� ġŲ ��Ű��.jpg");
		ImageIcon ii8 = new ImageIcon("FaS/����ó�������̾�Ƽ �ν���Ʈ ���ĺ���(ġŲ) ��Ű��.jpg");
		ImageIcon ii9 = new ImageIcon("FaS/�����Ľ������̾�Ƽ �ν���Ʈ lidĥ����.jpg");
		ImageIcon ii10 = new ImageIcon("FaS/�����Ľ������̾�Ƽ �ν���Ʈ �䳢��� ��Ű��.jpg");
		ImageIcon ii11 = new ImageIcon("FaS/������_�ôϾ�_��.jpg");
		
		bt1 = new JButton("��");
		bt1.addActionListener(this);
		bt2 = new JButton("��");
		bt2.addActionListener(this);
		bt3 = new JButton("ó������");
		bt3.addActionListener(this);
		
		l1 = new JLabel("��ǰ�� : ������ �ôϾ� �� ORIJEN SENIOR",JLabel.CENTER);
		l2 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>źź�� �������� ������Ű�� ���� �ܹ����� ǳ���ϸ鼭,"
				+ "<br> �ǰ��� ü���� �����ϱ� ���� Į�θ��� ���� ��ǰ�Դϴ�.</p></p></html>",JLabel.CENTER);
		l3 = new JLabel("<html><p align='center'>��ǰ Ư¡ : <br><p style='border: 1px solid black;'>��ź��ȭ�� ��ǰ�� ������ �ôϾ�� ����� ������ �߰� ĥ"
				+ "<br>���� ���, �ڿ��� ������ �ڿ��� ��� ��� ������ �ھ�"
				+ "<br>���� ǳ���� �ܹ����� ���� ��� �ֽ��ϴ�.</p></p></html>",JLabel.CENTER);
		l4 = new JLabel(ii1);
		
		l5 = new JLabel("��ǰ�� : ������ �Ľ� �ǽ� �� ORIJEN SIX FISH",JLabel.CENTER);
		l6 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>�츮�� û���� ����� �ٴٿ��� �ڿ������� ���� �����ϰ� "
				+ "<br>��� �ſ� �پ��� ���� �������� ����մϴ�.</p></p></html>",JLabel.CENTER);
		l7 = new JLabel("<html><p align='center'>��ǰ Ư¡ : <br><p style='border: 1px solid black;'>������ �Ľ� �ǽ��� �� ����� �� ���ؿ��� ���� �����ϰ� "
				+ "<br>�ڿ������� ��ȹ�ϴ� ���� ���� �ٴ� ������ ���� �� ���� "
				+ "<br>���� ����Ͽ� ����µ�, �� �������� �ż��ϰ� ������ "
				+ "<br>ä�� �ż��ϰ� �츮 �ü��� ����� �ɴϴ�.</p></p></html>",JLabel.CENTER);
		l8 = new JLabel(ii2);
		
		l9 = new JLabel("��ǰ�� : ������ �������� �� ORIJEN ORIGINAL",JLabel.CENTER);
		l10 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>��� ������ ǳ���ϰ� �پ��� ���� �ܹ����� ǳ���� ��"
				+ "<br>���� �Դ� ���� ������������ �ʿ��մϴ�.</p></p></html>",JLabel.CENTER);
		l11 = new JLabel("<html><p align='center'>��ǰ Ư¡ : <br><p style='border: 1px solid black;'>������ ���������� ���� �⸥ �߰� ĥ���� ���,�ڿ���  "
				+ "<br>������ �ڿ��� ����� �ż��ϰ� ����� �ͼ� ���� �� ���� "
				+ "<br>���� ����Ͽ� ����µ�, ���������� �ھ���� ǳ���� �� "
				+ "<br>���� ������ ����ϹǷ� ��� ����ҵ��� õ�������� ������<br>�� �����մϴ�.</p></p></html>",JLabel.CENTER);
		l12 = new JLabel(ii3);
		
		l13 = new JLabel("��ǰ�� : ������ ���� ORIJEN PUPPY",JLabel.CENTER);
		l14 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>������ ���������� �� ������� ���� ��ü�� �������ϴ�."
				+ "<br>�׷��� ���� ������ ������ �Ծ�� �մϴ�.</p></p></html>",JLabel.CENTER);
		l15 = new JLabel("<html><p align='center'>��ǰ Ư¡ : <br><p style='border: 1px solid black;'>������ ���Ǵ� �ھ���� ǳ���� �� ���� ������ ����ϴ� "
				+ "<br>���� �⸥ �߰� ĥ���� ���,�ڿ��� ������ �ڿ��� �� ��� "
				+ "<br>�� �������� �ż��� ��⿡�� ������ õ�� �ܹ����� ������ "
				+ "<br>�����մϴ�.</p></p></html>",JLabel.CENTER);
		l16 = new JLabel(ii4);
		
		l17 = new JLabel("��ǰ�� : ������ ���� ���� ORIJEN PUPPY LARGE",JLabel.CENTER);
		l18 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>���������� �������� �����ϱ� ���� �ܹ����� ǳ���ϸ鼭��,"
				+ "<br> �ǰ��� ü���� �����ϱ� ���� Į�θ��� �����߽��ϴ�.</p></p></html>",JLabel.CENTER);
		l19 = new JLabel("<html><p align='center'>��ǰ Ư¡ : <br><p style='border: 1px solid black;'>�ھ���� ǳ���� �� ���� ������ ���� �⸥ �߰� ĥ���� "
				+ "<br>���, �ڿ��� ������ �ڿ��� �� ������� ������ �ܹ����� "
				+ "<br>�˳��� ��� �ִ� ������ ���� ������, ���� ������ ������"
				+ "<br>�� ���� Į�θ��� �̳׶��� Ư���ϰ� �����Ǿ� �ֽ��ϴ�.</p></p></html>",JLabel.CENTER);
		l20 = new JLabel(ii5);
		
		l21 = new JLabel("��ǰ�� : ����ó�������̾�Ƽ �ν���Ʈ LID ������� ��Ű��",JLabel.CENTER);
		l22 = new JLabel("<html><p align='center'>���� �� : <br>MADE IN USA<br><br>"
				+ "�˷����� �Ǻΰ����� ���� ������</p></html>",JLabel.CENTER);
		l23 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>�ּ����� �ʼ����� ��ῡ�� ���� ������ ����.LID�ν���Ʈ�� ���簡�� ���� ��ȭ�� �� �Ǵ� ������ �����ϰ� �����Ͽ� ��������ϴ�. ���� �������� �ݷ����� ��ȭ�� �� �Ǿ� �ǰ����� ���� ǳ���� ������ ���� �Ĵ��� ��� �� �ְ� �Ǿ����ϴ�.</p></p></html>",JLabel.CENTER);
		l24 = new JLabel(ii6);
		
		l25 = new JLabel("��ǰ�� : ����ó�������̾�Ƽ �ν���Ʈ RBK ���ĺ��� ġŲ ��Ű��",JLabel.CENTER);
		l26 = new JLabel("<html><p align='center'>���� �� : <br>MADE IN USA<br><br>"
				+ "�ְ��� �ǰ����� �����ϴ� �׷��� ����</p></html>",JLabel.CENTER);
		l27 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>�ν���Ʈ �κν�Ʈ�� ��� Ű��� ������� ���� �˰��̸� �� ������ ��ҽ��ϴ�. �������� �ݷ����� Ȱ���ϰ� ���� ����� ������ ��� ��������. ���� ����̸� ���� ������ �����ϰ� �ǰ��� ���� ������� ���� ���� ������� ���ص帳�ϴ�.</p></p></html>",JLabel.CENTER);
		l28 = new JLabel(ii7);
		
		l29 = new JLabel("��ǰ�� : ����ó�������̾�Ƽ �ν���Ʈ ���ĺ���(ġŲ) ��Ű��",JLabel.CENTER);
		l30 = new JLabel("<html><p align='center'>���� �� : <br>MADE IN USA<br><br>"
				+ "�ְ��� �ǰ����� �����ϴ� �׷��� ����</p></html>",JLabel.CENTER);
		l31 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>�ν���Ʈ ���ĺ����� �ְ��� �������� �Ŀ��� ������Ű�� ��ܹ�, ���, ���۷��� �Ĵ��Դϴ�. �� ���� ���� ����̵��� �߻����� �Ծ��� �ǰ��� �Ļ��� ��¥ �߰��, ������ ǳ���� ä��, ���ϵ�� �����ϰ� ������ ������ ���߾� ���� �Ĵ��Դϴ�. ��ó�� �����ϰ�, ������������ �ְ߿��� �� �´� ���ĺ����� ����е��� ���� ��ȭ�� �ߵǾ� �ǰ��ϰ� �� �� �� �ֵ��� �� �ݴϴ�. ������ �屸�� �´� �Ļ�� �ǻ��ϰ� �ູ�� ���� ������ �� �ֵ��� ���� �˸´� ����а� �������� �����ּ���.</p></p></html>",JLabel.CENTER);
		l32 = new JLabel(ii8);
		
		l33 = new JLabel("��ǰ�� : �����Ľ������̾�Ƽ �ν���Ʈ lidĥ����",JLabel.CENTER);
		l34 = new JLabel("<html><p align='center'>���� �� : <br>MADE IN USA<br><br>"
				+ "�˷����� �Ǻΰ����� ���� ������</p></html>",JLabel.CENTER);
		l35 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>�ּ����� �ʼ����� ��ῡ�� ���� ������ ����. LID�ν���Ʈ�� ���簡�� ���� ��ȭ�� �� �Ǵ� ������ �����ϰ� �����Ͽ� ��������ϴ�. ���� �������� �ݷ����� ��ȭ�� �� �Ǿ� �ǰ����� ���� ǳ���� ������ ���� �Ĵ��� ��� �� �ְ� �Ǿ����ϴ�.</p></p></html>",JLabel.CENTER);
		l36 = new JLabel(ii9);
		
		l37 = new JLabel("��ǰ�� : �����Ľ������̾�Ƽ �ν���Ʈ �䳢��� ��Ű��",JLabel.CENTER);
		l38 = new JLabel("<html><p align='center'>���� �� : <br>MADE IN USA<br><br>"
				+ "�ְ��� �ǰ����� �����ϴ� �׷��� ����</p></html>",JLabel.CENTER);
		l39 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>�ν���Ʈ �䳢��� �� Ű���� �ְ��� �������� �Ŀ��� ������Ű�� ��ܹ�, ���, ���۷��� �Ĵ��Դϴ�. �� ���� ���� ����̵��� �߻����� �Ծ��� �ǰ��� �Ļ��� ��¥ �䳢���, ������ ǳ���� ä��, ���ϵ�� �����ϰ� ������ ������ ���߾� ���� �Ĵ��Դϴ�. ��ó�� �����ϰ� ������������ �ְ߿��� �� �´� ���ĺ����� ���� �е��� ���� ��ȭ�� �ߵǾ� �ǰ��ϰ� �� �� �� �ֵ��� ���ݴϴ�. ������ �屸�� �´� �Ļ��, �ǰ��ϰ� �ູ�� ���� ������ �� �ֵ��� ���� �˸´� ����а� �������� �����ּ���.</p></p></html>",JLabel.CENTER);
		l40 = new JLabel(ii10);
		
		l41 = new JLabel("��ǰ�� : ������ �ôϾ� �� ORIJEN SENIOR",JLabel.CENTER);
		l42 = new JLabel("<html><p align='center'>��ǰ ���� : <br><p style='border: 1px solid black;'>źź�� �������� ������Ű�� ���� �ܹ����� ǳ���ϸ鼭,<br> �ǰ��� ü���� �����ϱ� ���� Į�θ��� ���� ��ǰ�Դϴ�.</p></p></html>",JLabel.CENTER);
		l43 = new JLabel("<html><p align='center'>��ǰ Ư¡ : <br><p style='border: 1px solid black;'>��ź��ȭ�� ��ǰ�� ������ �ôϾ�� ����� ������ �߰� ĥ<br>���� ���, �ڿ��� ������ �ڿ��� ��� ��� ������ �ھ�<br>���� ǳ���� �ܹ����� ���� ��� �ֽ��ϴ�.</p></p></html>",JLabel.CENTER);
		l44 = new JLabel(ii11);
		
		gbl = new GridBagLayout();
	    setLayout(gbl);
	    
	    gbc = new GridBagConstraints(); //��GridBagLayout�� ��ġ�� ������Ʈ ��ġ ���� ���� ���� ��ü �غ�

	    gbc.fill = GridBagConstraints.BOTH;
	    
	    gbb = new GridBagConstraints(); //��GridBagLayout�� ��ġ�� ������Ʈ ��ġ ���� ���� ���� ��ü �غ�

	    gbb.fill = GridBagConstraints.HORIZONTAL;
	    
	    gbc.weightx = 1.0;
	    gbc.weighty = 1.0;
	    
	    gbb.weightx = 1.0;
	    gbb.weighty = 1.0;
	    
	    gbbAdd(bt1, 0, 0, 1, 2);
	    gbAdd(l4, 1, 0, 2, 2);
	    gbbAdd(bt2, 3, 0, 1, 2);
	    gbAdd(l1, 0, 3, 4, 1);
	    gbAdd(l2, 0, 4, 4, 1);
	    gbAdd(l3, 0, 5, 4, 1);
	    gbbAdd(bt3, 0, 6, 4, 1);
	    
	    
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
	
	private void gbbAdd(Component c, int x, int y, int w, int h) {

	      gbb.gridx = x;
	      gbb.gridy = y; 
	      //���� ���� �� gridx, gridy���� 0 
	      gbb.gridwidth  = w;	//����
	      gbb.gridheight = h;	//����
	      //gridwidth�� GridBagConstraints.REMAINDER ������ �����ϸ� ���� ���� ������ ���̵ǰ�, 
	      //gridheight�� GridBagConstraints.REMAINDER ������ �����ϸ� ���� ���� ������ ���̵˴ϴ�. 
	      //gridwidth�� GridBagConstraints. RELATIVE ������ �����ϸ� ���� ���� ���� ������ ������ ������ �����ϰ�, 
	      //gridheight�� GridBagConstraints. RELATIVE ������ �����ϸ� ���� ���� ���� ������ ������ ������ �����ϵ��� �մϴ�.
	      
	      gbl.setConstraints(c, gbb); //������Ʈ�� ������Ʈ ��ġ+ũ�� ������ ���� GridBagLayout�� ��ġ
	 
	      add(c);

	   }


	@Override
	public void actionPerformed(ActionEvent e) {
		if(i>9) {
			i = -1;
		}
		if(e.getSource()==bt2) {
			i++;
			if(i == 0){
				l1.setText(l41.getText());
				l2.setText(l42.getText());
				l3.setText(l43.getText());
				l4.setIcon(l44.getIcon());
			}else if(i == 1) {
				l1.setText(l5.getText());
				l2.setText(l6.getText());
				l3.setText(l7.getText());
				l4.setIcon(l8.getIcon());
			}else if(i == 2){
				l1.setText(l9.getText());
				l2.setText(l10.getText());
				l3.setText(l11.getText());
				l4.setIcon(l12.getIcon());
			}else if(i == 3){
				l1.setText(l13.getText());
				l2.setText(l14.getText());
				l3.setText(l15.getText());
				l4.setIcon(l16.getIcon());
			}else if(i == 4){
				l1.setText(l17.getText());
				l2.setText(l18.getText());
				l3.setText(l19.getText());
				l4.setIcon(l20.getIcon());
			}else if(i == 5){
				l1.setText(l21.getText());
				l2.setText(l22.getText());
				l3.setText(l23.getText());
				l4.setIcon(l24.getIcon());
			}else if(i == 6){
				l1.setText(l25.getText());
				l2.setText(l26.getText());
				l3.setText(l27.getText());
				l4.setIcon(l28.getIcon());
			}else if(i == 7){
				l1.setText(l29.getText());
				l2.setText(l30.getText());
				l3.setText(l31.getText());
				l4.setIcon(l32.getIcon());
			}else if(i == 8){
				l1.setText(l33.getText());
				l2.setText(l34.getText());
				l3.setText(l35.getText());
				l4.setIcon(l36.getIcon());
			}else if(i == 9){
				l1.setText(l37.getText());
				l2.setText(l38.getText());
				l3.setText(l39.getText());
				l4.setIcon(l40.getIcon());
			}
		}
		
		if(i<0) {
			i = 10;
		}
		
		if(e.getSource()==bt1) {
			i--;
			if(i == 0){
				l1.setText(l41.getText());
				l2.setText(l42.getText());
				l3.setText(l43.getText());
				l4.setIcon(l44.getIcon());
			}else if(i == 1) {
				l1.setText(l5.getText());
				l2.setText(l6.getText());
				l3.setText(l7.getText());
				l4.setIcon(l8.getIcon());
			}else if(i == 2){
				l1.setText(l9.getText());
				l2.setText(l10.getText());
				l3.setText(l11.getText());
				l4.setIcon(l12.getIcon());
			}else if(i == 3){
				l1.setText(l13.getText());
				l2.setText(l14.getText());
				l3.setText(l15.getText());
				l4.setIcon(l16.getIcon());
			}else if(i == 4){
				l1.setText(l17.getText());
				l2.setText(l18.getText());
				l3.setText(l19.getText());
				l4.setIcon(l20.getIcon());
			}else if(i == 5){
				l1.setText(l21.getText());
				l2.setText(l22.getText());
				l3.setText(l23.getText());
				l4.setIcon(l24.getIcon());
			}else if(i == 6){
				l1.setText(l25.getText());
				l2.setText(l26.getText());
				l3.setText(l27.getText());
				l4.setIcon(l28.getIcon());
			}else if(i == 7){
				l1.setText(l29.getText());
				l2.setText(l30.getText());
				l3.setText(l31.getText());
				l4.setIcon(l32.getIcon());
			}else if(i == 8){
				l1.setText(l33.getText());
				l2.setText(l34.getText());
				l3.setText(l35.getText());
				l4.setIcon(l36.getIcon());
			}else if(i == 9){
				l1.setText(l37.getText());
				l2.setText(l38.getText());
				l3.setText(l39.getText());
				l4.setIcon(l40.getIcon());
			}
			
		}
		if(e.getSource()==bt3) {
			dispose();
			Dogs_Main_Menu dmm = new Dogs_Main_Menu();
		}
		
	}
	
}

