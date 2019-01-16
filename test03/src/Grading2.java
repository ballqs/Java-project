import java.util.Scanner;

public class Grading2 {
	public static void main (String[] args) {
		String grade;
		Scanner a = new Scanner(System.in);
		while (a.hasNext()) {
			int score = a.nextInt();
			switch (score/10) { //정수형으로 나누는 거이기 때문에 소수점은 짜른다.
				case 10:
				case 9:
					grade = "학점은 A입니다";
					break;
				case 8:
					grade = "학점은 B입니다";
					break;
				case 7:
					grade = "학점은 C입니다";
					break;
				case 6:
					grade = "학점은 D입니다";
					break;
				case 5: case 4: case 3: case 2: case 1: case 0:
					grade = "학점은 F입니다";
					break;
				default:
					grade = "그런 점수는 없어 임마!";
			}
			System.out.println(grade);
		}
	}
}