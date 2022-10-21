// Rectangle 클래스로 사각형 배열 만들고 둘레, 넓이

package day08_221021;

public class Test06 {

	public static void main(String[] args) {
		Rectangle[] rect = new Rectangle[5];
		for(int i = 0; i < 5; i++) {
			rect[i] = new Rectangle();
			rect[i].width = (int)(Math.random() * 16 + 5);
			rect[i].height = (int)(Math.random() * 16 + 5);
			rect[i].setAround();
			rect[i].setArea();
		}
		
		for(Rectangle r : rect) {
			System.out.printf("밑변 %d, 높이 %d 인 직사각형의 둘레는 %d, 넓이는 %d 이다.\n", r.width, r.height, r.around, r.area);
		}
		
	}

}
