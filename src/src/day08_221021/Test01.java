/*
 * 	구구단을 출력하는데, 4*6이 되면 구구단 출력을 종료하세요.
 * 	반복문으로 처리하세요.
 */
package day08_221021;

public class Test01 {

	public static void main(String[] args) {
		gugu:
		for(int dan = 2; dan < 10; dan++) {
			for(int gop = 1; gop < 10; gop++) {
				/* 레이블을 쓰지 않고 하려면
				if(dan >= 5) break;
				if(dan == 4 && gop == 6) {
					break;
				*/
				// 레이블을 쓰면
				if(dan == 4 && gop == 6) {
					break gugu;
				}
				System.out.println(dan + " \u00D7 " + gop + " = " + (dan * gop));
			}
		}
	}

}
