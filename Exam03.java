import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int m = sc.nextInt();
		System.out.print("���� : ");
		int e = sc.nextInt();
		System.out.print("���� : ");
		int s = sc.nextInt();

		int mean = (m + e + s) * 100 / 3;
		System.out.print("����� " + mean / 100 + "." + mean % 100 + "�� ");

		if (mean >= 9000) {
			System.out.println("A���� �Դϴ�.");
		} else if (mean >= 8000) {
			System.out.println("B���� �Դϴ�.");

		} else if (mean >= 7000) {
			System.out.println("C���� �Դϴ�.");
		} else {
			System.out.println("F���� �Դϴ�.");
		}

//		boolean isCheck1 = mean >=90;
//		boolean isCheck2 = mean < 90 && mean >=80;
//		boolean isCheck3 = mean < 80 && mean >=70;
//		
//		if(isCheck1) {
//			System.out.println("A���� �Դϴ�.");
//		} else if (isCheck2) {
//			System.out.println("B���� �Դϴ�.");
//		} else if (isCheck3) {
//			System.out.println("C���� �Դϴ�.");
//		} else {
//			System.out.println("F���� �Դϴ�.");
//		}

		
		
		
		
//		System.out.print("���� : ");
//		int m = sc.nextInt();
//		System.out.print("���� : ");
//		int e = sc.nextInt();
//		System.out.print("���� : ");
//		int s = sc.nextInt();
//
//		double mean = (m + e + s)  / 3.0;
//		int mean2 = (int)(mean * 100);
//		double mean3 = mean2 / 100;
//
//
//		if (mean3 >= 90) {
//			System.out.println("A���� �Դϴ�.");
//		} else if (mean3 >= 80) {
//			System.out.println("B���� �Դϴ�.");
//
//		} else if (mean3 >= 70) {
//			System.out.println("C���� �Դϴ�.");
//		} else {
//			System.out.println("F���� �Դϴ�.");
//		}
		sc.close();
	}

}
