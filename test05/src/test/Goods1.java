package test;

public class Goods1 {//클래스 -> 객체는 클래스를 만들기 위한것
		
		//3요소 ->
		//1.멤버변수
		//2.생성자
		//3.멤버메소드
		String name;
		int price;
		
		Goods1(){
			name = "상품명 미정";
			price = 0;
		}
		void setPrice(int price){
			this.price = price;
		}
		void setName(String name) {
			this.name = name;
		}
		void print() {
			System.out.println("상품 이름 : "+this.name);//this 생략가능
			System.out.println("상품 가격 : "+this.price);
		}
}
