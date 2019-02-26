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
			// for문을 돌려 str에 파일명을 담는다.
			int index = str.lastIndexOf(".txt");
			// 확장명이 txt일 경우 index에 숫자를 담는다.
			if(index != -1) {
				// index가 -1가 아닐 경우 txt파일이란 의미
				subFiles[i].delete();
				// 삭제하는 명령어
				System.out.println(subFiles[i].getPath()+" 삭제");
				// subFiles[i].getPath() : 경로 파악할수 있는 명령어
				count++;
			}
		}
		System.out.println("총 "+count+"개의 .txt 파일을 삭제하였습니다.");
	}

}
