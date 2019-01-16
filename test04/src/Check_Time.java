
public class Check_Time {

	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int n=6; n>i; n--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
