import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수학 : ");
		int m = sc.nextInt();
		System.out.print("영어 : ");
		int e = sc.nextInt();
		System.out.print("과학 : ");
		int s = sc.nextInt();

		int mean = (m + e + s) * 100 / 3;
		System.out.print("평균은 " + mean / 100 + "." + mean % 100 + "점 ");

		if (mean >= 9000) {
			System.out.println("A학점 입니다.");
		} else if (mean >= 8000) {
			System.out.println("B학점 입니다.");

		} else if (mean >= 7000) {
			System.out.println("C학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}

//		boolean isCheck1 = mean >=90;
//		boolean isCheck2 = mean < 90 && mean >=80;
//		boolean isCheck3 = mean < 80 && mean >=70;
//		
//		if(isCheck1) {
//			System.out.println("A학점 입니다.");
//		} else if (isCheck2) {
//			System.out.println("B학점 입니다.");
//		} else if (isCheck3) {
//			System.out.println("C학점 입니다.");
//		} else {
//			System.out.println("F학점 입니다.");
//		}

		
		
		
		
//		System.out.print("수학 : ");
//		int m = sc.nextInt();
//		System.out.print("영어 : ");
//		int e = sc.nextInt();
//		System.out.print("과학 : ");
//		int s = sc.nextInt();
//
//		double mean = (m + e + s)  / 3.0;
//		int mean2 = (int)(mean * 100);
//		double mean3 = mean2 / 100;
//
//
//		if (mean3 >= 90) {
//			System.out.println("A학점 입니다.");
//		} else if (mean3 >= 80) {
//			System.out.println("B학점 입니다.");
//
//		} else if (mean3 >= 70) {
//			System.out.println("C학점 입니다.");
//		} else {
//			System.out.println("F학점 입니다.");
//		}
		sc.close();
	}

}
