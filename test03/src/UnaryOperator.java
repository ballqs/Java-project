
public class UnaryOperator {

	public static void main(String[] args) {
		int opr = 0;
		opr += 3;// opr = opr + 3
		System.out.println(opr++);// opr = 3 ��� �� ����
		System.out.println(opr);// opr = 4
		System.out.println(++opr);// opr = 5���� �� ���
		System.out.println(opr);// opr = 5
		System.out.println(opr--);// opr = 5 ��� �� ����
		System.out.println(opr);// opr = 4
		System.out.println(--opr);// opr = 3 ���� �� ���
		System.out.println(opr);// opr = 3
	}

}
