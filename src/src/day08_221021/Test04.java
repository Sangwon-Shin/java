/* 원의 정보를 기억할 클래스
 * Won 을 제작해서 
 * 반지름을 5 ~ 20 사이의 정수로 랜덤하게 만들어서
 * 원의 반지름, 둘레, 넓이
 * 를 출력하세요
 * 
 */


package day08_221021;

public class Test04 {

	public static void main(String[] args) {
		
		Won w1 = new Won();
		w1.rad = (int)(Math.random() * 16 + 5);
		w1.setAround();
		w1.setArea();
		System.out.println("반지름: " + w1.rad);
		System.out.println("원의 둘레: " + w1.around);
		System.out.println("원의 넓이: " + w1.area);
		
	}

}
