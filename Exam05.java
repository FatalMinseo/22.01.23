import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		int r = num1 % 2;
		switch (r) {
		case 1:
			System.out.println("홀수입니다!");
			break;
		case 0:
			System.out.println("짝수입니다!");
			break;

		}
		sc.close();
	}
}
