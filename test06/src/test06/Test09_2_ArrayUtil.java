package test06;

public class Test09_2_ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int array0[] = new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			array0[i] = a[i];
		}
		for(int i=a.length; i<array0.length; i++) {
			array0[i] = b[i-a.length];
		}
		return array0;
	}
	public static void print(int[] a) {
		String str = "";
		for(int i=0; i<a.length; i++) {
			str = str + a[i]+" ";
		}
		System.out.println("[ "+str+"]");
	}
}
