package day04;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
/* ���� 2]
 * �ϳ��� ���ڸ� �Է¹��� �� �� ���ڸ� ���������� �ϴ� 
 * ���� ���̿� �ѷ��� ������ִ� ���α׷��� �ۼ��ϼ���
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �Է��ϼ���");
		double rad = sc.nextDouble();
		double area = Math.PI * rad * rad;
		double circf = 2 * Math.PI * rad;
		System.out.println("���� ����: " + area);
		System.out.println("���� �ѷ�: " + circf);
		
		
	}

}
