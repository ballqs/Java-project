
public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println('a' > 'b');//문자끼리는 비교가 불가능해서 false
		System.out.println(3 >= 2);//3은 2보다 크니까 true
		System.out.println(-1 < 0);//-1은 0보다 작으니까 true
		System.out.println(3.45 <= 2);//3.45보다 2가 클리가 없다 false
		System.out.println(3 == 2);//3과 2는 같을수가 없다 false
		System.out.println(3 != 2);//3과 2는 다르다 true
		System.out.println(!(3 != 2));//2번 꼬았지만 같다는 연산기호이지만 3과 2는 같을수가 없다 false
		System.out.println((3 > 2) && (3 > 4));//둘다 조건이 true여야 true이지만 뒤에 조건이 틀렸다.
		System.out.println((3 != 2) || (-1 > 0));//둘중 하나라도 true이면 true이기에 true이다.
		System.out.println((3 != 2) ^ (-1 > 0));//^는 둘다 같은 true이거나 false이면 안된다. 그렇기에 true

	}

}
