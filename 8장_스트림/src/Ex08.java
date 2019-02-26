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
					// 2개의 long타입을 만들어 비교해서 큰값을 구한다.
					max = filesize;
					f = subFiles[i];
				}
			}
			System.out.println("가장 큰 파일은 "+f.getName()+" "+max+"바이트");
//			fin = new FileInputStream(new File("C:\\Windows"));
//			in = new InputStreamReader(fin);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
