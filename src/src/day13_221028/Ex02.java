/*
 	10개의 원을 기억할 Circle 배열을 입력받아서
 	반지름을 랜덤하게 세팅하고 둘레와 넓이를 계산해서 배열을 완성하고
 	출력해주는 프로그램을 작성하세요
 	단, 각 기능은 함수를 제작해서 처리하세요
 */

package day13_221028;

public class Ex02 {

	public Ex02() {
		int clen = 10;
		Circle[] dongle = new Circle[clen];

		for (int i = 0; i < clen; i++) {
			dongle[i] = new Circle();
			dongle[i].setRad(((int)(Math.random() * 16 + 5)));
			dongle[i].setAround();
			dongle[i].setArea();
			System.out.println("dongle[" + i + "] 의 반지름: " + dongle[i].getRad());
			System.out.println("dongle[" + i + "] 의 둘레: " + (Math.round(dongle[i].getAround() * 100) / 100.));
			System.out.println("dongle[" + i + "] 의 넓이: " + (Math.round(dongle[i].getArea() * 100) / 100.));
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
