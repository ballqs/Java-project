package test;

public class Basic_02 {

	public static void main(String[] args) {
		Goods1 g1[] = new Goods1[5];

//		g1[0] = new Goods1(); //��ü �����
//		g1[1] = new Goods1(); //��ü �����
//		g1[2] = new Goods1(); //��ü �����
//		g1[3] = new Goods1(); //��ü �����
//		g1[4] = new Goods1(); //��ü �����
		for(int i=0; i<g1.length; i++) {
			g1[i] = new Goods1(); //��ü �����
		}
		
		g1[0].name = "��Ź��";//��ü�迭�� �� ������ 1���� ��������� �� �ֱ�
		g1[0].price = 150000;
		
		g1[1].name = "�����";
		g1[1].price = 450000;
		
		//��ó�� ����ص� �۵��� �ǳ� �ǹ����� �̷��� �ȵȴٰ� �����.
		
		g1[2].setName("���ڷ���");//��ü�迭�� ����޼ҵ带 ���� ��������� �� �ֱ�
		g1[2].setPrice(700000);
		
		for(int i=0; i<g1.length; i++) {
			//��ü(��:g1[i])�� ������� name ����
			//�׷���  ��������� ���� �����ϴ� ���� ��ü���⿡ ����
			
			//��ü�� �޼ҵ带 ���ؼ� ��������� ����
			g1[i].print();
		}
	}

}
