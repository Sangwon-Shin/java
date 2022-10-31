/*
 	랜덤하게 0이상 2이하 정수를 발생시켜서
 	0: Circle, 1: Samgak, 2: Nemo
 	배열을 만드는데, 개수는 5이상 10이하이다.
 	생성자를 통해서 도형이 객체가 되는 순간 기본세팅이 완료되도록 하고
 	결과를 출력하세요. 모든, 길이 입력값은 5이상 10 이하의 정수로 한다.  
 */
package day14_221031;

public class Ex02 {
	Samgak[] semo;
	Nemo[] nemo;
	Circle[] won;
	
	public Ex02() {
		int rnum = (int)(Math.random() * 6 + 5);
		int shape = (int)(Math.random() * 3);
		switch(shape) {
		case 0:
			setPrintCircles(rnum);
			break;
		case 1:
			setPrintSamgaks(rnum);
			break;
		case 2:
			setPrintNemos(rnum);
			break;
		}
	}
	public void setPrintCircles(int len) {
		won = new Circle[len];
		for(int i = 0; i < len; i++) {
			int rad = (int)(Math.random() * 6 + 5);
			won[i] = new Circle(rad);
			System.out.printf("원 %2d:\n반지름: %2d\t둘레: %4.2f\t넓이: %5.2f\n\n", i+1, won[i].getRad(), won[i].getAround(), won[i].getArea());
		}
	}
	public void setPrintSamgaks(int len) {
		semo = new Samgak[len];
		for(int i = 0; i < len; i++) {
			int width = (int)(Math.random() * 6 + 5);
			int height = (int)(Math.random() * 6 + 5);
			semo[i] = new Samgak(width, height);
			System.out.printf("삼각형 %2d:\n밑변: %2d\t높이: %2d\t넓이: %5.2f\n\n", i+1, semo[i].width, semo[i].height, semo[i].area);
		}
	}
	public void setPrintNemos(int len) {
		nemo = new Nemo[len];
		for(int i = 0; i < len; i++) {
			int width = (int)(Math.random() * 6 + 5);
			int height = (int)(Math.random() * 6 + 5);
			nemo[i] = new Nemo(width, height);
			System.out.printf("사각형 %2d:\n밑변: %2d\t높이: %2d\t넓이: %5.2f\n\n", i+1, nemo[i].getWidth(), nemo[i].getHeight(), nemo[i].getArea());
		}
	}
	public static void main(String[] args) {
		new Ex02();
	}

}
