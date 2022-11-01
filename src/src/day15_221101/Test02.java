/*
 	다양한 개수의 정수를 입력받아서
 	그 합을 구해주는 함수 getSum 을 제작하고 실행하세요.
 */

package day15_221101;

public class Test02 {

	public Test02() {
		System.out.printf("%d\n", getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.printf("%d\n", getSum(nums));
	}

	public int getSum(int... num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		new Test02();
	}

}
