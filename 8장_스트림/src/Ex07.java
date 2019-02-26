import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex07 {

	public static void main(String[] args) {
		File src = new File("C:\\Users\\it\\Desktop\\a.png");//������ �̹��� ���
		File dest = new File("C:\\Users\\it\\Desktop\\�̹���.png");//������ ���
		
		int c;
		
		try {
			BufferedInputStream fi = new BufferedInputStream(new FileInputStream(src));
			BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream(dest));
			System.out.println("a.png�� �̹���.png�� �����մϴ�. \n10%���� *�� ����մϴ�.");
			long tenPercent = src.length() / 10; //���� ���̸� 10���� 1�� ����
			// tenPercent�� ������ ���� 10���� 1 ���ذ�
			long progress = 0; // ���� ũ�� 10% �� ������ ���� ���� ����Ʈ ��
			byte[] buf = new byte[1024]; //�� �� �д� ����
			int numRead = 0; // ���� ����Ʈ ��
			while(true) {
				/*(c = fi.read()) != -1*/
				numRead = fi.read(buf,0,buf.length);
				//buf�� 0���� buf�� ���� 1024���� ������
				if(numRead == -1) {
					if(progress > 0) {
						// �������� �о����� 10%�� �������� �ʾ� *�� ��µ��� ���� ���
						// �� ������ ���?
						System.out.print("*");
					}
					break; // ���� ���� ������
				}
				if(numRead > 0) {
					fo.write(buf,0,numRead);
				}
				progress += numRead; // ���� ũ�� 10% �� ������ ���� ����
				if(progress >= tenPercent) {
					// progress�� tenPercent�� ������ 10%�� �����Ѱ� �ǹ����ϱ�
					// *�� �ϳ� ���!
					System.out.print("*");
					progress = 0;
					// �׸��� progress�� 0���� ���� �ʱ�ȭ
				}
//				fo.write((byte)c);
			}
			fi.close();
			fo.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
