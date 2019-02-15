package Dogs_In_Me;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Golden_Retriever {
	JFrame Golden_Retriever;

	public Golden_Retriever() {
		Golden_Retriever = new JFrame();
		Golden_Retriever.setTitle("��縮Ʈ���� ����");
		Golden_Retriever.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Golden_Retriever.dispose();
				new Harrier();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Golden_Retriever.dispose();
				new Grey_Hound();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Golden_Retriever.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/��縮Ʈ����.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ����");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 29~34kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 56~61cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" Ȳ�ݻ�");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "£�� Ȳ�ݻ��� ���� ���� �Ƹ��ٿ� ����,\r\n<br>" + "�� �� �ӿ����� �ߵ� �� �ֵ��� �� ���� ���� �� �ְ�<br>"
						+ "�չ� ���ʿ��� ������� �� �ִ�.<br>" + "�����̳� �޹��� ����� ����, ������ �Ʒ��� �鿡�� ���� �ִ�<br>" + "�Ӹ��� �����ϰ� �д�. <br>"
						+ "�ֵ��̵� �а� ��� �������̸� �ε巯�� ������ �ش�.<br>" + "������ �¼��ϸ� ���Ӽ��� �������� ���ɵ� ����<br>"
						+ "������, �͵��� ������ �����̳� �̱�, �Ϻ����� �αⰡ �ִ�.<br>"
						+ "�����ϰ� ü���� ���� ����� ������ ���� �ְ� ȣ��ɵ� ����.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Golden_Retriever.add(p1, BorderLayout.NORTH);
		Golden_Retriever.add(p2, BorderLayout.CENTER);
		Golden_Retriever.add(p3, BorderLayout.SOUTH);
		Golden_Retriever.pack();
		Golden_Retriever.setResizable(false);
		Golden_Retriever.setVisible(true);
		


	}
}

class Grey_Hound {
	JFrame Grey_Hound;

	public Grey_Hound() {
		Grey_Hound = new JFrame();
		Grey_Hound.setTitle("�׷����Ͽ�� ����");
		Grey_Hound.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Grey_Hound.dispose();
				new Golden_Retriever();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Grey_Hound.dispose();
				new Dachs_Hund();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Grey_Hound.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/�׷����Ͽ��.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ����Ʈ");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 23~32kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 68~76cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ������,���,������,Ȳ����,ȸ���");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "����ϰ� �����ϸ�, �ü� 70������ �޸� �� �ִ� �������� ��������,\r\n<br>"
						+ "�Ӹ��� ���� ���� ���, ���� �Ϳ� ���� �� ������ ������ ���� �д�.<br>" + "������ ������� ������ �ְ�, ���� ���� �ֵ��̴� ���� ���ô�.<br>"
						+ "����� ���, �ʹ� �۰� ������, ���ÿ��� �������� ���� ������,<br>" + "�����ϰ� �Ǹ� ���� �ݵ��ϰ� ������ ���� ����.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Grey_Hound.add(p1, BorderLayout.NORTH);
		Grey_Hound.add(p2, BorderLayout.CENTER);
		Grey_Hound.add(p3, BorderLayout.SOUTH);
		Grey_Hound.pack();
		Grey_Hound.setResizable(false);
		Grey_Hound.setVisible(true);

	}
}

class Dachs_Hund {
	JFrame Dachs_Hund;

	public Dachs_Hund() {
		Dachs_Hund = new JFrame();
		Dachs_Hund.setTitle("�ڽ���Ʈ ����");
		Dachs_Hund.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dachs_Hund.dispose();
				new Grey_Hound();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dachs_Hund.dispose();
				new Dalmatian();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dachs_Hund.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/�ڽ���Ʈ.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ����");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 5~8kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 23~27cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ����,������,Ȳ����,��ο��");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "������ Ÿ�����̸� �������� ����Ǿ� �ִ�.\r\n<br>" + "�մٸ��� ª�� �޴ٸ��� ��� �������̴�.<br>"
						+ "������ ������ ���ϸ� �밨�ϰ� ��ø�ϴ�.<br>" + "������ ����ϰ� �峭������� Ȱ���ϴ� ���� �����Ѵ�.<br>"
						+ "�콺�ν����� �ܸ�ʹ� �޸� �Ÿ��ϰ� ������ ������� ��Ư�� ���ָ� ���δ�.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Dachs_Hund.add(p1, BorderLayout.NORTH);
		Dachs_Hund.add(p2, BorderLayout.CENTER);
		Dachs_Hund.add(p3, BorderLayout.SOUTH);
		Dachs_Hund.pack();
		Dachs_Hund.setResizable(false);
		Dachs_Hund.setVisible(true);

	}
}

class Dalmatian {
	JFrame Dalmatian;

	public Dalmatian() {
		Dalmatian = new JFrame();
		Dalmatian.setTitle("�޸��þ� ����");
		Dalmatian.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dalmatian.dispose();
				new Dachs_Hund();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dalmatian.dispose();
				new Miniature_Pinscher();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dalmatian.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/�޸��þ�.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ��������");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 20~29kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 56~61cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" �� �������� ������ �Ǵ� �ϰ����� ����");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "��� �׸��� ������ �׷��� ���� ������ ���� �Ǿ���,\r\n<br>" + "�������� ������ �ݷ���(����̳)���� ������ �����Ͽ�����,<br>"
						+ "��Ż���� ������Ʈ���ƿ����� ��ɰ��μ� ū���� �Ͽ���.<br>" + "���������� ��ġ����(coach dog:ة��̳)��� �Ͽ�<br>"
						+ "������ Ż ���� �¸��� ��, �Ǵ� ������ ������ ���Ͽ� ������ �ٳ�ٰ� �Ѵ�.<br>"
						+ "����� ������ ��� �Ǵ� ������ �ٵϾ� ���� �ѷ��� ������� �¸��� �Ƹ���� ��ġ�Ǿ� �ִ� ���� Ư¡�̸�,<br>"
						+ "������ ������ �����Ϳ� ����ϴ�. ������ Ȱ���ϰ� ����ϸ� ������ ����.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Dalmatian.add(p1, BorderLayout.NORTH);
		Dalmatian.add(p2, BorderLayout.CENTER);
		Dalmatian.add(p3, BorderLayout.SOUTH);
		Dalmatian.pack();
		Dalmatian.setResizable(false);
		Dalmatian.setVisible(true);

	}
}

class Miniature_Pinscher {
	JFrame Miniature_Pinscher;

	public Miniature_Pinscher() {
		Miniature_Pinscher = new JFrame();
		Miniature_Pinscher.setTitle("�̴Ͼ�ó �ɼ� ����");
		Miniature_Pinscher.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Miniature_Pinscher.dispose();
				new Dalmatian();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Miniature_Pinscher.dispose();
				new Belgian_Shepherd_Dog();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Miniature_Pinscher.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/�̴Ͼ�ó �ɼ�.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ����");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 4~4.5kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 25~32cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ������,������,Ȳ����");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�̴Ͼ�ó �ɼŴ� ���������� ������ �� ������ ưư�ϸ�, �ٺ�����, ª�� ��������, �Ų��� ���� ���̴�.\r\n<br>"
						+ "�״� ������ ���� �� �����Ǿ���, �ڽŸ����ϸ�, Ȱ���� �ְ�, ����ϴ�.<br>" + "���� ���� Ư¡�� �¸��� ���� ���� ����, �η����� �𸣴� Ȱ��,<br>"
						+ "������ �ڽŰ��� ����, ���ռ��� ����̴�.<br>" + "�̴����� �� ū �ɼ������� ���� ����� ����� ���� �ִ� ���� �Ѿ�,<br>"
						+ "��ȣ���ɰ� �����ϰ� Ȯ���� ������ �ѷ��ؼ� ���� ħ���ڰ� ������ �߸��� ������� ���� �ִ�.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Miniature_Pinscher.add(p1, BorderLayout.NORTH);
		Miniature_Pinscher.add(p2, BorderLayout.CENTER);
		Miniature_Pinscher.add(p3, BorderLayout.SOUTH);
		Miniature_Pinscher.pack();
		Miniature_Pinscher.setResizable(false);
		Miniature_Pinscher.setVisible(true);

	}
}

class Belgian_Shepherd_Dog {
	JFrame Belgian_Shepherd_Dog;

	public Belgian_Shepherd_Dog() {
		Belgian_Shepherd_Dog = new JFrame();
		Belgian_Shepherd_Dog.setTitle("������ ���۵� �� ����");
		Belgian_Shepherd_Dog.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Belgian_Shepherd_Dog.dispose();
				new Miniature_Pinscher();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Belgian_Shepherd_Dog.dispose();
				new Bulldog();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Belgian_Shepherd_Dog.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/������ ���۵� ��.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ���⿡");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 22~30kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 56~62cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ������,���� Ȳ����,���� ������");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�Ϲ������� ������ �� �����ִ� �ܸ� źź�ϰ� ���� ������ ���� �������̴�.\r\n<br>"
						+ "�̸��� �����ϸ� �ֵ��̴� �� ���̴�. �ڳ����� ������ �ֵ��̰� ���þ�����.<br>" + "�Ƹ������ ���� �����̸� �������� �˴�. �ʹ� �۰� ���� �����ϴ�.<br>"
						+ "�̻��� ưư�ϸ� ������(scissors bite, ������ �մϰ� �Ʒ����� �մϺ��� ���� �տ��� �¹����� ����)�� ��찡 ����.<br>"
						+ "���� ���ð� ���. ������ �� ���� �þ����� �����̱� �����ϸ� ������ �����Ѵ�.<br>" + "���� ���� ���� ���´�.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Belgian_Shepherd_Dog.add(p1, BorderLayout.NORTH);
		Belgian_Shepherd_Dog.add(p2, BorderLayout.CENTER);
		Belgian_Shepherd_Dog.add(p3, BorderLayout.SOUTH);
		Belgian_Shepherd_Dog.pack();
		Belgian_Shepherd_Dog.setResizable(false);
		Belgian_Shepherd_Dog.setVisible(true);

	}
}

class Bulldog {
	JFrame Bulldog;

	public Bulldog() {
		Bulldog = new JFrame();
		Bulldog.setTitle("�ҵ� ����");
		Bulldog.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bulldog.dispose();
				new Belgian_Shepherd_Dog();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bulldog.dispose();
				new Bloodhound();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bulldog.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/�ҵ�.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ����");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 23~25kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 30~41cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ������,Ȳ����");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�ҵ����� ���������μ� �Ų��� �а� �߷��� ������\r\n<br>" + "�����ϰ� ª�� ���� �Ӹ��� ���� ����� ưư�� ������ ���� �����̴�.<br>"
						+ "�ܰ��� �µ��� ���� �߽��ϸ� �������̰� ���� �� �λ��� �ش�.<br>" + "��ǰ�� ��ܷ��� ������ ģ���ϰ� ħ���ϰ� �밨�ϳ� �糳�ų� ǥ���������� �ʴ�.<br>"
						+ "�ൿ�� �����Ͽ� ������ �ִ�. �̷� Ư������ ǥ���� �ൿ�� ���� �����δ�.<br>" + "�ҵ����� ���ݼ��� ���� ���������� ȭ�� ���� ���� �����ؾ� �ϹǷ�<br>"
						+ "��� �������� �����Ʒ��� �صδ� ���� ����. ���� ���� �ܵ����̶� �ڸ� ���� ���.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Bulldog.add(p1, BorderLayout.NORTH);
		Bulldog.add(p2, BorderLayout.CENTER);
		Bulldog.add(p3, BorderLayout.SOUTH);
		Bulldog.pack();
		Bulldog.setResizable(false);
		Bulldog.setVisible(true);

	}
}

class Bloodhound {
	JFrame Bloodhound;

	public Bloodhound() {
		Bloodhound = new JFrame();
		Bloodhound.setTitle("�����Ͽ�� ����");
		Bloodhound.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bloodhound.dispose();
				new Bulldog();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bloodhound.dispose();
				new Beagle();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bloodhound.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/���� �Ͽ��.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ���⿡");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 41~50kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 63~69cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ������,���� ����");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "���� �Ͽ��� ������ �پ �İ��� ������ �ִ�.\r\n<br>"
						+ "�̷��� ���� �ɷ��� 600�� �̻��� �������� ü���� �����Ͽ���.��� �� ���� ������ �������̴�.<br>" + "��� �� ���� Ȯ���� �����ڵ��� �ѾƿԴٰ� �ص�<br>"
						+ "���� �Ͽ��� ��ȭ�� �Ҽ����� ó�� �糪�� �̹����� ���� ���� �ƴϴ�.<br>"
						+ "���ó����� �� ������ ������ ��̳� ���� ���� ��갴���� ã�� �� ���Եȴ�.<br></p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Bloodhound.add(p1, BorderLayout.NORTH);
		Bloodhound.add(p2, BorderLayout.CENTER);
		Bloodhound.add(p3, BorderLayout.SOUTH);
		Bloodhound.pack();
		Bloodhound.setResizable(false);
		Bloodhound.setVisible(true);

	}
}

class Beagle {
	JFrame Beagle;

	public Beagle() {
		Beagle = new JFrame();
		Beagle.setTitle("��� ����");
		Beagle.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Beagle.dispose();
				new Bloodhound();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Beagle.dispose();
				new Samoyed();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Beagle.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/���.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ����");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 15~20kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 3~40cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ����� Ȳ��,����,������,������");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�۰� �߹��� ü���� �ܴ��� �������� ���� ���� �ִ� ��ɰ��� ���� �䳢��ɿ� �ַ� �����ٰ� �Ѵ�.\r\n<br>"
						+ "�İ��� �پ�� �ߴ��� �ֱ� ���� Ž���� �� �м�ǰ Ž�������ε� ���̰� �ִ�.<br>"
						+ "����ϰ� ������ ���̴� �Ϳ��� �ܸ�� �Բ� ��ȭ �������ǡ��� �𵨷ε� �����ϴ�.<br></p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Beagle.add(p1, BorderLayout.NORTH);
		Beagle.add(p2, BorderLayout.CENTER);
		Beagle.add(p3, BorderLayout.SOUTH);
		Beagle.pack();
		Beagle.setResizable(false);
		Beagle.setVisible(true);

	}
}

class Samoyed {
	JFrame Samoyed;

	public Samoyed() {
		Samoyed = new JFrame();
		Samoyed.setTitle("��𿹵� ����");
		Samoyed.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Samoyed.dispose();
				new Beagle();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Samoyed.dispose();
				new ShihTzu();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Samoyed.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/��𿹵�.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" �ú�����");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 20~25kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 51~56cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ���,���� ����");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�Ϻ� �ú������� �ϱر� ����� ������ ��Ҵ� ������� ��𿹵����� �������� �⸣�� �ִ� ��ſ� ���μ�,\r\n<br>"
						+ "������ �̸��� ���� �� ǰ���� �̸��� ���� �Ǿ���. <br>" + "19���⿡ �ͼ� �Ƹ޸�ī�� ������ �ϱ� Ž�谡�鿡 ���Ͽ� �����Ǿ� <br>"
						+ "��ſ밳�μ� �׵�� �Բ� Ȱ���� �� ó�� ���� ������ �Ұ��Ǿ���. <br>"
						+ "���� ����� ���� ����� ����, ��ſ����� �ܷõ� ������ ���� �����޾� ���迡 �θ� �˷�����.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Samoyed.add(p1, BorderLayout.NORTH);
		Samoyed.add(p2, BorderLayout.CENTER);
		Samoyed.add(p3, BorderLayout.SOUTH);
		Samoyed.pack();
		Samoyed.setResizable(false);
		Samoyed.setVisible(true);

	}
}

class ShihTzu {
	JFrame ShihTzu;

	public ShihTzu() {
		ShihTzu = new JFrame();
		ShihTzu.setTitle("���� ����");
		ShihTzu.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ShihTzu.dispose();
				new Samoyed();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ShihTzu.dispose();
				new AlaskanMalamute();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ShihTzu.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/����.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" Ƽ��Ʈ");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 5~7kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 25~27cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" �پ��� ����");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�� ������ ���� ����, ������ ���� �������� �ε巴�� �����̴� ���� �������� �����ϴ�.\r\n<br>"
						+ "���ڸӸ� ���� �Ӹ��� ������ ��, �������� ���� ����, ���� ��ȭ�� ���� �� ���� ������ �Ϳ��� ���� ���� �λ����� ����. <br>"
						+ "������̹Ƿ� ���� ���� ������ �־�� ������ �б��̿� ���� ���� ���� ������ ������ <br>" + "ü�뵵 ���� ���� �����Ƿ� ���������� �̻����̴�.<br>"
						+ "������ ǳ���� ���̾ �ֱ��� ���� ���̵���� �� ��︱ �� �ִ�.<br>"
						+ "�ݸ鿡, �������� ���� ���̹Ƿ� ������ ���������ų� ȭ�� ���� �̿� ���� ������ �ſ� ������.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		ShihTzu.add(p1, BorderLayout.NORTH);
		ShihTzu.add(p2, BorderLayout.CENTER);
		ShihTzu.add(p3, BorderLayout.SOUTH);
		ShihTzu.pack();
		ShihTzu.setResizable(false);
		ShihTzu.setVisible(true);

	}
}

class AlaskanMalamute {
	JFrame AlaskanMalamute;

	public AlaskanMalamute() {
		AlaskanMalamute = new JFrame();
		AlaskanMalamute.setTitle("�˷���ĭ�ȷ���Ʈ ����");
		AlaskanMalamute.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AlaskanMalamute.dispose();
				new ShihTzu();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AlaskanMalamute.dispose();
				new JindoDog();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AlaskanMalamute.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/�˷���ĭ �ȷ���Ʈ.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" �˷���ī");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 34~55kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 55~70cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ������,ȸ��");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�����ϰ� ����� ưư�ϸ� ������ �д�.\r\n<br>"
						+ "�����ϰ� ���� ���� ���� ���븦 ���� ȸ���̰ų� �������̸�, ����� �������� ������ ���⵵ �Ѵ�. <br>"
						+ "���� �������̸� �㸮������ ��簡 ����. �ʹ� ��¦ ���� ������ �������� ������.<br>" + "���� �������� �� �޸� �� �ֵ��� �β��� ���� ���� ����.<br>"
						+ "���� �Ͼ� ������ �޸��� �̵�Ÿ�ε� ��Ű��ֿ� ������ Ž�迡�� ��ĥ �� �𸣴� ���� �γ������� �ΰ��� ��Ÿ����.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		AlaskanMalamute.add(p1, BorderLayout.NORTH);
		AlaskanMalamute.add(p2, BorderLayout.CENTER);
		AlaskanMalamute.add(p3, BorderLayout.SOUTH);
		AlaskanMalamute.pack();
		AlaskanMalamute.setResizable(false);
		AlaskanMalamute.setVisible(true);

	}
}

class JindoDog {
	JFrame JindoDog;

	public JindoDog() {
		JindoDog = new JFrame();
		JindoDog.setTitle("������ ����");
		JindoDog.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JindoDog.dispose();
				new AlaskanMalamute();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JindoDog.dispose();
				new Chowchow();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JindoDog.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/������.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" �ѱ�");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 15~20kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 45~53cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" Ȳ��,���,������");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�������� ���ο� ���� �漺�ɰ� �������� ���ϸ� �پ �Ͱ����� �����ϰ� �ִ�.\r\n<br>" + "�������� ù ���� �� ������ �������� ���� ����<br>"
						+ "������ ������ �⸣�� �ʰ� ������ �������� ��� Ż�� ���°� ���� �Ͼ��.<br>" + "���� �������� ����ϰ� ��ͽ������ �̸��� ����.<br>"
						+ "�� �ӿ��� ����� ���� �ͼ��� ������ ���� ���� �ʰ� �������.<br>" + "�߻������� ������ �� �� �� ���� ���� �ʴ� ������ �ټ��� ������ �ִ�.<br>"
						+ "���鳢�� �οﶧ�� �ڽ��� �������� �ξ� ū ���� ������ �ºپ� ��ġ�� �������� �ʴ´�.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		JindoDog.add(p1, BorderLayout.NORTH);
		JindoDog.add(p2, BorderLayout.CENTER);
		JindoDog.add(p3, BorderLayout.SOUTH);
		JindoDog.pack();
		JindoDog.setResizable(false);
		JindoDog.setVisible(true);

	}
}

class Chowchow {
	JFrame Chowchow;

	public Chowchow() {
		Chowchow = new JFrame();
		Chowchow.setTitle("�������� ����");
		Chowchow.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chowchow.dispose();
				new JindoDog();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chowchow.dispose();
				new Chihuahua();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chowchow.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/��������.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" �߱�");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 20~30kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 50cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ������,�̻�,Ȳ����,������");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�Ϻ� �߱� ����� ��� �������� �ʱ⿡�� �Ŀ������ Ű���� ���� ����� ���� ������\r\n<br>"
						+ "����� �Ʊ� ���� �����Ű�� �Ϳ��� ���� ���������� �α⸦ ������ �ִ�.<br>"
						+ "���� ���� �ڻ��̸�, �������� ���ϳ� �������� ���ϹǷ� �ֺ� �µ��� �Ű��� ��� �Ѵ�.<br>"
						+ "�÷��� ���� �ʱ� ������ ������ ��ȭ�� �ΰ��ϰ� �����ϹǷ� ������ �ʰ� ���Ǹ� �ؾ� �Ѵ�.<br>"
						+ "������ �����̸�, ���ο��� ��������� Ÿ�ο��Դ� ����� ��Ÿ���̴�.<br>"
						+ "�׷��� �� ���� �� ����� ������ �����ε� �����ϴ�.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Chowchow.add(p1, BorderLayout.NORTH);
		Chowchow.add(p2, BorderLayout.CENTER);
		Chowchow.add(p3, BorderLayout.SOUTH);
		Chowchow.pack();
		Chowchow.setResizable(false);
		Chowchow.setVisible(true);

	}
}

class Chihuahua {
	JFrame Chihuahua;

	public Chihuahua() {
		Chihuahua = new JFrame();
		Chihuahua.setTitle("ġ�Ϳ� ����");
		Chihuahua.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chihuahua.dispose();
				new Chowchow();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chihuahua.dispose();
				new Papillon();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chihuahua.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/ġ�Ϳ�.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" �߽���");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 3kg ����");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 13~22cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ������,������,��蹫��");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "ġ�Ϳʹ� ����ϰ� ����ϸ�, ������� �����̴� ���� ���μ�\r\n<br>" + "ũ�Ⱑ �۱� ������ ����Ʈ ��� Ű��⿡ �����ϸ� ������� �αⰡ ����.<br>"
						+ "�ֱ��� ���� ǰ���� ������, Ŀ�ٶ� �ʹ� ����� ���̴� �ܸ� ���� ������ �ش�.<br>"
						+ "������ �����ϱ⸦ �ٶ�� �ٸ� ���� ����� ��쿡�� ���� ���� �������� ������ ���ϴ�.<br>"
						+ "�������� �����鼭�� �ڸ����� ���� ������ ���� �ð��� ������ �ʾƵ� ����.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Chihuahua.add(p1, BorderLayout.NORTH);
		Chihuahua.add(p2, BorderLayout.CENTER);
		Chihuahua.add(p3, BorderLayout.SOUTH);
		Chihuahua.pack();
		Chihuahua.setResizable(false);
		Chihuahua.setVisible(true);

	}
}

class Papillon {
	JFrame Papillon;

	public Papillon() {
		Papillon = new JFrame();
		Papillon.setTitle("���ǿ� ����");
		Papillon.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Papillon.dispose();
				new Chihuahua();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Papillon.dispose();
				new Pug();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Papillon.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/���ǿ�.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" �߾� ����");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 4~4.5kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 20~28cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ��� ������ ��� �Ǵ� ���� ��蹫��");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "����ϰ� �Ƹ��ٿ� �ܸ�� ������ ������ ������ �ϴ� ��(���ǿ��� ��������� ���� ����),\r\n<br>"
						+ "���� ��, ���� ��ܽ� ���� ���� ���� �������� �ֿϰ��̴�.<br>"
						+ "�Ӹ� ������ �ձ۰� ��ġ������ ª���з� �ο� �ִ�. �ձ׽����� �ʹ� �Ӹ� �������� �־���.<br>"
						+ "�̸��� ��� ���̸� ���� ������� ����������. ���� ũ���� ���� �ձ۰� ��ο� ������ �ణ ũ��.<br>"
						+ "���ð� ��ٸ��� ���䳢�� ������� �߰����� �߹����� ��ġ ����� �ϰ� �ִ�.<br>"
						+ "������ ���з� Ž������ ���� �ִ�. �Ǹ�� ���л����� ������ ����. �񡤰�������������� ���� ����.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Papillon.add(p1, BorderLayout.NORTH);
		Papillon.add(p2, BorderLayout.CENTER);
		Papillon.add(p3, BorderLayout.SOUTH);
		Papillon.pack();
		Papillon.setResizable(false);
		Papillon.setVisible(true);

	}
}

class Pug {
	JFrame Pug;

	public Pug() {
		Pug = new JFrame();
		Pug.setTitle("�۱� ����");
		Pug.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pug.dispose();
				new Papillon();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pug.dispose();
				new Poodle();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pug.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/�۱�.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" �߱�");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 6.4��8.2kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 28��31cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ���� �챸�� Ȳ���� ������");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�ֵ��̴� �ſ� ª�� �Ӹ��� ���� ����̴�.\r\n<br>" + "���� ũ�� �ձ۸� ���� �󱼿��� ���� �ָ��� �־ ��Ư�� ǥ���� ���´�.<br>"
						+ "������ ������ ���� �������� ���ƿø� �����̰� ��ü������ �������� �����̴�.<br>"
						+ "���� ª�� �ε巯��� ������ ����, �л����� ���� ���޵λ� �������� ��Ȳ�ݻ� ���̸�,<br>"
						+ "� ���� �ٹ��̰� �ִ�. ��ƾ���� ����������� �濡�� �̸� ��������.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Pug.add(p1, BorderLayout.NORTH);
		Pug.add(p2, BorderLayout.CENTER);
		Pug.add(p3, BorderLayout.SOUTH);
		Pug.pack();
		Pug.setResizable(false);
		Pug.setVisible(true);

	}
}

class Poodle {
	JFrame Poodle;

	public Poodle() {
		Poodle = new JFrame();
		Poodle.setTitle("Ǫ�� ����");
		Poodle.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Poodle.dispose();
				new Pug();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Poodle.dispose();
				new FieldSpaniel();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Poodle.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/Ǫ��.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ������");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 3.6~4.1kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 28cm ����");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ���, ����, ������, ������, ȸ��");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "���������� ����� ��� �ް� �ִ� �������� �����̴�.\r\n<br>" + "�����ϰ� �ֱ��� ���� ���������� ���� ����� �ް� �ִ� ǰ���̴�.<br>"
						+ "��ó�� ���������ϰ� ������ ���� ���� �ִ� Ǫ���� ���� �� ������ �ʾ� <br>" + "���� ���ȿ� ������ ���� �Ⱦ��ϴ� ������� Ű��� ����.<br>"
						+ "Ǫ���� ���� ����ؼ� �ڶ󳭴�. ���� ��ġ�� ���� �����Ϸ��� ���� ������ ���־�� �Ѵ�.<br>"
						+ "���� �����ϱ� ���� ������� 2~3�޿� �ѹ� ���� ª�� �߶��ָ� �ȴ�.<br>"
						+ "�ܸ�ó�� �����ϰ� �米���� ������ ���� �־� �ֱ��� �� �θ���. �����Ӱ� ������ ����� ���� �� �˾Ƶ�� �Ʒÿ� �� ������.<br>"
						+ "���� ��ħ����ó�� ��Ż�� �θ��� �ൿ�� ������ �Ʒ��� �� ��Ű�� ��������.<br>"
						+ "�����̳� ��̰� �ִ� ��� �������� �� ��︮�� ���� ���� ���α⸦ �Ʒý�Ű�� ���� �ʺ��ڵ��� Ű��� ����.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Poodle.add(p1, BorderLayout.NORTH);
		Poodle.add(p2, BorderLayout.CENTER);
		Poodle.add(p3, BorderLayout.SOUTH);
		Poodle.pack();
		Poodle.setResizable(false);
		Poodle.setVisible(true);

	}
}

class FieldSpaniel {
	JFrame FieldSpaniel;

	public FieldSpaniel() {
		FieldSpaniel = new JFrame();
		FieldSpaniel.setTitle("�ʵ彺�дϾ� ����");
		FieldSpaniel.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FieldSpaniel.dispose();
				new Poodle();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FieldSpaniel.dispose();
				new Harrier();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FieldSpaniel.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/�ʵ� ���дϾ�.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ����");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 16~23kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 46~58cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" ������,Ȳ�ݺ� ������,���� ������");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�Ӹ��� �ҵ����̳� ���� �Ͽ��� ���� �������� Ư¡�� ���ϸ� Ƣ��� �޸Ӹ��� Ư���ϴ�.\r\n<br>"
						+ "�ֵ��̴� ��� ������ ����. �İ��� �ߴ��Ͽ����� ������ ��ο� ����, �������� ���.<br>" + "�ʹ� ������ ���̷� �� ������� ���δ�.<br>"
						+ "�㸮�� ��ġ ������� �ְ� ����� ���� ������ ���� ���� ���� �ӷ��� �� �� �ִ�.<br>"
						+ "�մٸ��� ��� ������ ������� �̷������ ������� �˸��� ���̷� ���δ�.<br>"
						+ "���� �ձ� ����̰� �߹ٴ��� �β���. ������ ����� ���� ���� ������ ������ �� ���� ������.<br>"
						+ "���� ����� ���� ���ð� ���Ⱑ �ִ�.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		FieldSpaniel.add(p1, BorderLayout.NORTH);
		FieldSpaniel.add(p2, BorderLayout.CENTER);
		FieldSpaniel.add(p3, BorderLayout.SOUTH);
		FieldSpaniel.pack();
		FieldSpaniel.setResizable(false);
		FieldSpaniel.setVisible(true);

	}
}

class Harrier {
	JFrame Harrier;

	public Harrier() {
		Harrier = new JFrame();
		Harrier.setTitle("�ظ��� ����");
		Harrier.setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p2_1.setLayout(new GridLayout(0, 2));
		p3.setLayout(new GridLayout(0, 1));

		JButton Left = new JButton("��");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Harrier.dispose();
				new FieldSpaniel();

			}
		});

		JButton Right = new JButton("��");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Harrier.dispose();
				new Golden_Retriever();

			}
		});
		JButton Return = new JButton("�ڷΰ���");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Harrier.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/�ظ���.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("������ : ");
		JLabel origin_name = new JLabel(" ����");
		JLabel weight = new JLabel("ü�� : ");

		JLabel weight_name = new JLabel(" 21~23kg");
		JLabel stature = new JLabel("Ű : ");
		JLabel stature_name = new JLabel(" 48~53cm");
		JLabel color = new JLabel("���� : ");

		JLabel color_name = new JLabel(" �پ��� ��,��蹫��");
		JLabel cha = new JLabel("Ư¡ : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "�ܸ�� �ܴ��ϰ� �ٺ��� ������ �ָ� ª�� ���� �ִ� �з� ���� �ִ�.\r\n<br>"
						+ "�к��� �پ��ϸ� ��蹫�̰� �ִ�. �Ӹ��� �а� �����ϸ� �ֵ��̰� �����Ͽ� ������ �λ��� �ش�.<br>"
						+ "�౸���� ��ɰ���� �а� ������ �־� Ư�� �İ��� �ߴ��Ͽ���.<br>"
						+ "�Ʒ��� ó�� �ʹ� �ձ׽����ϸ� ������ ������ ������ ���þ�����.</p></Body></html>");

		origin.setAlignmentX(origin.CENTER);
		cha.setHorizontalAlignment(cha.CENTER);

		p1.add(Left);
		p1.add(i);
		p1.add(Right);
		p2_1.add(origin);
		p2_1.add(origin_name);
		p2_1.add(weight);
		p2_1.add(weight_name);
		p2_1.add(stature);
		p2_1.add(stature_name);
		p2_1.add(color);
		p2_1.add(color_name);
		p2.add(p2_1);
		p3_1.add(cha);
		p3_1.add(cha_name);
		p3_2.add(Return);
		p3.add(p3_1);
		p3.add(p3_2);

		Harrier.add(p1, BorderLayout.NORTH);
		Harrier.add(p2, BorderLayout.CENTER);
		Harrier.add(p3, BorderLayout.SOUTH);
		Harrier.pack();
		Harrier.setResizable(false);
		Harrier.setVisible(true);

	}
}
