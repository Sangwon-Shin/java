/*
 	1. 숫자를 더하는 기능의 plus 함수를 제작하세요
 	2. 멤버 변수 no1, no2 가 기억하는 숫자를 더하는 기능의 plus 함수로
 	오버로딩 하세요
 	3. 세 개의 숫자를 입력받아서 더해서 반환해주는 함수를 오버로드
 */

package day14_221031;

public class Test02 {
	int no1, no2;
	public Test02() {
		
	}
	public int plus(int a, int b) {
		return a + b;
	}
	public int plus() {
		return no1 + no2;
	}
	public int plus(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
