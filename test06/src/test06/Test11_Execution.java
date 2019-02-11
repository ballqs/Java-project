package test06;

import java.util.Scanner;

public class Test11_Execution {
	Scanner sc = new Scanner(System.in);
	private int num1;
	private int num2;
	private String Cal;
	Test11_calculate TC;
	Test11_Execution(){
		TC = new Test11_calculate();
	}
	public void run() {
		System.out.print("두 정수와 연산자를 입력하시오 >>");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		Cal = sc.next();
		TC.setValue(num1, num2);
		switch(Cal) {
			case "+":
				TC.Add();
				break;
			case "-":
				TC.Sub();
				break;
			case "*":
				TC.Mul();
				break;
			case "/":
				TC.Div();
				break;
			default:
				System.out.print("그런 부호는 없습니다.");
				break;
		}
		System.out.println(TC.calculate());
	}
}
