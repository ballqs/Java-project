import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("C:\\Users\\it\\Desktop\\����.txt");
			while(true) {
				String line = sc.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
