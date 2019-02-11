package test06;

import java.util.Scanner;

public class Test10_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		String word_kor,word_eng;
		while(true) {
			System.out.print("한글 단어?");
			word_kor = sc.next();
			if(word_kor.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				word_eng = Test10_Dictionary.kor2Eng(word_kor);
				if(word_kor == word_eng) {
					continue;
				}else {
					System.out.println(word_kor+"은 "+word_eng);
				}
			}
		}
	}

}
