package day04;

public class Ex04 {

	public static void main(String[] args) {
/* ���� 4]
 * 1���� 365.2426���̴�. �� �ð��� ��ĥ ��ð� ��� ���ʷ� �̷�����ִ��� ����ؼ� ����ϼ���
 */		
		String msg = "";
		double yrd = 365.2426;
		msg += "1���� " + yrd +"���̰� �̰���"; 
		int day = 3600*24;
		int hr = 3600;
		int min = 60;
		int[] time = {day, hr, min};
		String[] timec = {"��", "�ð�", "��"};
		int[] time_conv = {0, 0, 0};
		double yr = yrd * day;
		for(int j = 0; j < time.length; j++) {
			time_conv[j] = (int) Math.floor(yr / time[j]);
			yr = yr - time_conv[j] * time[j];
			msg += " " + time_conv[j] + timec[j];
		}
		msg += " " + yr + "���̴�.";
		System.out.print(msg);
		
		
	}

}
