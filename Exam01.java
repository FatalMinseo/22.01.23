import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		// int num2 = 100; ����� - ������(���ʿ�)
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		} else {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		}
		
		sc.close();
	}

}
