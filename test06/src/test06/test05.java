package test06;

import java.util.Scanner;


public class test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test05_1Cirlce t[] = new test05_1Cirlce[3];
		for(int i=0; i<t.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			t[i] = new test05_1Cirlce(x,y,radius);
		}
		for(int i=0; i<t.length; i++) {
			t[i].show();
		}
		sc.close();
	}

}

