import java.io.IOException;
import java.io.InputStreamReader;

public class inputExample {

	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		//InputStreamReader�� ����Ʈ ��Ʈ��(2����)�� ĳ���� ��Ʈ��(int�� ������)���� �ٲپ��ִ� ���� ������ �ϴ� Ŭ����
		//System.in�� ���� PC�� Ű����� ������(����)�� �޾Ƶ��̴� ��� ����Ʈ�� ��ȯ�Ѵ�.
				try{//���� �߻�ó���� ���� ��ɾ����� try�� ���������� ���ư��� ������ ���� �߻��� catch�� ����.
						while(true) {//while�� true�϶� �ݺ��� ����
							int a = rd.read();//InputStreamReader�� ���� ����Ʈ�� a�� ����
							if(a == -1)//a�� -1�� �ɶ� �� �ݺ����� ����������.
								break;//���������� ��ɾ�
							System.out.println((char)a);//������ a�� charŸ������ ��ȯ���� ���
						}
				}catch(IOException e) {//���� �߻��� ����� �´�.
					System.out.println("�Է� ���� �߻�");//���� �߻��ϸ� �ߴ� ��±�
				}

	}

}
