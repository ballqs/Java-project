
public class ArrayPassingEx {
	
	public static void main(String[] args) {
		new ArrayPassingEx3();
	}
	
}

class ArrayPassingEx3 {
	public ArrayPassingEx3() {
		ArrayPassingEx2 a = new ArrayPassingEx2();
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		a.printCharArray(c);
		a.replaceSpace(c);
		a.printCharArray(c);
	}
}