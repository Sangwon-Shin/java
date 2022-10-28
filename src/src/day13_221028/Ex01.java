/*
	반지름을 랜덤하게 만들어서 원의 넓이와 둘레를 계산해서 
	출력해주는 프로그램을 작성하세요
	단, 반지름 세팅, 넓이 계산, 둘레 계산, 출력 기능은 
	각각의 함수로 제작해서 하세요 
 */

package day13_221028;

public class Ex01 {
	int rad;
	double around, area;

	public Ex01() {
		rad = (int) (Math.random() * 16 + 5);
		setAround();
		setArea();
		System.out.println("랜덤하게 생성한 반지름: " + rad);
		System.out.println("원의 둘레: " + (Math.floor(getAround() * 100) / 100));
		System.out.println("원의 넓이: " + (Math.floor(getArea() * 100) / 100));
	}

	public static void main(String[] args) {
		new Ex01();
	}

	public void setAround() {
		around = 2 * Math.PI * rad;
	}

	public double getAround() {
		return around;
	}

	public void setArea() {
		area = Math.PI * rad * rad;
	}

	public double getArea() {
		return area;
	}
}
