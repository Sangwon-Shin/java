/*
 * 숫자 3개를 입력받아서 가장 큰수를 선택해서 출력해주는 프로그램을 if 조건문을 사용해서 구현하세요.
 */

package day06_221019;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 수 중 가장 큰 수를 보여주는 프로그램입니다.");
		System.out.println("첫번째 수를 입력하세요: ");
		double no1 = sc.nextDouble();
		System.out.println("두번째 수를 입력하세요: ");
		double no2 = sc.nextDouble();
		System.out.println("세번째 수를 입력하세요: ");
		double no3 = sc.nextDouble();
		sc.close();
		double max = no1;
		if (max < no2) {
			max = no2;
		}
		if (max < no3) {
			max = no3;
		}
		System.out.printf("입력받은 수는 %f, %f, %f 이고 그 중 가장 큰 수는 %f 이다.\n", no1, no2, no3, max);
	}

}
