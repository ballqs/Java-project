
public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println('a' > 'b');//���ڳ����� �񱳰� �Ұ����ؼ� false
		System.out.println(3 >= 2);//3�� 2���� ũ�ϱ� true
		System.out.println(-1 < 0);//-1�� 0���� �����ϱ� true
		System.out.println(3.45 <= 2);//3.45���� 2�� Ŭ���� ���� false
		System.out.println(3 == 2);//3�� 2�� �������� ���� false
		System.out.println(3 != 2);//3�� 2�� �ٸ��� true
		System.out.println(!(3 != 2));//2�� �������� ���ٴ� �����ȣ������ 3�� 2�� �������� ���� false
		System.out.println((3 > 2) && (3 > 4));//�Ѵ� ������ true���� true������ �ڿ� ������ Ʋ�ȴ�.
		System.out.println((3 != 2) || (-1 > 0));//���� �ϳ��� true�̸� true�̱⿡ true�̴�.
		System.out.println((3 != 2) ^ (-1 > 0));//^�� �Ѵ� ���� true�̰ų� false�̸� �ȵȴ�. �׷��⿡ true

	}

}
