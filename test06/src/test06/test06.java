package test06;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		double x,y;
		int radius = 0;
		Scanner sc = new Scanner(System.in);
		test06_1Circlemanager t[] = new test06_1Circlemanager[3];
		for(int i=0; i<t.length; i++) {
			System.out.print("x, y, radius >>");
			x = sc.nextDouble();
			y = sc.nextDouble();
			radius = sc.nextInt();
			t[i] = new test06_1Circlemanager(x,y,radius);
			t[i].area(radius);
		}
		double a = t[0].area(radius);
		double b = t[1].area(radius);
		double c = t[2].area(radius);
		if(a > b) {
			if(a > c) {
				t[0].show();
			}else if(a < c) {
				t[2].show();
			}
		}else if(a < b) {
			if(b > c) {
				t[1].show();
			}else if(b < c) {
				t[2].show();
			}
		}
		sc.close();
	}
}
