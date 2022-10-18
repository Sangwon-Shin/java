/*
 *  숫자 3개를 입력받아서 가장 큰 수를 출력해주는 프로그램을   
 *  삼항 연산자를 사용해서 작성하세요
 */

package day05_221018;
import java.util.*;
public class Prob01 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("첫번째 수: ");
	    int no1 = sc.nextInt();
	    System.out.println("두번째 수: ");
	    int no2 = sc.nextInt();
	    System.out.println("세번째 수: ");
	    int no3 = sc.nextInt();
	    sc.close();
	    int grNo = no1 < no2 ? (no2 < no3 ? no3 : no2) : (no1 < no3 ? no3 : no1);
	    System.out.printf("입력받은 수는 %d, %d, %d 이고 그 중 가장 큰 수는 %d 이다.\n", no1, no2, no3, grNo);

	}

}
