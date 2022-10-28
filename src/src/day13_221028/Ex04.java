/*
	nums 배열에 두 자리 정수 10개를 기억시키고
	합을 구하고
	평균을 구해서
	출력해주는 프로그램을 작성하세요
	단,
		배열 세팅, 합 계산, 평균 계산, 출력 기능은 각각의 함수로.
		배열 세팅은 반환값 갖는 함수로.
 */

package day13_221028;

public class Ex04 {
	public Ex04() {
		int[] nums = makeArr(10);
		toPrint(nums,calcAggs(nums));
	}

	public static void main(String[] args) {
		new Ex04();
	}

	public int[] makeArr(int arrLen) {
		int[] nums = new int[arrLen];
		for (int i = 0; i < arrLen; i++) {
			nums[i] = (int) (Math.random() * 90 + 10);
		}
		return nums;
	}

	public double[] calcAggs(int[] arr) {
		double[] agg = new double[2];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = Math.floor(sum * 100) / 100. / arr.length;
		agg[0] = sum;
		agg[1] = avg;
		return agg;
	}

	public void toPrint(int[] arr, double[] agg) {
		System.out.printf("랜덤하게 만든, 길이가 %d 인 배열: \nnums = { ", arr.length);
		for(int i = 0; i < arr.length-1; i++) {
			System.out.printf("%d, ", arr[i]);
		}
		System.out.printf("%d }\n", arr[arr.length-1]);
		System.out.printf("이 배열의 총합: %3.0f\n", agg[0]);
		System.out.printf("이 배열의 평균: %5.1f\n", agg[1]);
	}
}
