import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("C:\\Users\\it\\Desktop\\¿¬½À.txt");
			in = new InputStreamReader(fin);
			
			int c;
			while((c = in.read()) != -1) {
				c = Character.toUpperCase(c);
				System.out.print((char)c);
				
//				String line = Integer.toString(in.read());
//				line = line.toUpperCase();
			}
			in.close();
			fin.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}

}
