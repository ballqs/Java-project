import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)>>");
		int i = sc.nextInt();
		String sum = ""+((double)i / 1100);
		String str = sum.substring(0,4);
		System.out.println(i+"원은 $"+str+"입니다.");
	}

}
