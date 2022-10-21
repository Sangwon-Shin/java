// Won 클래스를 이용해서 원 10개의 정보를 배열에 담고 
// 반지름에 대한 내림차순으로 출력하세요 

package day08_221021;

public class Test08 {

	public static void main(String[] args) {
		Won[] circ = new Won[10];
		for(int i = 0; i < circ.length; i++) {
			circ[i] = new Won();
			circ[i].rad = (int)(Math.random() * 16 + 5);
			circ[i].setArea();
			circ[i].setCirc();
		}
		
		for(int i = 0; i < circ.length - 1; i++) {
			for(int j = i + 1; j < circ.length; j++) {
				if(circ[i].rad < circ[j].rad) {
					Won tmp = new Won();
					tmp = circ[i];
					circ[i] = circ[j];
					circ[j] = tmp;
				}
				
			}
		}
		
		for(Won w : circ) {
			System.out.printf("반지름 %d 인 원의 둘레는 %f, 넓이는 %f 이다.\n\n", w.rad, w.circ, w.area);
		}
	}

}
