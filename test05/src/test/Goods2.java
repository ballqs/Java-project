package test;

import java.util.Scanner;

class Goods2{
	//1.�������
	Scanner sc = new Scanner(System.in);
	String name;
	int price;
	int numberOfStock;
	int sold;
	//2.������ ����~! �ȸ������ ��
	//���࿡ �ȸ����, ���� �Ǿ��ֵ�, �̷��Ÿ� ����Ʈ �����ڶ�� �Ѵ�.
	//Goods2(){
	//		
	//}
	
	//3.��� �޼ҵ�
	String SetscName(String Name){
		this.name = Name;
		return name;
	}
	int SetscPrice(int Price) {
		this.price = Price;
		return price;
	}
	int SetscNumberOfStock(int NumberOfStock) {
		this.numberOfStock = NumberOfStock;
		return numberOfStock;
	}
	int SetscSold(int Sold) {
		this.sold = Sold;
		return sold;
	}
}