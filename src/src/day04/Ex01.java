package day04;
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		/*
		 *  문제 1] 두 개의 숫자를 입력받아서 그 숫자를 이용해서
		 *  사각형의 넓이와 삼각형의 넓이를 출력해주는 프로그램을 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 길이를 입력하세요");
		double width = sc.nextDouble();
		System.out.println("높이를 입력하세요");
		double height = sc.nextDouble(); 
		double sq = width * height;
		double tri = width * height * 0.5;
		System.out.println("사각형의 넓이: " + sq);
		System.out.println("사각형의 넓이: " + tri);
	}

}
