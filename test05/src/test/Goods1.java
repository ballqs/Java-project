package test;

public class Goods1 {//Ŭ���� -> ��ü�� Ŭ������ ����� ���Ѱ�
		
		//3��� ->
		//1.�������
		//2.������
		//3.����޼ҵ�
		String name;
		int price;
		
		Goods1(){
			name = "��ǰ�� ����";
			price = 0;
		}
		void setPrice(int price){
			this.price = price;
		}
		void setName(String name) {
			this.name = name;
		}
		void print() {
			System.out.println("��ǰ �̸� : "+this.name);//this ��������
			System.out.println("��ǰ ���� : "+this.price);
		}
}
