import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();

		int r = score / 10;

		switch (r) {
		case 10:
			System.out.println("A�����Դϴ�!");
			break;
		case 9:
			System.out.println("A�����Դϴ�!");
			break;
		case 8:
			System.out.println("B�����Դϴ�!");
			break;
		case 7:
			System.out.println("C�����Դϴ�!");
			break;

		default:
			System.out.println("D�����Դϴ�!");
			break;
			
			
		}sc.close();
	}

}
