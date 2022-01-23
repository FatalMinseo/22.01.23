import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		// int num2 = 100; 노란줄 -  사용안함(불필요)
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "는(은) 짝수입니다.");
		} else {
			System.out.println(num + "는(은) 홀수입니다.");
		}
		
		sc.close();
	}

}
