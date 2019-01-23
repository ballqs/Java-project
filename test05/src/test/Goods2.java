package test;

import java.util.Scanner;

class Goods2{
	//1.멤버변수
	Scanner sc = new Scanner(System.in);
	String name;
	int price;
	int numberOfStock;
	int sold;
	//2.생성자 없음~! 안만들었을 때
	//만약에 안만들면, 생략 되어있따, 이런거를 디폴트 생성자라고 한다.
	//Goods2(){
	//		
	//}
	
	//3.멤버 메소드
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