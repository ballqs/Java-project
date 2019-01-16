
public class UnaryOperator {

	public static void main(String[] args) {
		int opr = 0;
		opr += 3;// opr = opr + 3
		System.out.println(opr++);// opr = 3 출력 후 증가
		System.out.println(opr);// opr = 4
		System.out.println(++opr);// opr = 5증가 후 출력
		System.out.println(opr);// opr = 5
		System.out.println(opr--);// opr = 5 출력 후 감소
		System.out.println(opr);// opr = 4
		System.out.println(--opr);// opr = 3 감소 후 출력
		System.out.println(opr);// opr = 3
	}

}
