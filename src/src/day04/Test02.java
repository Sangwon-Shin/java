package day04;
import java.util.Scanner;
public class Test02 {
	/*�ַܼ� �Է¹޴� ���
	1.
			import java.util.Scanner;
		�� ����� Ŭ����(Scanner)�� �ִ� ��ġ�� �˷��ְų�
			import java.util.*;
		�� Ŭ������ ���� Ŭ����(util) ���� ��� Ŭ�������� ���Խ�Ű�� �ȴ�.
	2.
		�Լ� ������
			Scanner sc = new Scanner(System.in);
		������� ��ü�� �����.
	3.
		�Է¸޽����� ������ְ�
		System.out.print("�޽���");
	4.
		�������� ���� �Լ��� ȣ���ؼ� �Էµ����͸� ������ �ȴ�.
		���ڿ�]		String str = sc.nextLine();
		����]		int no = sc.nextInt();
		�Ǽ�]		double no2 = sc.nextDouble();
		������ �о ������ �����Ѽ� ����ϸ� �ȴ�.
*/
	public static void main(String[] args) {
		// �Էµ��� �غ�
		Scanner sc = new Scanner(System.in);
		// �Է¸޽��� ���
		System.out.print("�̸��Է�: ");
		// �о ������ ����Ű��
		String name = sc.nextLine();
		// ���� �Է� �޽��� ���
		System.out.print("�����Է�: ");
		// �о ������ ����Ű��
		int age = sc.nextInt();
		// ���
		System.out.printf("�̸�: %4s, ����: %3d", name, age);
	
	}

}
