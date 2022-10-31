/*
 	3 이상 7 이하 랜덤 정수 만들어서 그 정수만큼의 Samgak 객체를 만들어서
 	정보를 출력해주는 프로그램을 작성하세요
 	(배열 안써도 됨)
 */
package day14_221031;

public class Ex01_02 {

	public Ex01_02() {
		int cnt = (int)(Math.random() * 5 + 3);
		for(int i = 0; i < cnt; i++) {
			int width = (int)(Math.random() * 16 + 5);
			int height = (int)(Math.random() * 16 + 5);
			Samgak s = new Samgak(width, height);
			System.out.println(s); // ????????
		}
	}

	public static void main(String[] args) {
		new Ex01_02();
	}

}
