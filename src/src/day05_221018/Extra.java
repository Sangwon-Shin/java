/*
 * 	랜덤하게 0~100 사이의 정수를 발생시켜서 그 수를 점수로 갖는 학생의 학점을
 * 	출력해주는 프로그램을 작성하세요
 * 	학점은
 * 			  F < 60
 * 		60 <= D < 70
 * 		70 <= C < 80
 * 		80 <= B < 90
 * 		90 <= A <= 100
 * 	
 * 	3항연산자로 처리하세요	
 */

package day05_221018;

public class Extra {

	public static void main(String[] args) {
		int sc = (int)(Math.random() * 101);
		char grade = (sc < 60) ? 'F' : 
						(sc < 70) ? 'D' :
							(sc < 80) ? 'C' :
								(sc < 90) ? 'B' : 'A';
		System.out.printf("랜덤하게 발생시킨 점수는 %d점이고, 학점은 %c 입니다.", sc, grade);
		
	}
}

