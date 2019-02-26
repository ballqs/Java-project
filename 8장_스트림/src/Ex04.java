
import java.io.FileReader;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		try {
			Scanner fScanner = new Scanner(new FileReader("c:\\windows\\system.ini"));
			int c = 1;
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				System.out.println(c+": "+line);
				c++;
			}
			fScanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
