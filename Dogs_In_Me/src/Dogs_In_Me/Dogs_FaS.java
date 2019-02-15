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
		ImageIcon ii1 = new ImageIcon("FaS/오리젠_시니어_독.jpg");
		ImageIcon ii2 = new ImageIcon("FaS/오리젠_식스_피쉬 독.jpg");
		ImageIcon ii3 = new ImageIcon("FaS/오리젠_오리지날_독.jpg");
		ImageIcon ii4 = new ImageIcon("FaS/오리젠_퍼피.jpg");
		ImageIcon ii5 = new ImageIcon("FaS/오리젠_퍼피_라지.jpg");
		ImageIcon ii6 = new ImageIcon("FaS/네이처스버라이어티 인스팅트 LID 오리고기 독키블.jpg");
		ImageIcon ii7 = new ImageIcon("FaS/네이처스버라이어티 인스팅트 RBK 생식본능 치킨 독키블.jpg");
		ImageIcon ii8 = new ImageIcon("FaS/네이처스버라이어티 인스팅트 생식본능(치킨) 독키블.jpg");
		ImageIcon ii9 = new ImageIcon("FaS/네이쳐스버라이어티 인스팅트 lid칠면조.jpg");
		ImageIcon ii10 = new ImageIcon("FaS/네이쳐스버라이어티 인스팅트 토끼고기 독키블.jpg");
		ImageIcon ii11 = new ImageIcon("FaS/오리젠_시니어_독.jpg");
		
		bt1 = new JButton("←");
		bt1.addActionListener(this);
		bt2 = new JButton("→");
		bt2.addActionListener(this);
		bt3 = new JButton("처음으로");
		bt3.addActionListener(this);
		
		l1 = new JLabel("제품명 : 오리젠 시니어 독 ORIJEN SENIOR",JLabel.CENTER);
		l2 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>탄탄한 근육량을 증진시키는 고기와 단백질은 풍부하면서,"
				+ "<br> 건강한 체중을 지원하기 위해 칼로리는 낮은 식품입니다.</p></p></html>",JLabel.CENTER);
		l3 = new JLabel("<html><p align='center'>제품 특징 : <br><p style='border: 1px solid black;'>저탄수화물 식품인 오리젠 시니어는 통먹이 비율의 닭과 칠"
				+ "<br>면조 고기, 자연산 생선과 자연란 계란 등에서 나오는 자양"
				+ "<br>분이 풍부한 단백질이 많이 들어 있습니다.</p></p></html>",JLabel.CENTER);
		l4 = new JLabel(ii1);
		
		l5 = new JLabel("제품명 : 오리젠 식스 피쉬 독 ORIJEN SIX FISH",JLabel.CENTER);
		l6 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>우리의 청정한 태평양 바다에서 자연산으로 지속 가능하게 "
				+ "<br>잡는 매우 다양한 토착 생선들을 사용합니다.</p></p></html>",JLabel.CENTER);
		l7 = new JLabel("<html><p align='center'>제품 특징 : <br><p style='border: 1px solid black;'>오리젠 식스 피쉬는 북 밴쿠버 섬 근해에서 지속 가능하게 "
				+ "<br>자연산으로 어획하는 여섯 가지 바다 생선을 비교할 데 없이 "
				+ "<br>많이 사용하여 만드는데, 이 생선들은 신속하게 얼음을 "
				+ "<br>채워 신선하게 우리 시설에 운반해 옵니다.</p></p></html>",JLabel.CENTER);
		l8 = new JLabel(ii2);
		
		l9 = new JLabel("제품명 : 오리젠 오리지날 독 ORIJEN ORIGINAL",JLabel.CENTER);
		l10 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>모든 개들은 풍부하고 다양한 고기와 단백질이 풍부한 음"
				+ "<br>식을 먹는 것이 생물학적으로 필요합니다.</p></p></html>",JLabel.CENTER);
		l11 = new JLabel("<html><p align='center'>제품 특징 : <br><p style='border: 1px solid black;'>오리젠 오리지날은 놓아 기른 닭과 칠면조 고기,자연산  "
				+ "<br>생선과 자연란 계란을 신선하게 운송해 와서 비교할 데 없이 "
				+ "<br>많이 사용하여 만드는데, 이육류들을 자양분이 풍부한 통 "
				+ "<br>먹이 비율로 사용하므로 모든 영양소들을 천연적으로 완전하<br>게 공급합니다.</p></p></html>",JLabel.CENTER);
		l12 = new JLabel(ii3);
		
		l13 = new JLabel("제품명 : 오리젠 퍼피 ORIJEN PUPPY",JLabel.CENTER);
		l14 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>현대의 강아지들은 그 선조들과 같은 신체를 가졌습니다."
				+ "<br>그래서 같은 종류의 음식을 먹어야 합니다.</p></p></html>",JLabel.CENTER);
		l15 = new JLabel("<html><p align='center'>제품 특징 : <br><p style='border: 1px solid black;'>오리젠 퍼피는 자양분이 풍부한 통 먹이 비율로 사용하는 "
				+ "<br>놓아 기른 닭과 칠면조 고기,자연산 생선과 자연란 통 계란 "
				+ "<br>등 진정으로 신선한 고기에서 나오는 천연 단백질과 지방이 "
				+ "<br>가득합니다.</p></p></html>",JLabel.CENTER);
		l16 = new JLabel(ii4);
		
		l17 = new JLabel("제품명 : 오리젠 퍼피 라지 ORIJEN PUPPY LARGE",JLabel.CENTER);
		l18 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>대형견종의 근육량을 지원하기 위해 단백질은 풍부하면서도,"
				+ "<br> 건강한 체중을 촉진하기 위해 칼로리를 제한했습니다.</p></p></html>",JLabel.CENTER);
		l19 = new JLabel("<html><p align='center'>제품 특징 : <br><p style='border: 1px solid black;'>자양분이 풍부한 통 먹이 비율의 놓아 기른 닭과 칠면조 "
				+ "<br>고기, 자연란 생선과 자연란 통 계란에서 나오는 단백질이 "
				+ "<br>넉넉히 들어 있는 오리젠 퍼피 라지는, 대형 견종의 강아지"
				+ "<br>를 위해 칼로리와 미네랄이 특별하게 분포되어 있습니다.</p></p></html>",JLabel.CENTER);
		l20 = new JLabel(ii5);
		
		l21 = new JLabel("제품명 : 네이처스버라이어티 인스팅트 LID 오리고기 독키블",JLabel.CENTER);
		l22 = new JLabel("<html><p align='center'>만든 곳 : <br>MADE IN USA<br><br>"
				+ "알러지와 피부개선을 위한 레시피</p></html>",JLabel.CENTER);
		l23 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>최소한의 필수적인 재료에서 나온 최적의 영양.LID인스팅트는 영양가가 높고 소화가 잘 되는 재료들을 신중하게 선택하여 만들었습니다. 이제 여러분의 반려견은 소화가 잘 되어 건강에도 좋은 풍부한 영양을 가진 식단을 즐길 수 있게 되었습니다.</p></p></html>",JLabel.CENTER);
		l24 = new JLabel(ii6);
		
		l25 = new JLabel("제품명 : 네이처스버라이어티 인스팅트 RBK 생식본능 치킨 독키블",JLabel.CENTER);
		l26 = new JLabel("<html><p align='center'>만든 곳 : <br>MADE IN USA<br><br>"
				+ "애견의 건강만을 생각하는 그레인 프리</p></html>",JLabel.CENTER);
		l27 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>인스팅트 로부스트는 무곡물 키블과 동결건조 생식 알갱이를 한 봉지에 담았습니다. 여러분의 반려견을 활기하게 해줄 영양과 편리함을 모두 잡으세요. 개와 고양이를 위한 생식의 순수하고 건강에 좋은 영양분을 가장 편리한 방법으로 전해드립니다.</p></p></html>",JLabel.CENTER);
		l28 = new JLabel(ii7);
		
		l29 = new JLabel("제품명 : 네이처스버라이어티 인스팅트 생식본능(치킨) 독키블",JLabel.CENTER);
		l30 = new JLabel("<html><p align='center'>만든 곳 : <br>MADE IN USA<br><br>"
				+ "애견의 건강만을 생각하는 그레인 프리</p></html>",JLabel.CENTER);
		l31 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>인스팅트 색식본능은 애견의 본능적인 식욕을 충족시키는 고단백, 무곡물, 무글루텐 식단입니다. 그 옛날 개와 고양이들이 야생에서 먹었던 건강한 식사인 진짜 닭고기, 영양이 풍부한 채소, 과일들로 신중하게 영양의 균형을 맞추어 만들어낸 식단입니다. 이처럼 순수하고, 생물학적으로 애견에게 꼭 맞는 생식본능은 영양밀도가 높고 소화가 잘되어 건강하게 잘 살 수 있도록 해 줍니다. 본능적 욕구에 맞는 식사로 건상하고 행복한 삶을 유지할 수 있도록 가장 알맞는 영양분과 에너지를 전해주세요.</p></p></html>",JLabel.CENTER);
		l32 = new JLabel(ii8);
		
		l33 = new JLabel("제품명 : 네이쳐스버라이어티 인스팅트 lid칠면조",JLabel.CENTER);
		l34 = new JLabel("<html><p align='center'>만든 곳 : <br>MADE IN USA<br><br>"
				+ "알러지와 피부개선을 위한 레시피</p></html>",JLabel.CENTER);
		l35 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>최소한의 필수적인 재료에서 나온 최적의 영양. LID인스팅트는 영양가가 높고 소화가 잘 되는 재료들을 신중하게 선택하여 만들었습니다. 이제 여러분의 반려견은 소화가 잘 되어 건강에도 좋은 풍부한 영양을 가진 식단을 즐길 수 있게 되었습니다.</p></p></html>",JLabel.CENTER);
		l36 = new JLabel(ii9);
		
		l37 = new JLabel("제품명 : 네이쳐스버라이어티 인스팅트 토끼고기 독키블",JLabel.CENTER);
		l38 = new JLabel("<html><p align='center'>만든 곳 : <br>MADE IN USA<br><br>"
				+ "애견의 건강만을 생각하는 그레인 프리</p></html>",JLabel.CENTER);
		l39 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>인스팅트 토끼고기 독 키블은 애견의 본능적인 식욕을 충족시키는 고단백, 무곡물, 무글루텐 식단입니다. 그 옛날 개와 고양이들이 야생에서 먹었던 건강한 식사인 진짜 토끼고기, 영양이 풍부한 채소, 과일들로 신중하게 영양의 균형을 맞추어 만들어낸 식단입니다. 이처럼 순수하고 생물학적으로 애견에게 꼭 맞는 생식본능은 영양 밀도가 높고 소화가 잘되어 건강하게 잘 살 수 있도록 해줍니다. 본능적 욕구에 맞는 식사로, 건강하고 행복한 삶을 유지할 수 있도록 가장 알맞는 영양분과 에너지를 전해주세요.</p></p></html>",JLabel.CENTER);
		l40 = new JLabel(ii10);
		
		l41 = new JLabel("제품명 : 오리젠 시니어 독 ORIJEN SENIOR",JLabel.CENTER);
		l42 = new JLabel("<html><p align='center'>제품 설명 : <br><p style='border: 1px solid black;'>탄탄한 근육량을 증진시키는 고기와 단백질은 풍부하면서,<br> 건강한 체중을 지원하기 위해 칼로리는 낮은 식품입니다.</p></p></html>",JLabel.CENTER);
		l43 = new JLabel("<html><p align='center'>제품 특징 : <br><p style='border: 1px solid black;'>저탄수화물 식품인 오리젠 시니어는 통먹이 비율의 닭과 칠<br>면조 고기, 자연산 생선과 자연란 계란 등에서 나오는 자양<br>분이 풍부한 단백질이 많이 들어 있습니다.</p></p></html>",JLabel.CENTER);
		l44 = new JLabel(ii11);
		
		gbl = new GridBagLayout();
	    setLayout(gbl);
	    
	    gbc = new GridBagConstraints(); //☆GridBagLayout에 배치할 컴포넌트 위치 정보 등을 담을 객체 준비

	    gbc.fill = GridBagConstraints.BOTH;
	    
	    gbb = new GridBagConstraints(); //☆GridBagLayout에 배치할 컴포넌트 위치 정보 등을 담을 객체 준비

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
	
	private void gbbAdd(Component c, int x, int y, int w, int h) {

	      gbb.gridx = x;
	      gbb.gridy = y; 
	      //가장 왼쪽 위 gridx, gridy값은 0 
	      gbb.gridwidth  = w;	//넓이
	      gbb.gridheight = h;	//높이
	      //gridwidth를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 행의 마지막 셀이되고, 
	      //gridheight를 GridBagConstraints.REMAINDER 값으로 설정하면 현재 열의 마지막 셀이됩니다. 
	      //gridwidth를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 행의 다음 셀부터 마지막 셀까지 차지하고, 
	      //gridheight를 GridBagConstraints. RELATIVE 값으로 설정하면 현재 열의 다음 셀부터 마지막 셀까지 차지하도록 합니다.
	      
	      gbl.setConstraints(c, gbb); //컴포넌트를 컴포넌트 위치+크기 정보에 따라 GridBagLayout에 배치
	 
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

