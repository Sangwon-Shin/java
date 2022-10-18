package day04;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
/* 문제 2]
 * 하나의 숫자를 입력받은 후 그 숫자를 반지름으로 하는 
 * 원의 넓이와 둘레를 출력해주는 프로그램을 작성하세요
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요");
		double rad = sc.nextDouble();
		double area = Math.PI * rad * rad;
		double circf = 2 * Math.PI * rad;
		System.out.println("원의 넓이: " + area);
		System.out.println("원의 둘레: " + circf);
		
		
	}

}
