package day07_221020;

public class Test04 {

	public static void main(String[] args) {
		// 8단 구구단을 출력하세요.
		
		// 단 변수
		int dan = 8;
		// 곱 변수(카운터변수)
		int gop = 1;
		do {
			System.out.println(dan + " \u00d7 " + gop + " = " + (dan * gop));
			gop++; // 카운터변수 증가..
		} while(gop < 10);
	}

}
