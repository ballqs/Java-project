
public class PersonMain {

	public static void main(String[] args) {
		//age�� main()�޼ҵ��� ��������, ������� �ƴ�!
		int age = 20;
		int ageArr[] = {11,22,33};
		Person p1 = new Person();
		p1.addAge(age);
		
		System.out.println("PersonMain : "+age);
		
		//�迭��  �޼ҵ� ���� ������ ������ �ش� �޼ҵ忡 ���� ���� �ٲ��
		//�� ���� ������... �����ؼ� ������ �ƴϱ� ����
		p1.addAgeArr(ageArr);
		System.out.println("Person : "+ageArr[0]);
		
		
		//��ü ���� ���ڸ� ���������� �����ؼ� ������ �ƴϱ� ������ ���� �ٲ��
		//���⿡ ������ ��ħ
		Car c1 = new Car();//2015��� �ڵ��� ����
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
