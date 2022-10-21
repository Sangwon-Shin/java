// 향상된 for 명령

package day08_221021;

public class Test02 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		// 꺼내서 10을 곱해서 출력
		for(int no : nums) {
			System.out.println(no * 10);
		}
		int[][] num2 = {
				{1, 2, 3, 4, 5},
				{5, 6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
		};
		
		for(int[] n : num2) {
			for(int n2 : n) {
				System.out.print(n2 + ", ");
			}
			System.out.println();
		}
		}
	}


