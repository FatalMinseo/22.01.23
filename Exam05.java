import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();

		int r = num1 % 2;
		switch (r) {
		case 1:
			System.out.println("Ȧ���Դϴ�!");
			break;
		case 0:
			System.out.println("¦���Դϴ�!");
			break;

		}
		sc.close();
	}
}
