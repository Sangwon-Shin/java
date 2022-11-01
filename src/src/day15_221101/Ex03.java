/*
 	대문자 10개를 랜덤하게 발생시켜서 배열로 저장 후
 	이 배열을 이용해서 String 객체를 만드세요
 	단, 대문자 배열의 타입은 정수배열 타입으로 한다.
 */

package day15_221101;

public class Ex03 {
	int nchs = 10;
	int[] chs = new int[nchs];
	public Ex03() {
		String UpString = "";
		for(int i = 0; i < chs.length; i++) {
			chs[i] = (int)(Math.random() * ('Z'-'A'+1) + 'A');
			System.out.println(((char) chs[i]));
			UpString += (char) chs[i];
		}
		System.out.print(UpString);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
