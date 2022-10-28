/*
 	정수 10개를 기억할 배열을 만들고
 	배열에 랜덤하게 숫자를 세팅하고 정렬해서 출력해주는 프로그램 작성
 	모두 함수로 처리하세요
 */

package day13_221028;

public class Test06 {

	public Test06() {
		int[] arr = getArr();
		desc(arr);
		toPrint(arr);
		System.out.println();
		asc(arr);
		toPrint(arr);
	}

	public static void main(String[] args) {
		new Test06();
	}

	public int[] getArr() {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 90 + 10);
		}
		return nums;
	}
	
	// 내림차순 정렬
	public void desc(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] < nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
	}
	
	// 오름차순 정렬
	public void asc(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
	}
	
	// 출력함수
	public void toPrint(int[] nums) {
		System.out.println();
		System.out.print('|');
		for(int i = 0; i < nums.length; i++) {
			System.out.print(" " + nums[i] + " |");
		}
	}

}
