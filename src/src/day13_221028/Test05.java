/*
 	랜덤하게 가로, 세로 길이를 만들어서
 	사각형의 면적을 출력해주는 프로그램을 작성하세요
 	단, 길이 "반환",
 	면적 계산, 출력 기능은 각각 함수를 만들어서 처리하세요.
 */



package day13_221028;

public class Test05 {
	public Test05() {
		int[] no = getLengths();
		toPrint(no,getArea(no));
	}

	public static void main(String[] args) {
		new Test05();
	}

	public int[] getLengths() {
		int[] nums = new int[2];
		nums[0] = (int)(Math.random() * 16 + 5);
		nums[1] = (int)(Math.random() * 16 + 5);
		return nums;
	}
	
	public int getArea(int[] nums) {
		int area = nums[0] * nums[1];
		return area;
	}
	
	public void toPrint(int[] nums, int area) {
		System.out.printf("가로길이가 %3d\n세로길이가 %3d\n인 직사각형의 넓이는 %4d 입니다.\n", nums[0], nums[1], area);
	}
	
	
	
}
