/* String array
 원 5개를 기억할 배열을 만들고
 배열에 랜덤하게 반지름을 입력해서
 정보를 출력해주는 프로그램을 작성해보자.
*/

package day08_221021;

public class Test05 {

	public static void main(String[] args) {
		Won[] circle = new Won[5];
		/*
		 *  클래스 타입의 배열 변수를 만들면, 배열만 만들어지고
		 *  요소인 인스턴스는 만들어지지 않은 상태이기 때문에
		 *  인스턴스를 채워야한다.
		 */
		for(int i = 0; i < 5; i++ ) {
			circle[i] = new Won();
			circle[i].rad = (int)(Math.random() * 16 + 5);
			circle[i].setCirc();
			circle[i].setArea();
		}
		for(Won c : circle) {
			System.out.println("반지름: " + c.rad);
			System.out.println("둘레: " + c.circ);
			System.out.println("넓이: " + c.area);
		}
		}
	}


