package test06;

public class test05_1Cirlce{
	private double x, y;
	private int radius;
	public test05_1Cirlce(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
}

