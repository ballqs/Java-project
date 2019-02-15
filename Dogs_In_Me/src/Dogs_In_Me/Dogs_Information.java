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
		Golden_Retriever.setTitle("골든리트리버 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Golden_Retriever.dispose();
				new Harrier();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Golden_Retriever.dispose();
				new Grey_Hound();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Golden_Retriever.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/골든리트리버.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 영국");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 29~34kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 56~61cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 황금색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "짙은 황금색의 털을 가진 아름다운 개로,\r\n<br>" + "찬 물 속에서도 견딜 수 있도록 긴 털이 많이 나 있고<br>"
						+ "앞발 뒤쪽에는 장식털이 나 있다.<br>" + "가슴이나 뒷발의 허벅지 뒤쪽, 꼬리의 아래쪽 면에도 털이 있다<br>" + "머리는 납작하고 넓다. <br>"
						+ "주둥이도 넓고 깊어 이지적이며 부드러운 느낌을 준다.<br>" + "성격이 온순하며 붙임성이 좋은데다 지능도 높아<br>"
						+ "가정견, 맹도견 등으로 유럽이나 미국, 일본에서 인기가 있다.<br>"
						+ "영리하고 체구에 비해 대범한 성격을 갖고 있고 호기심도 많다.</p></Body></html>");

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
		Grey_Hound.setTitle("그레이하운드 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Grey_Hound.dispose();
				new Golden_Retriever();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Grey_Hound.dispose();
				new Dachs_Hund();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Grey_Hound.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/그레이하운드.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 이집트");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 23~32kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 68~76cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 검은색,흰색,붉은색,황갈색,회백색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "깔끔하고 경쾌하며, 시속 70㎞까지 달릴 수 있는 근육질의 견종으로,\r\n<br>"
						+ "머리는 폭이 좁고 길며, 양쪽 귀와 양쪽 눈 사이이 간격이 비교적 넓다.<br>" + "눈빛은 어둡지만 광택이 있고, 균형 잡힌 주둥이는 끝이 가늘다.<br>"
						+ "콧등은 곧고, 귀는 작고 얇은데, 평상시에는 뒤쪽으로 누워 있지만,<br>" + "긴장하게 되면 거의 반듯하게 앞쪽을 향해 선다.</p></Body></html>");

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
		Dachs_Hund.setTitle("닥스훈트 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dachs_Hund.dispose();
				new Grey_Hound();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dachs_Hund.dispose();
				new Dalmatian();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dachs_Hund.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/닥스훈트.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 독일");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 5~8kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 23~27cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 적색,검은색,황갈색,어두운갈색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "늑골은 타원형이며 가슴뼈가 돌출되어 있다.\r\n<br>" + "앞다리는 짧고 뒷다리는 길며 근육질이다.<br>"
						+ "기질은 더없이 강하며 용감하고 민첩하다.<br>" + "성격은 명랑하고 장난스러우며 활동하는 것을 좋아한다.<br>"
						+ "우스꽝스러운 외모와는 달리 거만하고 묵직한 몸놀림으로 독특한 재주를 보인다.</p></Body></html>");

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
		Dalmatian.setTitle("달마시안 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dalmatian.dispose();
				new Dachs_Hund();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dalmatian.dispose();
				new Miniature_Pinscher();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dalmatian.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/달마시안.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 유고슬라비아");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 20~29kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 56~61cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 흰 바탕색에 검은색 또는 암갈색의 반점");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "고대 그리스 조각에 그려져 있을 정도로 오래 되었고,\r\n<br>" + "유랑민족 집시의 반려견(伴侶犬)으로 유럽에 분포하였으며,<br>"
						+ "이탈리아 ·오스트리아에서는 사냥개로서 큰몫을 하였다.<br>" + "영국에서는 코치도그(coach dog:馬車犬)라고 하여<br>"
						+ "마차를 탈 때나 승마할 때, 또는 여행의 안전을 위하여 데리고 다녔다고 한다.<br>"
						+ "순백색 바탕에 흑색 또는 갈색의 바둑알 같은 뚜렷한 얼룩점이 온몸에 아름답게 배치되어 있는 것이 특징이며,<br>"
						+ "외형은 영국의 포인터와 비슷하다. 성질은 활발하고 충실하며 기억력이 좋다.</p></Body></html>");

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
		Miniature_Pinscher.setTitle("미니어처 핀서 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Miniature_Pinscher.dispose();
				new Dalmatian();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Miniature_Pinscher.dispose();
				new Belgian_Shepherd_Dog();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Miniature_Pinscher.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/미니어처 핀셔.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 독일");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 4~4.5kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 25~32cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 붉은색,검은색,황갈색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "미니어처 핀셔는 구조적으로 균형이 잘 잡혔고 튼튼하며, 다부지고, 짧게 생겼으며, 매끈한 털의 개이다.\r\n<br>"
						+ "그는 본래가 아주 잘 손질되었고, 자신만만하며, 활력이 있고, 기민하다.<br>" + "성격 상의 특징은 승마용 말과 같은 동작, 두려움을 모르는 활기,<br>"
						+ "완전한 자신감의 소유, 사기왕성한 모습이다.<br>" + "미니핀은 더 큰 핀세르종과 단지 비슷한 모습을 갖고 있는 것을 넘어,<br>"
						+ "보호본능과 강건하고 확고한 성향이 뚜렷해서 만약 침입자가 들어오면 발목을 물어버릴 수도 있다.</p></Body></html>");

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
		Belgian_Shepherd_Dog.setTitle("벨지안 셰퍼드 독 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Belgian_Shepherd_Dog.dispose();
				new Miniature_Pinscher();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Belgian_Shepherd_Dog.dispose();
				new Bulldog();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Belgian_Shepherd_Dog.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/벨지안 셰퍼드 독.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 벨기에");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 22~30kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 56~62cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 검은색,연한 황갈색,연한 적갈색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "일반적으로 균형이 잘 잡혀있는 외모에 탄탄하고 강한 근육을 갖는 중형견이다.\r\n<br>"
						+ "이마는 편평하며 주둥이는 긴 편이다. 코끝으로 갈수록 주둥이가 가늘어진다.<br>" + "아몬드형의 눈은 갈색이며 눈꼬리는 검다. 귀는 작고 끝이 뾰족하다.<br>"
						+ "이빨은 튼튼하며 협상교합(scissors bite, 위턱의 앞니가 아래턱의 앞니보다 조금 앞에서 맞물리는 교합)인 경우가 많다.<br>"
						+ "목은 가늘고 길다. 꼬리는 쉴 때는 늘어지나 움직이기 시작하면 수평을 유지한다.<br>" + "숱이 많은 털을 갖는다.</p></Body></html>");

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
		Bulldog.setTitle("불독 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bulldog.dispose();
				new Belgian_Shepherd_Dog();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bulldog.dispose();
				new Bloodhound();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bulldog.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/불독.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 영국");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 23~25kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 30~41cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 붉은색,황갈색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "불도그은 중형견으로서 매끈한 털과 중량감 있으며\r\n<br>" + "육중하고 짧은 얼굴의 머리와 넓은 어깨와 튼튼한 사지를 가진 견종이다.<br>"
						+ "외관과 태도는 아주 견실하며 정력적이고 힘이 센 인상을 준다.<br>" + "성품은 결단력이 있으며 친절하고 침착하고 용감하나 사납거나 표독스럽지는 않다.<br>"
						+ "행동은 조용하여 위엄이 있다. 이런 특성들은 표정과 행동에 의해 돋보인다.<br>" + "불도그은 공격성이 없고 유순하지만 화가 났을 때는 주의해야 하므로<br>"
						+ "평소 기초적인 복종훈련을 해두는 것이 좋다. 잠이 많고 단두형이라서 코를 많이 곤다.</p></Body></html>");

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
		Bloodhound.setTitle("블러드하운드 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bloodhound.dispose();
				new Bulldog();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bloodhound.dispose();
				new Beagle();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Bloodhound.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/블러드 하운드.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 벨기에");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 41~50kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 63~69cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 검은색,붉은 갈색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "블러드 하운드는 아직도 뛰어난 후각을 가지고 있다.\r\n<br>"
						+ "이러한 개의 능력은 600명 이상의 범죄자의 체포에 공헌하였다.사실 이 개는 조용한 추적자이다.<br>" + "비록 이 개가 확실히 도주자들을 쫓아왔다고 해도<br>"
						+ "블러드 하운드는 영화나 소설에서 처럼 사나운 이미지를 가진 개가 아니다.<br>"
						+ "오늘날에도 이 견종은 실종된 어린이나 길을 잃은 등산객들을 찾는 데 투입된다.<br></p></Body></html>");

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
		Beagle.setTitle("비글 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Beagle.dispose();
				new Bloodhound();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Beagle.dispose();
				new Samoyed();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Beagle.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/비글.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 영국");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 15~20kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 3~40cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 흰색과 황색,갈색,적갈색,검정색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "작고 야무진 체구에 단단한 근육질의 몸을 갖고 있는 사냥개로 원래 토끼사냥에 주로 쓰였다고 한다.\r\n<br>"
						+ "후각이 뛰어나게 발달해 최근 마약 탐지견 및 밀수품 탐지견으로도 쓰이고 있다.<br>"
						+ "깔끔하고 영리해 보이는 귀여운 외모와 함께 만화 〈스누피〉의 모델로도 유명하다.<br></p></Body></html>");

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
		Samoyed.setTitle("사모예드 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Samoyed.dispose();
				new Beagle();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Samoyed.dispose();
				new ShihTzu();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Samoyed.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/사모예드.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 시베리아");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 20~25kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 51~56cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 흰색,옅은 갈색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "북부 시베리아의 북극권 가까운 곳에서 살았던 유목민인 사모예드족이 옛날부터 기르고 있던 썰매용 개로서,\r\n<br>"
						+ "부족의 이름을 따서 개 품종의 이름을 짓게 되었다. <br>" + "19세기에 와서 아메리카와 영국의 북극 탐험가들에 의하여 발전되어 <br>"
						+ "썰매용개로서 그들과 함께 활약한 후 처음 서양 각국에 소개되었다. <br>"
						+ "이후 우아한 용모와 대담한 성격, 썰매용으로 단련된 강력한 힘을 인정받아 세계에 널리 알려졌다.</p></Body></html>");

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
		ShihTzu.setTitle("시츄 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ShihTzu.dispose();
				new Samoyed();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ShihTzu.dispose();
				new AlaskanMalamute();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ShihTzu.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/시추.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 티베트");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 5~7kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 25~27cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 다양한 색상");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "이 견종은 작은 몸이, 기차와 같은 형상으로 부드럽게 움직이는 놀라운 동작으로 유명하다.\r\n<br>"
						+ "사자머리 같은 머리에 납작한 코, 먼지떨이 같은 꼬리, 무성 영화를 보는 것 같은 빠르고도 귀여운 몸짓 등이 인상적인 개다. <br>"
						+ "장모종이므로 털을 매일 손질해 주어야 하지만 털길이에 비해 털은 많이 빠지지 않으며 <br>" + "체취도 많이 나지 않으므로 가정견으로 이상적이다.<br>"
						+ "감정이 풍부한 편이어서 애교도 많고 아이들과도 잘 어울릴 수 있다.<br>"
						+ "반면에, 자존심이 강한 편이므로 주인이 난폭해지거나 화를 내면 이에 대한 반응이 매우 빠르다.</p></Body></html>");

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
		AlaskanMalamute.setTitle("알래스칸맬러뮤트 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AlaskanMalamute.dispose();
				new ShihTzu();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AlaskanMalamute.dispose();
				new JindoDog();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AlaskanMalamute.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/알래스칸 맬러뮤트.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 알래스카");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 34~55kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 55~70cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 검은색,회색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "강인하고 골격이 튼튼하며 가슴이 넓다.\r\n<br>"
						+ "촘촘하고 굵은 이중 털은 늑대를 닮은 회색이거나 검은색이며, 흰색과 검은색이 섞여서 나기도 한다. <br>"
						+ "등은 일직선이며 허리쪽으로 경사가 진다. 귀는 바짝 서고 꼬리는 등쪽으로 말린다.<br>" + "발은 눈에서도 잘 달릴 수 있도록 두껍고 털이 많이 난다.<br>"
						+ "수십 일씩 극지를 달리는 이디타로드 썰매경주와 극지방 탐험에서 지칠 줄 모르는 힘과 인내심으로 두각을 나타낸다.</p></Body></html>");

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
		JindoDog.setTitle("진돗개 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JindoDog.dispose();
				new AlaskanMalamute();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JindoDog.dispose();
				new Chowchow();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JindoDog.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/진돗개.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 한국");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 15~20kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 45~53cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 황색,흰색,검은색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "진돗개는 주인에 대한 충성심과 복종심이 강하며 뛰어난 귀가성을 간직하고 있다.\r\n<br>" + "진돗개는 첫 정을 준 주인을 오랫동안 잊지 못해<br>"
						+ "강아지 때부터 기르지 않고 성견을 구입했을 경우 탈주 사태가 종종 일어난다.<br>" + "또한 진돗개는 대담하고 용맹스럽기로 이름이 높다.<br>"
						+ "산 속에서 멧돼지 같은 맹수를 만나도 겁을 먹지 않고 덤벼든다.<br>" + "야생동물을 물었을 때 한 번 물면 놓지 않는 지독한 근성을 가지고 있다.<br>"
						+ "개들끼리 싸울때도 자신의 몸집보다 훨씬 큰 대형 견종과 맞붙어 한치도 물러서지 않는다.</p></Body></html>");

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
		Chowchow.setTitle("차우차우 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chowchow.dispose();
				new JindoDog();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chowchow.dispose();
				new Chihuahua();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chowchow.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/차우차우.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 중국");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 20~30kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 50cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 붉은색,미색,황갈색,검은색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "북부 중국 기원의 고대 견종으로 초기에는 식용견으로 키워진 아픈 기억을 갖고 있지만\r\n<br>"
						+ "현재는 아기 곰을 연상시키는 귀여운 용모로 가정견으로 인기를 모으고 있다.<br>"
						+ "혀와 입이 자색이며, 추위에는 강하나 더위에는 약하므로 주변 온도에 신경을 써야 한다.<br>"
						+ "시력이 좋지 않기 때문에 주위의 변화에 민감하게 반응하므로 물리지 않게 주의를 해야 한다.<br>"
						+ "조용한 성격이며, 주인에게 충실하지만 타인에게는 상당히 배타적이다.<br>"
						+ "그래서 이 개는 한 사람만 따르는 것으로도 유명하다.</p></Body></html>");

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
		Chihuahua.setTitle("치와와 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chihuahua.dispose();
				new Chowchow();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chihuahua.dispose();
				new Papillon();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Chihuahua.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/치와와.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 멕시코");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 3kg 이하");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 13~22cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 붉은색,검은색,얼룩무늬");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "치와와는 우아하고 기민하며, 재빠르게 움직이는 작은 개로서\r\n<br>" + "크기가 작기 때문에 아파트 등에서 키우기에 적합하며 노년층에 인기가 많다.<br>"
						+ "애교가 많고 품위가 있으며, 커다란 귀는 기민해 보이는 외모를 더욱 강조해 준다.<br>"
						+ "주인을 독점하기를 바라며 다른 개와 상대할 경우에도 절대 지지 않으려는 성향이 강하다.<br>"
						+ "질투심이 많으면서도 자립심이 강해 주인이 많은 시간을 들이지 않아도 좋다.</p></Body></html>");

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
		Papillon.setTitle("파피용 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Papillon.dispose();
				new Chihuahua();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Papillon.dispose();
				new Pug();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Papillon.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/파피용.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 중앙 유럽");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 4~4.5kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 20~28cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 백색 바탕에 흑색 또는 적색 얼룩무늬");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "우아하고 아름다운 외모와 나비의 날개를 연상케 하는 귀(파피용은 프랑스어로 나비를 뜻함),\r\n<br>"
						+ "작은 몸, 가는 비단실 같은 털을 가진 전형적인 애완견이다.<br>"
						+ "머리 부위는 둥글고 아치형으로 짧은털로 싸여 있다. 둥그스름한 귀는 머리 뒤쪽으로 휘었다.<br>"
						+ "이마와 콧등 사이를 좁은 흰색으로 구분지었다. 보통 크기의 눈은 둥글고 어두운 색으로 약간 크다.<br>"
						+ "가늘고 긴다리는 산토끼를 닮았으며 발가락이 야무지고 아치 모양을 하고 있다.<br>"
						+ "꼬리는 긴털로 탐스럽게 덮여 있다. 피모는 긴털뿐으로 잔털은 없다. 목·가슴·허벅지에는 털이 많다.</p></Body></html>");

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
		Pug.setTitle("퍼그 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pug.dispose();
				new Papillon();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pug.dispose();
				new Poodle();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pug.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/퍼그.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 중국");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 6.4∼8.2kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 28∼31cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 은색 살구색 황갈색 검은색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "주둥이는 매우 짧고 머리는 도끼 모양이다.\r\n<br>" + "눈은 크고 둥글며 검은 얼굴에는 깊은 주름이 있어서 독특한 표정을 짓는다.<br>"
						+ "꼬리는 엉덩이 위에 이중으로 감아올린 상태이고 전체적으로 땅딸막한 몸매이다.<br>"
						+ "털은 짧고 부드러우며 광택이 나며, 털색깔은 은색 ·앵두색 ·검은색 ·황금색 등이며,<br>"
						+ "등에 검은 줄무늬가 있다. 라틴어의 ‘도끼’라는 뜻에서 이름 지어졌다.</p></Body></html>");

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
		Poodle.setTitle("푸들 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Poodle.dispose();
				new Pug();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Poodle.dispose();
				new FieldSpaniel();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Poodle.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/푸들.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 프랑스");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 3.6~4.1kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 28cm 이하");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 흰색, 갈색, 검정색, 오렌지, 회색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "프랑스인의 사랑을 듬뿍 받고 있는 프랑스의 국견이다.\r\n<br>" + "영리하고 애교가 많아 국내에서도 많은 사랑을 받고 있는 품종이다.<br>"
						+ "양처럼 곱슬곱슬하고 촘촘한 털을 갖고 있는 푸들은 털이 잘 빠지지 않아 <br>" + "털이 집안에 날리는 것을 싫어하는 사람들이 키우면 좋다.<br>"
						+ "푸들의 털은 계속해서 자라난다. 털이 뭉치는 것을 방지하려면 매일 빗질을 해주어야 한다.<br>"
						+ "털을 관리하기 힘든 사람들은 2~3달에 한번 털을 짧게 잘라주면 된다.<br>"
						+ "외모처럼 깜찍하고 사교적인 성격을 갖고 있어 애교를 잘 부린다. 지혜롭고 영리해 사람의 말을 잘 알아듣고 훈련에 잘 따른다.<br>"
						+ "가끔 새침데기처럼 앙탈을 부리는 행동도 하지만 훈련을 잘 시키면 고쳐진다.<br>"
						+ "노인이나 어린이가 있는 어느 가정에나 잘 어울리며 여러 가지 개인기를 훈련시키고 싶은 초보자들이 키우면 좋다.</p></Body></html>");

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
		FieldSpaniel.setTitle("필드스패니얼 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FieldSpaniel.dispose();
				new Poodle();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FieldSpaniel.dispose();
				new Harrier();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FieldSpaniel.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/필드 스패니얼.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 영국");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 16~23kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 46~58cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 검은색,황금빛 적갈색,붉은 적갈색");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "머리는 불도그이나 블러드 하운드와 같은 대형견의 특징을 지니며 튀어나온 뒷머리가 특이하다.\r\n<br>"
						+ "주둥이는 길고 살집이 없다. 후각이 발달하였으며 눈빛은 어두운 갈색, 검은색을 띤다.<br>" + "귀는 적당한 길이로 긴 장식털이 덮인다.<br>"
						+ "허리는 아치 모양으로 휘고 어깨와 등이 적당히 기울어 강한 힘과 속력을 낼 수 있다.<br>"
						+ "앞다리는 곧고 편평한 골격으로 이루어지며 장식털이 알맞은 길이로 덮인다.<br>"
						+ "발은 둥근 모양이고 발바닥은 두껍다. 꼬리는 등선보다 낮은 곳에 있으며 움직일 때 낮게 내린다.<br>"
						+ "물결 모양의 털은 가늘고 윤기가 있다.</p></Body></html>");

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
		Harrier.setTitle("해리어 정보");
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

		JButton Left = new JButton("←");
		Left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Harrier.dispose();
				new FieldSpaniel();

			}
		});

		JButton Right = new JButton("→");
		Right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Harrier.dispose();
				new Golden_Retriever();

			}
		});
		JButton Return = new JButton("뒤로가기");
		Return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Harrier.dispose();
				Dogs_Main_Menu dmm = new Dogs_Main_Menu();
			}
		});

		ImageIcon ii = new ImageIcon("Dog/해리어.jpg");

		JLabel i = new JLabel(ii);
		JLabel origin = new JLabel("원산지 : ");
		JLabel origin_name = new JLabel(" 영국");
		JLabel weight = new JLabel("체중 : ");

		JLabel weight_name = new JLabel(" 21~23kg");
		JLabel stature = new JLabel("키 : ");
		JLabel stature_name = new JLabel(" 48~53cm");
		JLabel color = new JLabel("색상 : ");

		JLabel color_name = new JLabel(" 다양한 색,얼룩무늬");
		JLabel cha = new JLabel("특징 : ");
		JLabel cha_name = new JLabel(
				"<html><Head></Head><Body><p align='center' style='font-size: 11pt; border:1px solid black;'>"
						+ "외모는 단단하고 다부진 느낌을 주며 짧고 윤기 있는 털로 덮여 있다.\r\n<br>"
						+ "털빛은 다양하며 얼룩무늬가 있다. 머리는 넓고 평평하며 주둥이가 두툼하여 강인한 인상을 준다.<br>"
						+ "콧구멍이 사냥개답게 넓게 벌어져 있어 특히 후각이 발달하였다.<br>"
						+ "아래로 처진 귀는 둥그스름하며 꼬리는 끝으로 갈수록 가늘어진다.</p></Body></html>");

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
