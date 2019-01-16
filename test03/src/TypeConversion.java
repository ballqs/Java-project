
public class TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);//byte가 int타입으로 변환
		System.out.println(10/4);//정수 나누기임으로 int타입
		System.out.println(10.0/4);//실수 나누기임으로double타입
		System.out.println((char)0x12340041);//char로 변환된 결과 문자'A'
		System.out.println((byte)(b+i));//byte는 256가 최대임으로 128까지 갔다가 -부분부터 다시 쭈욱 올라간다 그래서 -29이다.
		System.out.println((int)2.9+1.8);//정수 + 1.8 = 3.8
		System.out.println((int)(2.9+1.8));//안에서 나온 값이 int형으로 되서 4
		System.out.println((int)2.9 + (int)1.8);//둘다 int이기에 3
	}

}
