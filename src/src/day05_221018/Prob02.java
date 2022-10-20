/*
 * 문제 2] 알파벳 문자 하나를 입력받아서 그 문자가 대문자인지 소문자인지 판별해서 출력하고  
 * 소문자이면 대문자로 변환하고 대문자면 소문자로 변환해서 출력하세요
 * 문자열에서 문자 추출하는 방법:
 *      문자열.charAt(위치값)
 * 이 문제의 경우는 하나의 문자만 입력할 예정이므로
 *      문자열.charAt(0)
 * 로 꺼내서 사용하면 된다.
 */

package day05_221018;

import java.util.Scanner;
public class Prob02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("알파벳 한 글자를 입력하세요. qq를 입력하면 종료됩니다.");
			String str = sc.next();
			
			if(str.equals("qq")) {
				sc.close();
				break;
			}
			
			char ch = str.charAt(0);
			char ch2 = ch;
			
			if( ch < 'A' || ('Z' < ch && ch < 'a') || 'z' < ch) {
				System.out.println("알파벳이 아닙니다.");
				break;
			}
			else if( ch <= 'Z' ) {
				ch2 += 'a' - 'A';
			}
			else {
				ch2 -= 'a' - 'A';
			}
			System.out.printf("입력한 알파벳 문자는 %c 이고, 대소문자를 바꾼 문자는 %c 입니다.\n", ch, ch2);
		}
		while(true);
		sc.close();
		
	}
	
	
}

