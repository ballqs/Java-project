package test;

class Person {
	//Ŭ������ ����� ���� 3���
	//1.(���)����(=�ʵ�) - > ��� ������ �ƴѰ� ����ü �����ΰ�?
	//2.������(=Ŭ���� �̸��� ������ �޼ҵ�)
	//3.(���)�޼ҵ�(=�Ϲݸ޼ҵ�, �Ϲ��Լ�)
	
	//1.���� ����� <-> ���ƴ�
	int age;
	String name;

	//2.������(������ ����� <-> ���ƴ�!), ��� ���?
	Person(){ //��ȯ�� ����
		
	}

	//3.�޼ҵ� ����� <-> ���ƴ�
	void printNumber(int num){
		int a = num;
		System.out.println("���̴� "+age+"�Դϴ�.");
	}

	void setAge(int age){
		this.age = age;
		//�ν��Ͻ� ������ �޼ҵ尡 �ʿ�� ������ ������ ����
	}

	void printAge(){
		//���� �ı� age(=�������)�� ��� -> ������
		System.out.println(age);
	}
}