import java.util.Scanner;

public class Grading2 {
	public static void main (String[] args) {
		String grade;
		Scanner a = new Scanner(System.in);
		while (a.hasNext()) {
			int score = a.nextInt();
			switch (score/10) { //���������� ������ ���̱� ������ �Ҽ����� ¥����.
				case 10:
				case 9:
					grade = "������ A�Դϴ�";
					break;
				case 8:
					grade = "������ B�Դϴ�";
					break;
				case 7:
					grade = "������ C�Դϴ�";
					break;
				case 6:
					grade = "������ D�Դϴ�";
					break;
				case 5: case 4: case 3: case 2: case 1: case 0:
					grade = "������ F�Դϴ�";
					break;
				default:
					grade = "�׷� ������ ���� �Ӹ�!";
			}
			System.out.println(grade);
		}
	}
}