package test;

public class Car {
	//����, ������, �޼ҵ�
	
	//1.������� <-> ��������� ���� �������� ����.
	String type;
	String name;
	int maxSpeed;
	int curSpeed;
	int minSpeed;
	String str;
	
	//2.������
	//�������� Ư¡ ->�ܸ����� Ư¡ 1.Ŭ������� ���� 2.��ȯ���� ����� �Ѵ� 3.
	//�������� Ư¡ => ��������� �ʱ�ȭ(�⺻��) ��Ų��.
	Car(){//���� �ʱ�ȭ <-- Car()�����ڴ� ���� ������ �ִ�.
		type = "SUV"; //��ü�� ���� ������ �ȴ�.
		name = "��Ÿ��";
		maxSpeed = 200;
		curSpeed = 0;
		minSpeed = 0;
	}
	
	Car(String name1){//�޼ҵ�� �̸��ߺ��� ����Ѵ�.
		this();//Car() �ҷ����� �ڵ�
		str = name1;
	}
	//3.����޼ҵ�
	void printCar(){
		System.out.println(str);
	}
}
