package day04;

public class Ex03 {

	public static void main(String[] args) {
		/* 54232원을 지불해야 한다.
		 * 우리나라 화폐 단위로 각각 몇개씩 필요한지 계산해서 출력하세요.
		 * (가능한 단위가 큰 화폐를 써야 한다.)
		 */
		 int[] mon = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		 int pay = 54232;
		 int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		 for(int j = 0; j< num.length; j++) {
			 num[j] = pay / mon[j];
			 pay = pay - num[j] * mon[j];
			 if(num[j] != 0) {
				 System.out.println(mon[j]+" 원권 " + num[j] + "개 필요합니다.");
			 }
		 }
	}

}
