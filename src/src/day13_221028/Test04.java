/*
 	랜덤하게 가로, 세로 길이를 만들어서
 	사각형의 면적을 출력해주는 프로그램을 작성하세요
 	단, 길이 세팅, 면적 계산, 출력 기능은 각각 함수를 만들어서 처리하세요.
 */


package day13_221028;

public class Test04 {
	int garo, sero, area;
	public Test04() {
		setLengths();
		setArea();
		printArea();
	}

	public static void main(String[] args) {
		new Test04();
	}
	
	public void setLengths() {
		garo = (int)(Math.random() * 16 + 5);
		sero = (int)(Math.random() * 16 + 5);
	}
	
	public void setArea() {
		area = garo * sero;
	}
	
	public void printArea() {
		System.out.printf("가로길이가 %3d\n세로길이가 %3d\n인 직사각형의 넓이는 %4d 입니다.\n", garo, sero, area);
	}
}
