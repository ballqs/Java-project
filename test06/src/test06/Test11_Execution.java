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
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >>");
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
				System.out.print("�׷� ��ȣ�� �����ϴ�.");
				break;
		}
		System.out.println(TC.calculate());
	}
}
