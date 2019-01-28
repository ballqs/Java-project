package test;

import java.util.Scanner;

class Human{
	Scanner sc = new Scanner(System.in);
	private String name;
	protected int age; //protected는 같은 패키지 내에서 이 멤버변수 사용 가능! 다른 패키지는 사용이 불가능하다.
	private double height,weight; //private는 상속받은 하위 클래스에서도 사용이 불가능! 오직 같은 클래스내에서만 가능
	//멤버변수는 public은 안됨!! private or protected으로 지정
	
	//생성자는 무조건 public를 붙일 것!
	public Human(){
		//private메소드를 불러와서 사용한 경우
		printAll();//private이지만 같은 식구(같은 식구가 public이라면 다른 클래스에서도 불러서 사용 가능해짐)안에 넣어서 사용할수 있다.
	}
	
	public Human(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//메소드는 public이냐? private냐?
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setHeight(double height) {
//		this.height = height;
//	}
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void printAll() {
		System.out.print("이름은 : "+name+",");
		System.out.print("나이는 : "+age+",");
		System.out.print("키는 : "+height+",");
		System.out.println("몸무게는 : "+weight);
	}
}
public class HumanArray {

	public static void main(String[] args) {
		Human aHuman[] = new Human[5];
		for(int i = 0; i<aHuman.length; i++) {
			aHuman[i] = new Human(aHuman[i].sc.next(),aHuman[i].sc.nextInt(),aHuman[i].sc.nextDouble(),aHuman[i].sc.nextDouble());
		}
		
		for(int i = 0; i<aHuman.length; i++) {
			aHuman[i].printAll();
		}
	}

}
