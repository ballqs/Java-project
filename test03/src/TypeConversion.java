
public class TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);//byte�� intŸ������ ��ȯ
		System.out.println(10/4);//���� ������������ intŸ��
		System.out.println(10.0/4);//�Ǽ� ������������doubleŸ��
		System.out.println((char)0x12340041);//char�� ��ȯ�� ��� ����'A'
		System.out.println((byte)(b+i));//byte�� 256�� �ִ������� 128���� ���ٰ� -�κк��� �ٽ� �޿� �ö󰣴� �׷��� -29�̴�.
		System.out.println((int)2.9+1.8);//���� + 1.8 = 3.8
		System.out.println((int)(2.9+1.8));//�ȿ��� ���� ���� int������ �Ǽ� 4
		System.out.println((int)2.9 + (int)1.8);//�Ѵ� int�̱⿡ 3
	}

}
