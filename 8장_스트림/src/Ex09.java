import java.io.File;

public class Ex09 {

	public static void main(String[] args) {
		File location = new File("C:\\Users\\it\\Desktop\\");
		File subFiles[] = location.listFiles();
		String str;
		int count=0;
		for(int i=0; i<subFiles.length; i++) {
			if(!subFiles[i].isFile()) {
				continue;
			}
			str = subFiles[i].getName();
			// for���� ���� str�� ���ϸ��� ��´�.
			int index = str.lastIndexOf(".txt");
			// Ȯ����� txt�� ��� index�� ���ڸ� ��´�.
			if(index != -1) {
				// index�� -1�� �ƴ� ��� txt�����̶� �ǹ�
				subFiles[i].delete();
				// �����ϴ� ��ɾ�
				System.out.println(subFiles[i].getPath()+" ����");
				// subFiles[i].getPath() : ��� �ľ��Ҽ� �ִ� ��ɾ�
				count++;
			}
		}
		System.out.println("�� "+count+"���� .txt ������ �����Ͽ����ϴ�.");
	}

}
