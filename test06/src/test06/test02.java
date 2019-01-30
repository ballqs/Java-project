package test06;

import java.util.Scanner;

public class test02 {
//한 java파일당 class는 public 1개만 있어야한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		test02_1Grade me = new test02_1Grade(math, science, english);
		System.out.println("평균 : "+ me.average());
		
		sc.close();
	}

}
