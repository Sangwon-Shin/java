package day04;
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		/*
		 *  ���� 1] �� ���� ���ڸ� �Է¹޾Ƽ� �� ���ڸ� �̿��ؼ�
		 *  �簢���� ���̿� �ﰢ���� ���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���̸� �Է��ϼ���");
		double width = sc.nextDouble();
		System.out.println("���̸� �Է��ϼ���");
		double height = sc.nextDouble(); 
		double sq = width * height;
		double tri = width * height * 0.5;
		System.out.println("�簢���� ����: " + sq);
		System.out.println("�簢���� ����: " + tri);
	}

}
