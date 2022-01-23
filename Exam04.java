
public class Exam04 {

	public static void main(String[] args) {
		// switch - 조건문
		int num = 10;
		// num의 값이 10이면 안녕하세욜,ㄹ 출력
		// 20이면 안녕히가세요를 출력
		// 30이면 어서오세요를 출력
		// 이 이외의 숫자를 입력하면 정확한 숫자가 아닙니다.
		switch (num) {
		case 10:
			System.out.println("안녕하세요.");
			break;
		case 20:
			System.out.println("안녕히가세요.");
			break;
		case 30:
			System.out.println("어서오세요.");
			break;
		default:
			System.out.println("정확한 숫자가 아닙니다.");
			break;
		}

	}

}
