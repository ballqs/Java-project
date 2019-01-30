package test06;

public class test06_1Circlemanager{
	private double x, y,area;
	private int radius;
	final private double PI = 3.14;
	public test06_1Circlemanager(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("가장 면적이 큰 원은 ("+x+","+y+")"+radius);
	}
	public double area(double radius) {
		this.area = radius*radius*PI;
		return area;
	}
}
