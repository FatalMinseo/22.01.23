
public class Exam04 {

	public static void main(String[] args) {
		// switch - ���ǹ�
		int num = 10;
		// num�� ���� 10�̸� �ȳ��ϼ���,�� ���
		// 20�̸� �ȳ��������並 ���
		// 30�̸� ������並 ���
		// �� �̿��� ���ڸ� �Է��ϸ� ��Ȯ�� ���ڰ� �ƴմϴ�.
		switch (num) {
		case 10:
			System.out.println("�ȳ��ϼ���.");
			break;
		case 20:
			System.out.println("�ȳ���������.");
			break;
		case 30:
			System.out.println("�������.");
			break;
		default:
			System.out.println("��Ȯ�� ���ڰ� �ƴմϴ�.");
			break;
		}

	}

}
