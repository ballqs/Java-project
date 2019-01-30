package test06;

public class test04_1Rectangle{
	private int x;//1
	private int y;//1
	private int width;//10
	private int height;//10
	test04_1Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}

	public int square() {
		int area = width * height;
		return area;
	}

	public boolean contains(test04_1Rectangle r) {
		boolean a;
		if(x<r.x && y<r.y && x+width>r.x+r.width && y+height>r.y+r.height) {
			a = true;
		}else {
			a = false;
		}
		return a;
	}
}
