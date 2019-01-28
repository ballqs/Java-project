
public class Person {
	
	void addAge(int age) {
		int age2 = age + 10;
		System.out.println("Person : "+age2);
	}
	
	void addAgeArr(int ageArr[]) {
		ageArr[0] = ageArr[0] + 10;
		ageArr[1] = ageArr[1] + 10;
		ageArr[2] = ageArr[2] + 10;
		System.out.println("Person : "+ageArr[0]);
	}
	
	void addCar(Car c1) {
		c1.year = c1.year + 10;
		System.out.println("Person Car : "+c1.year);
	}
	
	void addCarArr(Car c1[]) {
		c1[0].year = c1[0].year + 10;
		System.out.println("Person CarArr : "+c1[0].year);
	}
}
