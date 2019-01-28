
public class PersonMain {

	public static void main(String[] args) {
		//age는 main()메소드의 지역변수, 멤버변수 아님!
		int age = 20;
		int ageArr[] = {11,22,33};
		Person p1 = new Person();
		p1.addAge(age);
		
		System.out.println("PersonMain : "+age);
		
		//배열은  메소드 인자 전달을 했을시 해당 메소드에 인해 값이 바뀌면
		//그 값을 가져옴... 복사해서 보낸게 아니기 때문
		p1.addAgeArr(ageArr);
		System.out.println("Person : "+ageArr[0]);
		
		
		//객체 또한 인자를 전달했을시 복사해서 보낸게 아니기 때문에 값이 바뀌면
		//여기에 영향을 미침
		Car c1 = new Car();//2015년산 자동차 생성
		System.out.println("PersonMain Car : "+c1.year);
		c1.year = 2015;
		p1.addCar(c1);
		System.out.println("PersonMain Car : "+c1.year);
		
		Car c2[] = new Car[3];
		c2[0] = new Car();
		c2[1] = new Car();
		c2[2] = new Car();
		
		p1.addCarArr(c2);
		System.out.println("PersonMain CarArr : "+c2[0].year);
	}

}
