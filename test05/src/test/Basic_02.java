package test;

public class Basic_02 {

	public static void main(String[] args) {
		Goods1 g1[] = new Goods1[5];

//		g1[0] = new Goods1(); //객체 만들기
//		g1[1] = new Goods1(); //객체 만들기
//		g1[2] = new Goods1(); //객체 만들기
//		g1[3] = new Goods1(); //객체 만들기
//		g1[4] = new Goods1(); //객체 만들기
		for(int i=0; i<g1.length; i++) {
			g1[i] = new Goods1(); //객체 만들기
		}
		
		g1[0].name = "세탁기";//객체배열의 한 원소인 1개의 멤버변수에 값 넣기
		g1[0].price = 150000;
		
		g1[1].name = "냉장고";
		g1[1].price = 450000;
		
		//위처럼 사용해도 작동은 되나 실무에선 이러면 안된다고 들었다.
		
		g1[2].setName("전자렌지");//객체배열의 멤버메소드를 통해 멤버변수에 값 넣기
		g1[2].setPrice(700000);
		
		for(int i=0; i<g1.length; i++) {
			//객체(예:g1[i])의 멤버변수 name 접근
			//그러나  멤버변수에 직접 접근하는 것은 객체지향에 위배
			
			//객체의 메소드를 통해서 멤버변수에 접근
			g1[i].print();
		}
	}

}
