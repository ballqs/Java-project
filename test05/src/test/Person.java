package test;

class Person {
	//클래스를 만드는 구성 3요소
	//1.(멤버)변수(=필드) - > 멤버 변수가 아닌게 도대체 무엇인가?
	//2.생성자(=클래스 이름과 동일한 메소드)
	//3.(멤버)메소드(=일반메소드, 일반함수)
	
	//1.변수 만들기 <-> 사용아님
	int age;
	String name;

	//2.생성자(생성자 만들기 <-> 사용아님!), 어떻게 사용?
	Person(){ //반환값 없음
		
	}

	//3.메소드 만들기 <-> 사용아님
	void printNumber(int num){
		int a = num;
		System.out.println("나이는 "+age+"입니다.");
	}

	void setAge(int age){
		this.age = age;
		//인스턴스 변수랑 메소드가 필요로 가져온 변수랑 별개
	}

	void printAge(){
		//같은 식구 age(=멤버변수)를 출력 -> 연관성
		System.out.println(age);
	}
}