package test;

public class Basic_01{
	public static void main(String[] args){
	//다른 클래스들을 사용하는 곳
	
	//비교 예외적인거
	String s1; //누군가 String 클래스를 만들어 놓은것!
		//그래서 Person이랑 같다.
	Integer i1; //Person이랑 같음

	int a; //변수 만들기(int는 자료형 데이터타입)
	a=0; // 변수 사용하기
	//2.클래스 사용하기 <-> 만들기 아님
	Person p1;//클래스 사용? 어디 사용? 객체 만들기
	//자료형 변수
	//클래스 객체
	//자료형을 내가 만들어서 사용할수 있다.

	//p1을 변수라고 하는데 객체, 객체 변수라고도 한다.
	//p1은 아직 객체가 덜되었음
	//-------------------------------------------------------
	p1 = new Person();//이 한줄을 치면 p1은 객체가 되었다.
	//"new Person();" => 객체!!!
	//Person() => 생성자!!! 사용하는 거임 <-> 만드는거 아님
	
	new Person(); // 이름 없는 개체, 익명 객체, 무명 객체
	
	//그래서 이름을 주기위해 밑에와 같이 사용
	Person p2 = new Person();

	//정리
	//1. 클래스 만들기
	//2. 클래스 사용하기(3과 동일)
	//3. 객체 만들기 (2와 동일)
	//4. 객체 사용 (★★★★★)
	p1.age = 33;//객체사용 -> 객체의 멤버변수 사용
	p1.printNumber(28);//객체사용 -> 객체의 멤버메소드 사용
	//ctnl + 클릭 <- 클릭한 메소드 이동
	p1.setAge(25);
	p1.printAge();

	p1.age = 50;
	p1.printAge();
	
	p2.setAge(39);
	p2.printAge();

	Car c1;//미생, 객체변수, 레퍼런스
	c1 = new Car();//완생, 이부분이 생성자 사용
	
	Car c2 = new Car("안녕");
	c2.printCar();
	}
}