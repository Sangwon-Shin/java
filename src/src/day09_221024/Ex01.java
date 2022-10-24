/*
 * 문제 1]
 * 		'A' 부터 'J'까지의 문자를 랜덤하게 100개를 만든 후
 * 		각각의 문자가 몇개씩 만들어졌는지를 그래프 형태로 출력하는
 * 		프로그램을 작성해서 실행하세요.
 */
package day09_221024;

public class Ex01 {
	public Ex01() {
		int[] chs = new int['J' - 'A' + 1];
		for (int i = 0; i < 100; i++) {
			chs[(int) (Math.random() * ('J' - 'A' + 1))] += 1;
		}
		for (int i = 0; i < chs.length; i++) {
			char x = (char) (i + 'A');
			System.out.print(x);
			System.out.print(": ");
			for (int j = 0; j < chs[i]; j++) {
				System.out.print('\u25a2');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
