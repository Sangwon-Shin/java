// 배열의 복사
package day10_221025;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 }; // 우변 int[5]로 쓰면 에러
		int[] tmp = arr1;
		tmp[0] = 3;

		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("tmp: " + Arrays.toString(tmp));

	}
}
