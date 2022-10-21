/* Nemo 객체 10개를 배열에 기억시키고
 * 높이의 내림차순으로 정렬해서 출력하는 프로그램을 작성하세요. 
 */

package day08_221021;

public class Test07 {

	public static void main(String[] args) {
		Nemo[] rect = new Nemo[10];
		for(int i = 0; i < rect.length; i++) {
			rect[i] = new Nemo();
			rect[i].width = (int)(Math.random() * 16 + 5);
			rect[i].height = (int)(Math.random() * 16 + 5);
			rect[i].setArea();
			rect[i].setAround();
		}
		for(int i = 0; i < rect.length - 1; i++) {
			for(int j = i + 1; j < rect.length; j++) {
				if(rect[i].height < rect[j].height) {
					Nemo tmp = rect[i];
					rect[i] = rect[j];
					rect[j] = tmp;
				}
				}
			}
		for(Nemo r : rect) {
			System.out.printf("높이 %d, 밑변 %d 인 직사각형의 둘레는 %d, 넓이는 %d 이다.\n\n", r.height, r.width, r.around, r.area);
		}
	}

}
