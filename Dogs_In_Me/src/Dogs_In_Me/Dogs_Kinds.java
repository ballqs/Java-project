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

public class Dogs_Kinds implements ActionListener {
	
	
	JFrame kinds;
	GridBagLayout gbl;
	GridBagConstraints gbc;
	JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19,
			bt20;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20;
	

	public Dogs_Kinds() {
		kinds = new JFrame("");
		kinds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kinds.setTitle("����");
	
	
		
		
		bt1 = new JButton(new ImageIcon("Dogs/��縮Ʈ����.jpg"));
		bt2 = new JButton(new ImageIcon("Dogs/�׷����Ͽ��.jpg"));
		bt3 = new JButton(new ImageIcon("Dogs/�ڽ���Ʈ.jpg"));
		bt4 = new JButton(new ImageIcon("Dogs/�޸��þ�.jpg"));

		bt5 = new JButton(new ImageIcon("Dogs/�̴Ͼ�ó �ɼ�.jpg"));
		bt6 = new JButton(new ImageIcon("Dogs/������ ���۵� ��.jpg"));
		bt7 = new JButton(new ImageIcon("Dogs/�ҵ�.jpg"));
		bt8 = new JButton(new ImageIcon("Dogs/���� �Ͽ��.jpg"));

		bt9 = new JButton(new ImageIcon("Dogs/���.jpg"));
		bt10 = new JButton(new ImageIcon("Dogs/��𿹵�.jpg"));
		bt11 = new JButton(new ImageIcon("Dogs/����.jpg"));
		bt12 = new JButton(new ImageIcon("Dogs/�˷���ĭ �ȷ���Ʈ.jpg"));

		bt13 = new JButton(new ImageIcon("Dogs/������.jpg"));
		bt14 = new JButton(new ImageIcon("Dogs/��������.jpg"));
		bt15 = new JButton(new ImageIcon("Dogs/ġ�Ϳ�.jpg"));
		bt16 = new JButton(new ImageIcon("Dogs/���ǿ�.jpg"));

		bt17 = new JButton(new ImageIcon("Dogs/�۱�.jpg"));
		bt18 = new JButton(new ImageIcon("Dogs/Ǫ��.jpg"));
		bt19 = new JButton(new ImageIcon("Dogs/�ʵ� ���дϾ�.jpg"));
		bt20 = new JButton(new ImageIcon("Dogs/�ظ���.jpg"));

		l1 = new JLabel("��縮Ʈ����", JLabel.CENTER);
		l2 = new JLabel("�׷����Ͽ��", JLabel.CENTER);
		l3 = new JLabel("����Ʈ", JLabel.CENTER);
		l4 = new JLabel("�޸��þ�", JLabel.CENTER);

		l5 = new JLabel("�̴Ͼ�ó �ɼ�", JLabel.CENTER);
		l6 = new JLabel("������ ���۵� ��", JLabel.CENTER);
		l7 = new JLabel("�ҵ�", JLabel.CENTER);
		l8 = new JLabel("���� �Ͽ��", JLabel.CENTER);

		l9 = new JLabel("���", JLabel.CENTER);
		l10 = new JLabel("��𿹵�", JLabel.CENTER);
		l11 = new JLabel("����", JLabel.CENTER);
		l12 = new JLabel("�˷���ĭ �ȷ���Ʈ", JLabel.CENTER);

		l13 = new JLabel("������", JLabel.CENTER);
		l14 = new JLabel("��������", JLabel.CENTER);
		l15 = new JLabel("ġ�Ϳ�", JLabel.CENTER);
		l16 = new JLabel("���ǿ�", JLabel.CENTER);

		l17 = new JLabel("�۱�", JLabel.CENTER);
		l18 = new JLabel("Ǫ��", JLabel.CENTER);
		l19 = new JLabel("�ʵ� ���дϾ�", JLabel.CENTER);
		l20 = new JLabel("�ظ���", JLabel.CENTER);

		bt1.setContentAreaFilled(false);
		bt2.setContentAreaFilled(false);
		bt3.setContentAreaFilled(false);
		bt4.setContentAreaFilled(false);
		bt5.setContentAreaFilled(false);
		bt6.setContentAreaFilled(false);
		bt7.setContentAreaFilled(false);
		bt8.setContentAreaFilled(false);
		bt9.setContentAreaFilled(false);
		bt10.setContentAreaFilled(false);
		bt11.setContentAreaFilled(false);
		bt12.setContentAreaFilled(false);
		bt13.setContentAreaFilled(false);
		bt14.setContentAreaFilled(false);
		bt15.setContentAreaFilled(false);
		bt16.setContentAreaFilled(false);
		bt17.setContentAreaFilled(false);
		bt18.setContentAreaFilled(false);
		bt19.setContentAreaFilled(false);
		bt20.setContentAreaFilled(false);

		gbl = new GridBagLayout();
		kinds.setLayout(gbl);

		gbc = new GridBagConstraints(); // ��GridBagLayout�� ��ġ�� ������Ʈ ��ġ ���� ���� ���� ��ü �غ�
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;

		gbAdd1(bt1, 1, 0, 1, 2);// ����,����,���γ���,���γ���
		gbAdd1(bt2, 2, 0, 1, 2);
		gbAdd1(bt3, 3, 0, 1, 2);
		gbAdd1(bt4, 4, 0, 1, 2);
		gbAdd1(bt5, 5, 0, 1, 2);
		gbAdd1(bt6, 1, 3, 1, 2);
		gbAdd1(bt7, 2, 3, 1, 2);
		gbAdd1(bt8, 3, 3, 1, 2);
		gbAdd1(bt9, 4, 3, 1, 2);
		gbAdd1(bt10, 5, 3, 1, 2);
		gbAdd1(bt11, 1, 6, 1, 2);
		gbAdd1(bt12, 2, 6, 1, 2);
		gbAdd1(bt13, 3, 6, 1, 2);
		gbAdd1(bt14, 4, 6, 1, 2);
		gbAdd1(bt15, 5, 6, 1, 2);
		gbAdd1(bt16, 1, 9, 1, 2);
		gbAdd1(bt17, 2, 9, 1, 2);
		gbAdd1(bt18, 3, 9, 1, 2);
		gbAdd1(bt19, 4, 9, 1, 2);
		gbAdd1(bt20, 5, 9, 1, 2);
		
		gbAdd1(l1, 1, 2, 1, 1);// ����,����,���γ���,���γ���
		gbAdd1(l2, 2, 2, 1, 1);
		gbAdd1(l3, 3, 2, 1, 1);
		gbAdd1(l4, 4, 2, 1, 1);
		gbAdd1(l5, 5, 2, 1, 1);
		gbAdd1(l6, 1, 5, 1, 1);
		gbAdd1(l7, 2, 5, 1, 1);
		gbAdd1(l8, 3, 5, 1, 1);
		gbAdd1(l9, 4, 5, 1, 1);
		gbAdd1(l10, 5, 5, 1, 1);
		gbAdd1(l11, 1, 8, 1, 1);
		gbAdd1(l12, 2, 8, 1, 1);
		gbAdd1(l13, 3, 8, 1, 1);
		gbAdd1(l14, 4, 8, 1, 1);
		gbAdd1(l15, 5, 8, 1, 1);
		gbAdd1(l16, 1, 11, 1, 1);
		gbAdd1(l17, 2, 11, 1, 1);
		gbAdd1(l18, 3, 11, 1, 1);
		gbAdd1(l19, 4, 11, 1, 1);
		gbAdd1(l20, 5, 11, 1, 1);
		

		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt1) {
				    kinds.dispose();
					new Golden_Retriever();
				}
			}
		});

		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt2) {
					kinds.dispose();
					 new Grey_Hound();
				}
			}
		});
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt3) {
					kinds.dispose();
					new Dachs_Hund();
				}
			}
		});
		bt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt4) {
					kinds.dispose();
					new Dalmatian();
				}
			}
		});
		bt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt5) {
					kinds.dispose();
					new Miniature_Pinscher();
				}
			}
		});
		bt6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt6) {
					kinds.dispose();
					new Belgian_Shepherd_Dog();
				}
			}
		});
		bt7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt7) {
					kinds.dispose();
					new Bulldog();
				}
			}
		});
		bt8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt8) {
					kinds.dispose();
					new Bloodhound();
				}
			}
		});
		bt9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt9) {
					kinds.dispose();
					new Beagle();
				}
			}
		});
		bt10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt10) {
					kinds.dispose();
					new Samoyed();
				}
			}
		});
		bt11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt11) {
					kinds.dispose();
					new ShihTzu();
				}
			}
		});
		bt12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt12) {
					kinds.dispose();
					new AlaskanMalamute();
				}
			}
		});
		bt13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt13) {
					kinds.dispose();
					new JindoDog();
				}
			}
		});
		bt14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt14) {
					kinds.dispose();
					new Chowchow();
				}
			}
		});
		bt15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt15) {
					kinds.dispose();
					new Chihuahua();
				}
			}
		});
		bt16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt16) {
					kinds.dispose();
					new Papillon();
				}
			}
		});
		bt17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt17) {
					kinds.dispose();
					new Pug();
				}
			}
		});
		bt18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt18) {
					kinds.dispose();
					new Poodle();
				}
			}
		});
		bt19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt19) {
					kinds.dispose();
					new FieldSpaniel();
				}
			}
		});
		bt20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt20) {
					kinds.dispose();
					new Harrier();
				}
			}
		});
		kinds.pack();
		kinds.setVisible(true);
	}

	private void gbAdd1(Component c, int x, int y, int w, int h) {

		gbc.gridx = x;
		gbc.gridy = y;
		// ���� ���� �� gridx, gridy���� 0
		gbc.gridwidth = w; // ����
		gbc.gridheight = h; // ����
		// gridwidth�� GridBagConstraints.REMAINDER ������ �����ϸ� ���� ���� ������ ���̵ǰ�,
		// gridheight�� GridBagConstraints.REMAINDER ������ �����ϸ� ���� ���� ������ ���̵˴ϴ�.
		// gridwidth�� GridBagConstraints. RELATIVE ������ �����ϸ� ���� ���� ���� ������ ������ ������ �����ϰ�,
		// gridheight�� GridBagConstraints. RELATIVE ������ �����ϸ� ���� ���� ���� ������ ������ ������ �����ϵ���
		// �մϴ�.

		gbl.setConstraints(c, gbc); // ������Ʈ�� ������Ʈ ��ġ+ũ�� ������ ���� GridBagLayout�� ��ġ
		kinds.setSize(500, 500);
		kinds.add(c);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

