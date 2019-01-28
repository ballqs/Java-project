package test;

import java.util.Scanner;

class Human{
	Scanner sc = new Scanner(System.in);
	private String name;
	protected int age; //protected�� ���� ��Ű�� ������ �� ������� ��� ����! �ٸ� ��Ű���� ����� �Ұ����ϴ�.
	private double height,weight; //private�� ��ӹ��� ���� Ŭ���������� ����� �Ұ���! ���� ���� Ŭ������������ ����
	//��������� public�� �ȵ�!! private or protected���� ����
	
	//�����ڴ� ������ public�� ���� ��!
	public Human(){
		//private�޼ҵ带 �ҷ��ͼ� ����� ���
		printAll();//private������ ���� �ı�(���� �ı��� public�̶�� �ٸ� Ŭ���������� �ҷ��� ��� ��������)�ȿ� �־ ����Ҽ� �ִ�.
	}
	
	public Human(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//�޼ҵ�� public�̳�? private��?
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
		System.out.print("�̸��� : "+name+",");
		System.out.print("���̴� : "+age+",");
		System.out.print("Ű�� : "+height+",");
		System.out.println("�����Դ� : "+weight);
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
