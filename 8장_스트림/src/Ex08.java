import java.io.File;

public class Ex08 {
	public static void main(String[] args) {
		File size = new File("c:\\");
		File subFiles[] = size.listFiles();
		File f = null;
		long max = 0;
		try {
			for(int i = 0; i<subFiles.length; i++) {
				long filesize = subFiles[i].length();
				if(max < filesize) {
					// 2���� longŸ���� ����� ���ؼ� ū���� ���Ѵ�.
					max = filesize;
					f = subFiles[i];
				}
			}
			System.out.println("���� ū ������ "+f.getName()+" "+max+"����Ʈ");
//			fin = new FileInputStream(new File("C:\\Windows"));
//			in = new InputStreamReader(fin);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
