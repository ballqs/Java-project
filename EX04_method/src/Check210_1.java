import java.util.Scanner;

class OneArray{
	
	double[] setArr() {
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		return arr;
	}
	void getSum(double arr[], double sum[], double mult[]) {
		
		for(int i=0; i<arr.length; i++) {
			sum[0] += arr[i];
			mult[0] *= arr[i];
		}
		System.out.println("합계 : "+sum[0]);
		System.out.println("모든곱 : "+mult[0]);
	}
}

public class Check210_1 {
	public static void main(String[] args) {
		OneArray oa = new OneArray();
		double sum[] = new double[1],mult[] = new double[1];
		sum[0] = 0; mult[0] = 1;
		System.out.print("5개의 숫자를 입력해주세요.>>");
		double[] a = oa.setArr();
		oa.getSum(a,sum,mult);//배열,합,곱셈
	}

}
