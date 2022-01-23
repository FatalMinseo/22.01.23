import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		System.out.print("DB : ");

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int num2 = sc.nextInt();
		System.out.print("OS : ");
		int num3 = sc.nextInt();
		System.out.print("데이터통신 : ");
		int num4 = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int num5 = sc.nextInt();

		if (num1 > 20 || num2 > 20 || num3 > 20 || num4 > 20 || num5 > 20) {
			System.out.println("재입력하세요!");
		}

		else if (num1 >= 8 && num2 >= 8 && num3 >= 8 && num4 >= 8 && num5 >= 8
				&& num1 + num2 + num3 + num4 + num5 >= 60) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}

		// if 만약 ex) if(조건문)
		// else 아니면 ex) else(조건문x)
		// else if 아니면 만약 ex) else if(조건문) 
		
		// int total = num1 + num2 + num3 + num4 + num5; 
		// boolean isCheck1 = num1 >= 8 && num2 >= 8 && num3 >= 8 && num4 >= 8 && num5 >= 8
		// boolean isCheck2 = total >= 60;
		// boolean result = isCheck1 && isCheck2;
		// if(result) {
		//		System.out.println("합격입니다!");
		//	}else {
		//		System.out.println("불합격입니다");
		//	}
		
		sc.close();
	}

}
