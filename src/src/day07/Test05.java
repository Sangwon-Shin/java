package day07;

public class Test05 {
/*
	10개의 정수를 기억할 배열에
	랜덤하게 0 ~ 20 까지의 숫자를 만들어서 채워넣고
	합을 구하는데
	만약 0이 발생했으면 합을 구하는 작업을 중지하세요.
 */
	public static void main(String[] args) {
		// 배열 만들고
		int[] nums = new int[10];
		// 배열에 랜덤하게 데이터 채우고
		for(int i = 0 ; i < 10 ; i++ ) {
			nums[i] = (int)(Math.random()*21);
		}
		
		int sum = 0;
		// 1. 변수를 만들어둔다.
		boolean bool =false;
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = nums[i];
			if(no == 0) {
				bool = true;
				break;
			}
			sum = sum + no;
		}
		
		if(bool == true) { // if(bool == true) ==> if(bool) <== bool에 담긴 데이터는  true아니면 false이기 때문에 사용가능
			System.out.println("0 나빠요~~~!");			
		} else {
			System.out.println("sum : " + sum);
		}
	}

}
