/*
 	1.  다음 두 변수를 기억하는 클래스 Point 를 제작하세요
 		int x, y;
 		
 	2.	생성자를 정의하세요
 		(1) 기본 생성자
 		(2) 두 수를 알려주면 그 수를 x, y 에 기억시켜서 이 클래스의 객체를
 			생성해주는 생성자
 		(3) 두 수를 배열로 알려주면 그 수를 x, y 에 기억시키는 생성자
 		
 	3. 다음 기능을 가진 함수를 추가하세요
 		(1) 입력된 값으로 x의 값을 수정하는 함수 setX
 		(2) 입력된 값으로 y의 값을 수정하는 함수 setY
 		(3) 입력된 두 값으로 x, y 를 수정하는 함수 setXY
 		(4) getters
 		(5) x와 y의 값을 출력해주는 함수 toPrint
 	
 	4. 위 클래스를 사용해서 객체를 만들고 데이터를 채우고 출력하세요.

 */

package day15_221101;

public class Ex02 {

	public Ex02() {
		// 기본생성자로 출력
		System.out.println("기본 생성자로 객체 배열 만들어서 출력");
		int rnum = (int) (Math.random() * 11 + 5);
		Point[] pts = new Point[rnum];
		for (int i = 0; i < pts.length; i++) {
			pts[i] = new Point();
			int x = (int) (Math.random() * 21 - 10);
			int y = (int) (Math.random() * 21 - 10);
			pts[i].setX(x);
			pts[i].setY(y);
			//pts[i].setXy(x, y);
			pts[i].toPrint();
		}

		// 두 수를 생성자에 입력해서 출력
		System.out.println("\n두 수를 입력받는 생성자로 객체 배열 만들어서 출력");
		for (int i = 0; i < pts.length; i++) {
			int x = (int) (Math.random() * 21 - 10);
			int y = (int) (Math.random() * 21 - 10);
			pts[i] = new Point(x, y);
			pts[i].toPrint();
		}

		// 두 수를 배열로 생성자에 입력해서 출력
		System.out.println("\n두 수를 배열로 입력받는 생성자로 객체 배열 만들어서 출력");
		for (int i = 0; i < pts.length; i++) {
			int[] pt = new int[2];
			pt[0] = (int) (Math.random() * 21 - 10);
			pt[1] = (int) (Math.random() * 21 - 10);
			
			pts[i] = new Point(pt);
			pts[i].toPrint();
		}

	}

	public static void main(String[] args) {
		new Ex02();
	}

}
