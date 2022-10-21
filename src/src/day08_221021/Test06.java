// Nemo 클래스로 사각형 배열 만들고 둘레, 넓이

package day08_221021;

public class Test06 {

	public static void main(String[] args) {
		Nemo[] rect = new Nemo[5];
		for(int i = 0; i < 5; i++) {
			rect[i] = new Nemo();
			rect[i].width = (int)(Math.random() * 16 + 5);
			rect[i].height = (int)(Math.random() * 16 + 5);
			rect[i].setAround();
			rect[i].setArea();
		}
		
		for(Nemo r : rect) {
			System.out.printf("밑변 %d, 높이 %d 인 직사각형의 둘레는 %d, 넓이는 %d 이다.\n", r.width, r.height, r.around, r.area);
		}
		
	}

}
