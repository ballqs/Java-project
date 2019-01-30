package test06;


public class test04 {

	public static void main(String[] args) {
		test04_1Rectangle r = new test04_1Rectangle(2, 2, 8, 7);
		test04_1Rectangle s = new test04_1Rectangle(5, 5, 6, 6);
		test04_1Rectangle t = new test04_1Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r))System.out.println("t는 r를 포함합니다.");
		if(t.contains(s))System.out.println("t는 s를 포함합니다.");
	}

}
