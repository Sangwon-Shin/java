package day04;

public class Ex03 {

	public static void main(String[] args) {
		/* 54232���� �����ؾ� �Ѵ�.
		 * �츮���� ȭ�� ������ ���� ��� �ʿ����� ����ؼ� ����ϼ���.
		 * (������ ������ ū ȭ�� ��� �Ѵ�.)
		 */
		 int[] mon = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		 int pay = 54232;
		 int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		 for(int j = 0; j< num.length; j++) {
			 num[j] = pay / mon[j];
			 pay = pay - num[j] * mon[j];
			 if(num[j] != 0) {
				 System.out.println(mon[j]+" ���� " + num[j] + "�� �ʿ��մϴ�.");
			 }
		 }
	}

}
