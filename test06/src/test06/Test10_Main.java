package test06;

import java.util.Scanner;

public class Test10_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		String word_kor,word_eng;
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			word_kor = sc.next();
			if(word_kor.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}else {
				word_eng = Test10_Dictionary.kor2Eng(word_kor);
				if(word_kor == word_eng) {
					continue;
				}else {
					System.out.println(word_kor+"�� "+word_eng);
				}
			}
		}
	}

}
