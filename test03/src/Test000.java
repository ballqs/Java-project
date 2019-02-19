class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println(name+" "+age+" ");
	}
}
class Student extends Person{
	String major;
	public Student(String name,int age,String major){
		super(name,age);
		this.major = major;
	}
	public void show() {
		System.out.println(name+" "+age+" "+major);
	}
	
}

public class Test000 {

	public static void main(String[] args) {
		Person p = new Student("홍길동",20,"컴퓨터공학");
		p.show();
	}

}
