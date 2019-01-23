package test;

public class Car {
	//변수, 생성자, 메소드
	
	//1.멤버변수 <-> 멤버변수는 값을 가질수가 없다.
	String type;
	String name;
	int maxSpeed;
	int curSpeed;
	int minSpeed;
	String str;
	
	//2.생성자
	//생성자의 특징 ->외모적인 특징 1.클래스명과 동일 2.반환값이 없어야 한다 3.
	//내용적인 특징 => 멤버변수를 초기화(기본값) 시킨다.
	Car(){//값을 초기화 <-- Car()생성자는 값을 가질수 있다.
		type = "SUV"; //객체가 값을 가지게 된다.
		name = "산타페";
		maxSpeed = 200;
		curSpeed = 0;
		minSpeed = 0;
	}
	
	Car(String name1){//메소드는 이름중복을 허용한다.
		this();//Car() 불러오는 코드
		str = name1;
	}
	//3.멤버메소드
	void printCar(){
		System.out.println(str);
	}
}
